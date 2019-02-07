package com.justin.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Index {
	
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/code", method=RequestMethod.POST)
	public String code(@RequestParam(value="code")String code, RedirectAttributes redirectAttributes) {
		if(code.equals("bushido")==true) {
			return "code.jsp";
		}else {
			redirectAttributes.addFlashAttribute("error", "Code Incorrect, Try Again");
			return "redirect:/";
		}
		
	}
	

}
