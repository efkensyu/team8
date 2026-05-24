package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Team8_Controller1 {
	@GetMapping("/team8_start")
	public String index() {
		System.out.println("getメソッド実行");
		return "team8/team8_start";
	}
	
	
	@PostMapping(value = "/team8_start", params = "next")
	public String send1(@ModelAttribute("empForm") Team8_EmpForm empForm) {
		System.out.println("send1メソッド実行");
//		model.addAttribute("empForm", new Team8_EmpForm1());
		return "team8/team8_question1";
	}
	
	
	@PostMapping(value = "/team8_1", params = "next")
	public String send2(@ModelAttribute("empForm") @Validated Team8_EmpForm empForm, BindingResult result) {
		System.out.println("send2メソッド実行");
		System.out.println(empForm.getQuestion1());
		
		if(result.hasErrors()) {
			return "team8/team8_question1";
		}
		
		if(empForm.getQuestion1().equals("answer1")) {
			System.out.println(empForm.getQuestion1());
			return "team8/team8_question2-1";
		}else if(empForm.getQuestion1().equals("answer2")) {
			System.out.println(empForm.getQuestion1());
			return "team8/team8_question2-2";
		}
		
		return "team8/team8_question2-2";
		}
	
	
	
	
	@PostMapping(value = "/team8_1", params = "back")
	public String send3() {
		System.out.println("send3メソッド実行");
		return "team8/team8_start";
	}
	
}
