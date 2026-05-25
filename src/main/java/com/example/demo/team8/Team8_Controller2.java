package com.example.demo.team8;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class Team8_Controller2 {
	private final Team8_Service service;
	
	@GetMapping("/team8_3-3")
	public String index(@ModelAttribute("empForm") Team8_EmpForm3_3 empForm) {
//		System.out.println("getメソッド実行");
		return "team8/team8_question3-3";
	}
	
	
	@PostMapping(value = "/team8_3-3", params = "next")
	public String send1(@ModelAttribute("empForm") @Validated Team8_EmpForm3_3 empForm, BindingResult result, Model model) {
//		System.out.println("send1メソッド実行");
		
		if(result.hasErrors()) {
		return "team8/team8_question3-3";
	}
	
		if(empForm.getQuestion3_3().equals("S5")) {
//			System.out.println(empForm.getQuestion3_3());
			List<Team8_Snack> data = service.findBySnackCd(empForm.getQuestion3_3());
			model.addAttribute("data", data);
			return "team8/team8_kekka";
		}else if(empForm.getQuestion3_3().equals("S6")) {
			List<Team8_Snack> data = service.findBySnackCd(empForm.getQuestion3_3());
			model.addAttribute("data", data);
			return "team8/team8_kekka";
		}
		
		return "team8/team8_kekka";
		}
	
	
	
	@PostMapping(value = "/team8_3-3", params = "back")
	public String send2(@ModelAttribute("empForm") Team8_EmpForm empForm) {
		return "redirect:/team8_2-2";
	}
	
}
