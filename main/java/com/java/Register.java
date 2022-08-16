package com.java;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Register {
		@RequestMapping("/register")
		public String getRegister()
		{
			System.out.println("page 2");
			return "register";
		}
}
