package com.te.springmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {
	
	@GetMapping("/cookiesPage")
	public String getCookie() {
		return "cookiePage";
	}
	
	public String name(HttpServletResponse response,ModelMap map) {
		Cookie cookie=new Cookie("EmpName","sindhu");
		response.addCookie(cookie);
		map.addAttribute("msg","created");
		return null;
		
	}

}
