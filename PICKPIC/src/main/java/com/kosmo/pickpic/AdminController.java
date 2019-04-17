package com.kosmo.pickpic;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
	@RequestMapping(value = "/PICKPIC/admin/home.pic")
	public String home(Locale locale, Model model) {
		
		return "admin/admin_index.admin";
	}
	
	@RequestMapping(value = "/PICKPIC/admin/users.pic")
	public String users(Locale locale, Model model) {
		return "admin/admin_users.admin";
	}
	
	@RequestMapping(value = "/PICKPIC/admin/qna.pic")
	public String qna(Locale locale, Model model) {
		return "admin/admin_qna.admin";
	}
	
	@RequestMapping(value = "/PICKPIC/admin/attraction.pic")
	public String attraction(Locale locale, Model model) {
		return "admin/admin_attraction.admin";
	}
}