package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Team8_Controller1 {
	@GetMapping("/team8_1")
	public String index() {
		System.out.println("getメソッド実行");
		return "team8/team8_start";
	}
	
	
	@PostMapping(value = "/team8_1", params = "next")
	public String send1() {
		System.out.println("send1メソッド実行");
		return "team8/team8_question1";
	}
	
//	
//	@PostMapping(value = "/team8_1", params = "next1")
//	public String send2(@ModelAttribute("empForm") @Validated Team8_EmpFormTemplate empForm, BindingResult result) {
//		System.out.println("send2メソッド実行");
//		if(question1.equals("answer1")) {
//			return "team8/team8_question2-1";
//		}
//		
//		return "team8/team8_question2-2";
//		
//	}
	
	@PostMapping(value = "/team8_1", params = "next1")
	public String send3(@RequestParam String question2_1) {
		if(question2_1.equals("answer1")) {
			return "team8/team8_question3-1";
		}
		return "team8/team8_question3-2";
	}
	
	@PostMapping(value = "/team8_1", params = "next")
	public String send4(@RequestParam String question2_2) {
		if(question2_2.equals("answer1")) {
			return "team8/team8_question3-3";
		}
		return "team8/team8_question3-4";
	}
	
	@PostMapping(value = "/team8_1", params = "back1")
	public String send5() {

		return "team8/team8_start";
	}
	
}
