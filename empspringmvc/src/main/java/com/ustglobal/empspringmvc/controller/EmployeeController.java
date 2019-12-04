package com.ustglobal.empspringmvc.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.empspringmvc.dto.EmployeeBean;
import com.ustglobal.empspringmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor = new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login";
	}//end of loginPage

	@PostMapping("/login")
	public String login(int id, String password, HttpServletRequest request) {
		EmployeeBean bean = service.login(id, password);

		if(bean == null) {
			request.setAttribute("msg", "Invalid Credentials");
			return "login";
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("bean", bean);
			return "home";
		}
	}//end of login


	@GetMapping("/register")
	public String registerPage() {
		return "register";

	}//end of registerPage

	@PostMapping("/register")
	public String register(EmployeeBean bean, ModelMap map) {

		int check = service.register(bean);

		if (check > 0) {
			map.addAttribute("msg", "You Are Registered and id is " +check);
		} else {
			map.addAttribute("msg", "Email is repeated");
		}
		return "login";
	}//end of register

	@GetMapping("/home")
	public String home(ModelMap map, @SessionAttribute(name = "bean", required= false) EmployeeBean bean) {

		if(bean==null) {
			map.addAttribute("msg", "Login First!!!!");
			return "login";
		} else {
			return "home";
		}
	}//end of home

	@PostMapping("/home")
	public String home() {

		return "home";

	}//end of home()

	@GetMapping("/search")
	public String search(@RequestParam("id")int id, ModelMap map) {

		EmployeeBean bean = service.searchEmployee(id);

		if(bean == null) {

			map.addAttribute("msg", "Data Not Found");


		} else {

			map.addAttribute("bean", bean);
		}
		return "home";

	}//end of search()

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "login";

	}//end of logout()


	@GetMapping("/delete")
	public String deleteProfile(HttpSession session) {
		EmployeeBean bean = (EmployeeBean)session.getAttribute("bean");

		try {
			service.deleteEmployee(bean.getId());

		} catch (Exception e) {
			e.printStackTrace();
		}
		session.invalidate();
		return "login";
	}//end of deleteProfile

	@GetMapping("/changepassword")
	public String changePassword(HttpServletRequest request) {

		HttpSession session = request.getSession(false);
		if(session != null) {
			return "changepassword";
		} else {
			return "login";
		}

	}//end of changePassword()

	@PostMapping("/changepassword")
	public String changepassword(String password, String confirmpassword, 
			@SessionAttribute(name ="bean")EmployeeBean bean, ModelMap map) {

		if(password.equals(confirmpassword)) {
			service.changePassword(bean.getId(), password);
			map.addAttribute("msg", "Password changed ");
		}else {
			map.addAttribute("msg", "Password Not Matching");
		}
		return "home";
	}//end of changepassword()


	@GetMapping("/update")
	public String updateProfile(HttpServletRequest request) {
		HttpSession session = request.getSession();

		if(session != null) {
			return "update";
		} else {
			return "home";
		}
	}//end of updateProfile()

	@PostMapping("/update")
	public String updateprofile(String name, String email, String gender, 
			@SessionAttribute(name ="bean")EmployeeBean bean, ModelMap map, HttpServletRequest req) {
		HttpSession session = req.getSession();

		if(session!=null) {

			bean.setName(name);
			bean.setEmail(email);
			bean.setGender(gender);
			service.updateEmployee(bean);
			map.addAttribute("msg", "Profile Updated");
			return "home";
		}else {
			map.addAttribute("msg", "Something went wrong");
			return "home";
		}
		

	}//end of updateprofile()


}//end of EmployeeController
