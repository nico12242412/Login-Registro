package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.User;

@Controller
@RequestMapping(path = "/user-view")
public class FormController {

	@GetMapping(value = "userForm")
	public String formulario(Model model) {
		model.addAttribute("userForm", new User());
		return "user-form/user-view";
	}

}
