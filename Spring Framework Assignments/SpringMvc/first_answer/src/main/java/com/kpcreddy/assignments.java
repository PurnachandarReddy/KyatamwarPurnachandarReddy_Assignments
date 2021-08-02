package com.kpcreddy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
	public class assignments {
	
		@RequestMapping("/Control")
		public String Control()
		{
			return "helloWorld.jsp";
		}


	}
