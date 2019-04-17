package com.kosmo.pickpic.service.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PickPicController {
	//서비스 주입]
	
	//로그인 폼으로 이동]
	@RequestMapping("/PickPic/login/Login.bbs")
	public String login() throws Exception{
		return "login/Login.tiles";
	}//login()
	
	@RequestMapping("/PickPic/login/Login2.bbs")
	public String login2() throws Exception{
		return "login/Test";
	}
	
	
	
	
	@RequestMapping("/PickPic/friends/Place.bbs")
	public String Place() throws Exception{
		return "friends/Place.tiles";
	}
	
	
}
