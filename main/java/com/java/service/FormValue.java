package com.java.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormValue {
	@RequestMapping("/value")
	public String getValue(@RequestParam("empno") String empno,@RequestParam("name") String name,@RequestParam("pass") String password,@RequestParam("salary") String sal,@RequestParam("design") String designation,Model m)
	{
//		System.out.println(empno);
//		System.out.println(name);
//		System.out.println(password);
//		System.out.println(sal);
//		System.out.println(designation);
		
		
		m.addAttribute("name",name);
		m.addAttribute("designation", designation);
		m.addAttribute("empno", empno);
		m.addAttribute("salary",sal);
		
		return "success";
	}
	@RequestMapping("/exit")
	public String getExit()
	{
		
		
		return "index";
	}
}
