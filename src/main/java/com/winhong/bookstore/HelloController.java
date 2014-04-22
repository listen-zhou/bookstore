package com.winhong.bookstore;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET, value = "hello")
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!!!哈哈哈");
		return "hello";
	}

	@RequestMapping(method = RequestMethod.GET, value = "sitemesh")
	public String sitemesh(ModelMap model) {
		model.addAttribute("message", "Hello world!!!哈哈哈");
		return "sitemesh/menu";
	}

}