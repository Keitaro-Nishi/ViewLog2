package com.example;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.EchoForm;

@RequestMapping("/table")
public class EchoController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewInput(Model model) {

		String name = new String();
		name = "藤本祥";
		//nameList.add("中川淳一");
		//nameList.add("安倍隆弘");

		model.addAttribute("name",name);

		return "table";
	}
}
