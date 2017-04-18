package it.infocamere.reactdemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
public class ReactController {
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(HttpServletRequest request, HttpServletResponse response, Model model) {
		try {
			

			return "react";
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return "";
	}
	
	
	@RequestMapping(value = "/popup", method = RequestMethod.GET)
	public String popup(HttpServletRequest request, HttpServletResponse response, Model model) {
		try {
			

			return "messagePopup";
		} catch (Exception exc) {
			exc.printStackTrace();
		}
		return "";
	}
	
	
}
