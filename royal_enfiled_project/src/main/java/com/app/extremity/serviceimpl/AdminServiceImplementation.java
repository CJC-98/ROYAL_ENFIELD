package com.app.extremity.serviceimpl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
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

import com.app.extremity.idao.AccessoriesStockIDao;
import com.app.extremity.idao.AvailableServicingIDao;
import com.app.extremity.idao.BikeModelDao;
import com.app.extremity.idao.BikeOfferIDao;
import com.app.extremity.idao.BikeServicingIDao;
import com.app.extremity.idao.ColorDaoI;
import com.app.extremity.idao.DeadStockIDao;
import com.app.extremity.idao.EmployeeDetailsIDao;
import com.app.extremity.idao.EngineCapacityIDao;
import com.app.extremity.idao.FreeServicingCountIDao;
import com.app.extremity.idao.NewBikeStockIDao;
import com.app.extremity.idao.NotficationIDao;
import com.app.extremity.idao.QuotationIDao;
import com.app.extremity.idao.ServcingBikeInfoIDao;
import com.app.extremity.idao.ServiceInvoiceIDao;
import com.app.extremity.idao.ServicingChartIDao;
import com.app.extremity.idao.SoldOldBikeStockIDao;
import com.app.extremity.idao.StateIDao;
import com.app.extremity.idao.TestDriveCustomerIDao;
import com.app.extremity.iservice.IAdminService;
import com.app.extremity.model.AccessoriesStock;
import com.app.extremity.model.AvailableServicing;
import com.app.extremity.model.BikeModel;
import com.app.extremity.model.BikeOffer;
import com.app.extremity.model.BikeServicing;
import com.app.extremity.model.Color;
import com.app.extremity.model.DeadStock;
import com.app.extremity.model.EmailMessage;
import com.app.extremity.model.EmployeeDetails;
import com.app.extremity.model.EngineCapacity;
import com.app.extremity.model.FreeServicingCount;
import com.app.extremity.model.NewBikeStock;
import com.app.extremity.model.Notfication;
import com.app.extremity.model.Quotation;
import com.app.extremity.model.ServcingBikeInfo;
import com.app.extremity.model.ServicingChart;
import com.app.extremity.model.ServicingInvoice;
import com.app.extremity.model.SoldBikeStock;
import com.app.extremity.model.SoldOldBikeStock;
import com.app.extremity.model.State;
import com.app.extremity.model.TestDriveCustomer;

@Service
public  class AdminServiceImplementation implements IAdminService {

	private String adminEmailUsername;

	private String adminEmailPassword;

	@Autowired
	EmployeeDetailsIDao employeeDetailsDao;
	
	@Autowired
	AvailableServicingIDao AvailableServicingIDao;
	
	@Autowired
	ColorDaoI bikecolorDao;
	
	@Autowired
	BikeServicingIDao bikeservicing;
	
	@Autowired
	NewBikeStockIDao newBikeStockIDao;
	
	@Autowired
	BikeModelDao bikeModelIDao;
	
	@Autowired
	 BikeOfferIDao bikeOfferIDao;
	
	@Autowired
	TestDriveCustomerIDao testDriveCustomerIDao;
	
	@Autowired
    SoldOldBikeStockIDao soldOldBikeStockIDao;
	
	@Autowired
	ServiceInvoiceIDao serviceInvoiceIDao;
	
	@Autowired
	ServicingChartIDao servicingChartIDao;
	
	@Autowired
	ServcingBikeInfoIDao servcingBikeInfoIDao;
	
	@Autowired
	QuotationIDao quotationIDao;
	
	@Autowired
	NotficationIDao notficationIDao;

	@Autowired
	StateIDao stateIDao;

	@Autowired
	FreeServicingCountIDao freeServicingCountIDao;
	
	@Autowired
	EngineCapacityIDao engineCapacityIDao;
	
	@Autowired
	AccessoriesStockIDao accessoriesStockIDao;
	
	@Autowired
	DeadStockIDao deadStockIDao;
	
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
				attachPart.attachFile((File) file);
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

	
	@Override
	public List<Color> getcolor() {
		// TODO Auto-generated method stub
		
		return (List<Color>) bikecolorDao.findAll() ;
	}

	@Override
	public List<AvailableServicing> getAvailableServicing() {
		// TODO Auto-generated method stub
		return (List<AvailableServicing>) AvailableServicingIDao.findAll();
	}

	@Override
	public List<BikeServicing> getBikeServicing() {
		// TODO Auto-generated method stub
		return (List<BikeServicing>) bikeservicing.findAll() ;
	}

	@Override
	public List<NewBikeStock> getNewBikeStock() {
	
		return (List<NewBikeStock>) newBikeStockIDao.findAll();
	}

	@Override
	public List<BikeModel> getBikeModel() {
		
		return (List<BikeModel>) bikeModelIDao.findAll();
	}

	@Override
	public List<BikeOffer> getBikeOffer() {
		
		return (List<BikeOffer>) bikeOfferIDao.findAll();
	}

	@Override
	public List<TestDriveCustomer> getTestDriveCustomer() {
	
		return (List<TestDriveCustomer>) testDriveCustomerIDao.findAll();
	}

	@Override
	public List<SoldOldBikeStock> getSoldOldBikeStock() {
		// TODO Auto-generated method stub
		return (List<SoldOldBikeStock>) soldOldBikeStockIDao.findAll();
	}

	@Override
	public List<ServicingInvoice> getServicingInvoice() {
		// TODO Auto-generated method stub
		return (List<ServicingInvoice>) serviceInvoiceIDao.findAll();
	}

	@Override
	public List<ServicingChart> getServicingChart() {
		// TODO Auto-generated method stub
		return (List<ServicingChart>) servicingChartIDao.findAll();
	}

	@Override
	public List<ServcingBikeInfo> getServcingBikeInfo() {
		
		return (List<ServcingBikeInfo>) servcingBikeInfoIDao.findAll();
	}

	@Override
	public List<Quotation> getQuotation() {
		
		return (List<Quotation>) quotationIDao.findAll();
	}

	@Override
	public List<Notfication> getNotfication() {
        
		return (List<Notfication>) notficationIDao.findAll();
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
	public List<State> getState() {
		
		return (List<State>) stateIDao.findAll();
	}

	@Override
	public List<FreeServicingCount> getFreeServicing() {
		
		return (List<FreeServicingCount>) freeServicingCountIDao.findAll();
	}

	@Override
	public List<EngineCapacity> getEngineCapacity() {
		
		return (List<EngineCapacity>) engineCapacityIDao.findAll();
	}

	@Override
	public List<AccessoriesStock> getAccessoriesStock() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DeadStock> getDeadStock() {
		
		return (List<DeadStock>) deadStockIDao.findAll();
	}

	/*@Override
	public List<AccessoriesStock> getAccessoriesStock() {

		return (List<AccessoriesStock>) accessoriesStockIDao.findAll();
	}*/

	

}
