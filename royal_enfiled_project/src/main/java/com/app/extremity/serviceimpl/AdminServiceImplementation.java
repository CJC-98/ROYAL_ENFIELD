package com.app.extremity.serviceimpl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
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
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.extremity.idao.AccessoriesDeadStockIDao;
import com.app.extremity.idao.AccessoriesStockIDao;
import com.app.extremity.idao.BikeOfferIDao;
import com.app.extremity.idao.CustomizationInvoiceIDao;
import com.app.extremity.idao.DeadStockIDao;
import com.app.extremity.idao.EmployeeDetailsIDao;
import com.app.extremity.idao.NewBikeStockIDao;
import com.app.extremity.idao.OldBikeStockIDao;
import com.app.extremity.idao.ServcingBikeInfoIDao;
import com.app.extremity.idao.SoldNewBikeIDao;
import com.app.extremity.idao.SoldOldBikeStockIDao;
import com.app.extremity.idao.TestDriveCustomerIDao;
import com.app.extremity.iservice.IAdminService;
import com.app.extremity.model.AccessoriesDeadStock;
import com.app.extremity.model.AccessoriesStock;
import com.app.extremity.model.BikeOffer;
import com.app.extremity.model.CustomizationInvoice;
import com.app.extremity.model.DeadStock;
import com.app.extremity.model.EmailMessage;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.NewBikeStock;
import com.app.extremity.model.OldBikeStock;
import com.app.extremity.model.ServcingBikeInfo;
import com.app.extremity.model.SoldBikeStock;
import com.app.extremity.model.TestDriveCustomer;

@Service
public class AdminServiceImplementation implements IAdminService {

	private String adminEmailUsername;

	private String adminEmailPassword;

	@Autowired
	EmployeeDetailsIDao employeeDetailsDao;
	@Autowired
	NewBikeStockIDao newBikeStockIDao;
	@Autowired
	OldBikeStockIDao oldBikeStockIDao;
	@Autowired
	SoldOldBikeStockIDao soldOldBikeStockDao;
	@Autowired
	AccessoriesStockIDao accessoriesStockIDao;
	@Autowired
	DeadStockIDao deadStockIDao;
	@Autowired
	AccessoriesDeadStockIDao accessoriesDeadStockIDao;
	@Autowired
	BikeOfferIDao bikeOfferIDao;
	@Autowired
	CustomizationInvoiceIDao customizationInvoiceIDao;
	@Autowired
	ServcingBikeInfoIDao servcingBikeInfoIDao;
	@Autowired
	TestDriveCustomerIDao testDriveCustomerIDao;
	@Autowired
	SoldNewBikeIDao soldNewBikeIDao;

	static Logger logger = LogManager.getLogger(AdminServiceImplementation.class);

	/* this is path where profile picture will be stored */
	protected static String UPLOADED_FOLDER;

	/*
	 * static block to create EmployeeProfilePicture
	 * 
	 * Author: Nilesh Tammewar
	 * 
	 */

	static {
		UPLOADED_FOLDER = System.getProperty("user.dir") + "\\src\\main\\webapp\\Resources\\images\\";
		File dir = new File(UPLOADED_FOLDER + File.separatorChar + "EmployeeProfilePicture");
		try {
			if (!dir.isDirectory()) {
				dir.mkdirs();
			}
			UPLOADED_FOLDER = UPLOADED_FOLDER + File.separatorChar + dir.getName() + File.separatorChar;
		} catch (Exception e) {
			logger.error("error creating upload directory");
		}

	}

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
			employeeDetails.setProfilePictureUrl(profilePic.getOriginalFilename());
		} catch (IOException e) {
			logger.error("while saving profile picture", e);
			e.printStackTrace();
		}

		employeeDetailsDao.save(employeeDetails);
		logger.info("employee Saved", employeeDetails);
		logger.info(UPLOADED_FOLDER.toString());
		logger.info("message", UPLOADED_FOLDER);
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
				return new PasswordAuthentication(adminEmailUsername, adminEmailPassword);
			}
		});

		Message msg = new MimeMessage(session);
		try {
			getAdminCredentials();
			msg.setFrom(new InternetAddress(adminEmailUsername, false));

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
				String html = "<a href='http://localhost:8080/employeeRegistration'>Register here</a>";
				messageBodyPart.setText(html, "UTF-8", "html");
				multipart.addBodyPart(attachPart);
				msg.setContent(multipart);
				// sends the e-mail
			}

			Transport.send(msg);

			logger.info("Email has been send to the employee", emailmessage);

		} catch (MessagingException e) {

			logger.error("exception While sending Email", e);
			e.printStackTrace();

		} catch (IOException e) {

			logger.error("file not found exception", e);
			e.printStackTrace();
		}

	}

	private void getAdminCredentials() {
		try {

			EmployeeDetails employeeDetails = employeeDetailsDao.findOneByEmployeeDesignation("Admin");
			adminEmailUsername = employeeDetails.getEmployeeEmail();
			adminEmailPassword = employeeDetails.getEmployeePassword();
		} catch (Exception e) {
			logger.info("exception while getting user creadentials");
			logger.error("admin Credentials", e);
			logger.info(adminEmailPassword.toString());
			logger.info(adminEmailUsername.toString());
		}
	}

	@Override
	public EmployeeDetails getEmployeeDetailsByName(String employeeName) {
		return employeeDetailsDao.findOneByEmployeeName(employeeName);
	}

	@Override
	public List<NewBikeStock> getNewBikeStock() {

		return (List<NewBikeStock>) newBikeStockIDao.findAll();
	}

	@Override
	public List<OldBikeStock> getOldBikeStock() {

		return (List<OldBikeStock>) oldBikeStockIDao.findAll();
	}

	@Override
	public List<AccessoriesStock> getAccessoriesStock() {
		
		return (List<AccessoriesStock>) accessoriesStockIDao.findAll();
	}

	@Override
	public List<DeadStock> getDeadStock() {

		return (List<DeadStock>) deadStockIDao.findAll();
	}

	@Override
	public List<AccessoriesDeadStock> getAccessoriesDeadStock() {

		return (List<AccessoriesDeadStock>) accessoriesDeadStockIDao.findAll();
	}

	@Override
	public List<EmployeeDetails> getEmployeelist() {

		return null;
	}

	@Override
	public List<BikeOffer> getBikeOffer() {

		return (List<BikeOffer>) bikeOfferIDao.findAll();
	}

	@Override
	public List<CustomizationInvoice> getCustomizationInvoice() {
		
		return (List<CustomizationInvoice>) customizationInvoiceIDao.findAll();
	}

	@Override
	public List<ServcingBikeInfo> getServcingBikeInfo() {
		
		return (List<ServcingBikeInfo>) servcingBikeInfoIDao.findAll();
	}

	@Override
	public List<TestDriveCustomer> getTestDriveCustomer() {
	
		return (List<TestDriveCustomer>) testDriveCustomerIDao.findAll();
	}

	@Override
	public List<SoldBikeStock> getNewBikeSaleByDate(Date date) {
		
		
		return (List<SoldBikeStock>) soldNewBikeIDao.findAllBySoldbikedate(date);
		
		
	}

	@Override
	public List<EmployeeDetails> deleteById(String employeeId) {
		employeeDetailsDao.deleteById(employeeId);
		return (List<EmployeeDetails>) employeeDetailsDao.findAll();
	}

	/*@Override
	public EmployeeDetails findOneByEmployeeId(String employeeId) {
		
		return employeeDetailsDao.deleteAll(employeeId);
	}
*/
}
