package com.MECHRONICS.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/home")
    public String home()
    {
		System.out.print("home page called");
		return "home";
	}
	@RequestMapping("/adminhome")
	public String adminhome()
	{
		System.out.print("admin home page called");
		return "home";
	}
}
