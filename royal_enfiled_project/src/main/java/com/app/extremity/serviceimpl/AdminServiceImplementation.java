package com.app.extremity.serviceimpl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.app.extremity.idao.EmployeeDetailsIDao;
import com.app.extremity.iservice.IAdminService;
import com.app.extremity.model.EmailMessage;
import com.app.extremity.model.EmployeeDetails;

@Service
public class AdminServiceImplementation implements IAdminService {

	@Value("${gmail.username}")
	private String username;
	
	@Value("${gmail.password}")
	private String password;

	@Autowired
	EmployeeDetailsIDao employeeDetailsDao;

	static Logger logger = LogManager.getLogger(AdminServiceImplementation.class);

	/* this is path where profile picture will be stored */
	private String UPLOADED_FOLDER = "D:\\Upload\\";
	/*
	 * this method is used to save Employee Details
	 * 
	 * author: Nilesh Tammewar
	 */

	@Override
	public void saveEmployee(EmployeeDetails employeeDetails, MultipartFile profilePic) {

		logger.info("In AdminServiceImplementation  save method");
		try {
			
			byte[] bytes = profilePic.getBytes();
			Path path = Paths.get(UPLOADED_FOLDER + profilePic.getOriginalFilename());
			Files.write(path, bytes);
			employeeDetails.setProfilePictureUrl(UPLOADED_FOLDER + profilePic.getOriginalFilename());
		} catch (IOException e) {
			logger.error("while saving profile picture", e);
			e.printStackTrace();
		}

		employeeDetailsDao.save(employeeDetails);
		logger.info("employee Saved");
	}

	/*
	 * this method is used to send Email to employee With Registration Link
	 * 
	 * author: Nilesh Tammewar
	 */

	@Override
	public void sendEmail(EmailMessage emailmessage, MultipartFile file) {

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		Message msg = new MimeMessage(session);
		try {
			msg.setFrom(new InternetAddress(username, false));

			msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(emailmessage.getTo_address()));

			msg.setSubject(emailmessage.getSubject());
			msg.setContent(emailmessage.getTo_address(), "text/html");
			msg.setSentDate(new Date());
			MimeBodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setContent(emailmessage.getBody(), "text/html");
			if (!file.isEmpty()) {
				System.out.println("the file is not empty");
				byte[] bytes = file.getBytes();
				Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
				Files.write(path, bytes);

				Multipart multipart = new MimeMultipart();
				multipart.addBodyPart(messageBodyPart);
				MimeBodyPart attachPart = new MimeBodyPart();
				attachPart.attachFile(UPLOADED_FOLDER + file.getOriginalFilename());
				String html = "<a href='http://localhost:8080/'>Register here</a>";
				messageBodyPart.setText(html, "UTF-8", "html");
				multipart.addBodyPart(attachPart);
				msg.setContent(multipart);
				// sends the e-mail
			}

			Transport.send(msg);

			logger.info("Email has been send to the employee");

		} catch (MessagingException e) {
			
			logger.error("exception While sending Email");
			e.printStackTrace();
		} catch (IOException e) {
			
			logger.error("file not found exception",e);
			e.printStackTrace();
		}

	}
	
}
