package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Team8_Controller2 {
	@GetMapping("/team8_3_3")
	public String index() {
		System.out.println("getメソッド実行");
		return "team8/team8_3_3";
	}
	
	
	@PostMapping(value = "/team8_3-3", params = "next3_3")
	public String send1(@ModelAttribute("empForm") @Validated Team8_EmpForm3_3 empForm, BindingResult result) {
		System.out.println("send1メソッド実行");
		
		if(result.hasErrors()) {
		return "team8/team8_question3_3";
	}
	
		if(empForm.getQuestion3_3().equals("answer1")) {
			System.out.println(empForm.getQuestion3_3());
			return "team8/team8_kekka";
		}else if(empForm.getQuestion3_3().equals("answer2")) {
			return "team8/team8_kekka";
		}
		
		return "team8/team8_kekka";
		}
	
	
	
	@PostMapping(value = "/team8_3_3", params = "back3_3")
	public String send2() {

		return "team8/team8_question2_2";
	}
	
}
