package com.contactweb.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.contactweb.DAO.input_DAO;
import com.contactweb.model.input;

@Controller
public class indexcontroller {
	@Autowired
	input_DAO Idao;
	
	@RequestMapping("option")
	public String option()
	{
		return "option";
	}
	@RequestMapping("back")
	public String back()
	{
		return"option";
	}
	@RequestMapping("addContact")
	public String addContact(input dat)
	{
		Idao.save(dat);
		return "addcontact";
	}
	@RequestMapping("read")
	public String read() {
		return"displaycontact";
	}
	@RequestMapping("displayContact")
	public ModelAndView displayContact(@RequestParam int id)
	{
		ModelAndView mv=new ModelAndView("display");
		input inp = Idao.findById(id).orElse(new input());
		mv.addObject("input23",inp);
		System.out.println(""+inp);
		return mv;
	}
	

}
