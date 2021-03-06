package com.app.extremity.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.extremity.iservice.AService;
import com.app.extremity.iservice.IAdminService;
import com.app.extremity.iservice.IHomeService;
import com.app.extremity.iservice.NotificationInterface;
import com.app.extremity.model.Notfication;
import com.app.extremity.serviceimpl.BikeSaleServiceImpl;

@Controller
@RequestMapping("/")
public class HomeController {
	@Autowired
	NotificationInterface notificationInterface;

	HttpSession session;

	@Autowired
	IHomeService homeService;
	@Autowired
	BikeSaleServiceImpl bikeSaleServiceImpl;
	static Logger logger = LogManager.getLogger(HomeController.class);
	@Autowired
	IAdminService adminService;

	@RequestMapping(value = "/")
	public String homePage() {
		logger.info("In home controller log");
		return "home";
	}

	@RequestMapping(value = "/loginPage")
	public String loginPage() {
		logger.info("In login controller log");

		return "login";
	}

	/*
	 * this method will check login credentials
	 * 
	 * Author: Nilesh Tammewar
	 */

	@RequestMapping(value = "/SignIn")
	public String signIn(Model model, @RequestParam String email, @RequestParam String password,
			HttpServletRequest request) {

		logger.info("In SignIn controller log");
		int i = homeService.checkLoginCredentials(email, password, request);
		session = request.getSession();

		switch (i) {
		case 1:
			model.addAttribute("link", "adminDashboard.jsp");
			return "Admin/adminIndex";
		case 2:
			long tscount = bikeSaleServiceImpl.getAllBikeSaleForUserCount();

			model.addAttribute("totalServiceCount", tscount);
			long account = bikeSaleServiceImpl.getAllOldBikeStockCount();
			model.addAttribute("approvedCustomizationCount", account);
			long tccount = bikeSaleServiceImpl.getAllDeadStockCount();
			model.addAttribute("totalCustomizationCount", tccount);

			long tscount1 = bikeSaleServiceImpl.getAllSoldBikeSaleForUSerCount();
			model.addAttribute("totalServiceCount1", tscount);
			long account2 = bikeSaleServiceImpl.getAllSoldOldBikeCount();
			model.addAttribute("approvedCustomizationCount2", account);
			long tccount3 = bikeSaleServiceImpl.getAllCompanyOrderBikeCount();
			model.addAttribute("totalCustomizationCount3", tccount);
			
			model.addAttribute("link", "salesManagerDashboard.jsp");
			return "SalesManager/salesManagerIndex";
		case 3:
			// get service count
			
			/*
			 * model.addAttribute("approvedServiceCount",
			 * serviceManagerInterface.getAllServiceCountByServiceStatus(
			 * "waiting")); model.addAttribute("inProgerssServices",
			 * serviceManagerInterface.getAllServiceCountByServiceStatus(
			 * "in-progress")); model.addAttribute("completedservices",
			 * serviceManagerInterface.getAllServiceCountByServiceStatus("done")
			 * ); model.addAttribute("totalServiceCount",
			 * serviceManagerInterface.getAllServiceCount());
			 * 
			 * //get customization count
			 * model.addAttribute("approvedCustomizationCount",
			 * serviceManagerInterface.
			 * getAllCustomizationCountByCustomizationStatus("waiting"));
			 * model.addAttribute("inProgerssCustomization",
			 * serviceManagerInterface.
			 * getAllCustomizationCountByCustomizationStatus("in-progress"));
			 * model.addAttribute("completedCustomization",
			 * serviceManagerInterface.
			 * getAllCustomizationCountByCustomizationStatus("done")); //get
			 * short notification list model.addAttribute("inboxCount",
			 * notificationInterface.getInboxCount(session.getAttribute(
			 * "currentUserName").toString(), false));
			 * model.addAttribute("shortInboxList",
			 * notificationInterface.getMyNotReadedInboxNotfication(session.
			 * getAttribute("currentUserName").toString(), false));
			 */
			model.addAttribute("link", "serviceManagerDashboard.jsp");
			return "ServiceManager/serviceManagerIndex";
		case 4:
			Date fd = null;
			Date ld = null;
			Date fds = null;
			Date lds = null;
			try {
				fd = new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01");
				ld = new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-31");
				fds = new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01");
				lds = new SimpleDateFormat("yyyy-MM-dd").parse("2018-12-31");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			long inboxCount = notificationInterface.getInboxCount(session.getAttribute("currentUserName").toString(), false);
			model.addAttribute("inboxCount", inboxCount);
			
			List<Notfication> shortInboxList = notificationInterface.getMyNotReadedInboxNotfication(session.getAttribute("currentUserName").toString(), false);
			model.addAttribute("shortInboxList", shortInboxList);
			

			long lg = AService.NewBikeCount(fd, ld);
			model.addAttribute("lg", lg);

			long lg1 = AService.SoldBikeCount(fds, lds);
			model.addAttribute("lg1", lg1);
			
		

			
			model.addAttribute("link", "accountsDashboard.jsp");
			return "Accounts/accountsIndex";
		default:
			model.addAttribute("msg", "Wrong Credentials");
			return "login";
		}

	}

	@RequestMapping(value = "/gotToColorOptionPage")
	public String gotToColorOptionPage() {

		System.out.println("In gotToColorOptionPage controller");
		return "IndivisualUser/indivisualUserIndex";
	}

	@RequestMapping(value = "/admin")
	public String admin() {
		System.out.println("In admin controller");
		return "adminDashboard/adminIndex";
	}

	@RequestMapping(value = "/client")
	public String client() {
		System.out.println("In client controller");
		return "";
	}

	@RequestMapping(value = "/dealer")
	public String dealer() {
		System.out.println("In dealer controller");
		return "";
	}
	//Author:manoj joshi
	@RequestMapping(value = "/sales")
	public String sales(Model model) {

		long tscount = bikeSaleServiceImpl.getAllBikeSaleForUserCount();

		model.addAttribute("totalServiceCount", tscount);
		long account = bikeSaleServiceImpl.getAllOldBikeStockCount();
		model.addAttribute("approvedCustomizationCount", account);
		long tccount = bikeSaleServiceImpl.getAllDeadStockCount();
		model.addAttribute("totalCustomizationCount", tccount);

		long tscount1 = bikeSaleServiceImpl.getAllSoldBikeSaleForUSerCount();
		model.addAttribute("totalServiceCount1", tscount);
		long account2 = bikeSaleServiceImpl.getAllSoldOldBikeCount();
		model.addAttribute("approvedCustomizationCount2", account);
		long tccount3 = bikeSaleServiceImpl.getAllCompanyOrderBikeCount();
		model.addAttribute("totalCustomizationCount3", tccount);
		model.addAttribute("link", "salesManagerDashboard.jsp");
		return "SalesManager/salesManagerIndex";

	}

	@RequestMapping(value = "/service")
	public String service() {
		System.out.println("In service controller");
		return "";
	}
}
