package com.conght.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	@ResponseBody
	public String getHome() {
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("/WEB-INF/webSpring-Servlet.xml");
		return "conght";
	}
}
