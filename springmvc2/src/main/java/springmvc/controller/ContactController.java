	package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService uservice;
	
	@ModelAttribute 
	public void commonDataForModel(Model m)
	{
		m.addAttribute("Header","Learn Code");
		m.addAttribute("Desc","Home for Programmer");
		System.out.println("adding common data to model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		System.out.println("Creating Form");
		return "contact"; 
	}
	
	@RequestMapping(path="/processform" , method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model)
	{
		if(user.getUserName().isBlank())
		{
			return "redirect:/contact";
		}
		
		System.out.println(user);
		int Id = this.uservice.createUser(user);
		model.addAttribute("msg", "User Created with id"+Id);	
		return "success";
	}
	
	
	// Long Method
	
	
	/*
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(
			@RequestParam("email") String userEmail, 
			@RequestParam(name="username",required = false) String userName, 
			@RequestParam("password") String userPassword,Model model)
	{
		
		User user = new User();
		user.setEmail(userEmail);
		user.setUserName(userName);
		user.setPassword(userPassword);
		
		// Process
		
//		model.addAttribute("name",userName);
//		model.addAttribute("email",userEmail);
//		model.addAttribute("password",userPassword);
		
		model.addAttribute("user",user);
		return "success";
	}
	
	*/
	
	
}
