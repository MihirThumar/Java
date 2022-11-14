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
	private UserService us;
	
	@ModelAttribute
	public void commonDataForModel(Model m)
	{
		m.addAttribute("Header","LearnCode");
		m.addAttribute("Desc","Home for Programmer");
		System.out.println("adding Data to Model");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model m)
		{
		
			System.out.println("This is Contact Controller");
			return "contact";
		}
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute("user") User user, Model m)
	{ 
		this.us.createUser(user);
		System.out.println(user);
		return "success";
	}
	
	
	
	
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
