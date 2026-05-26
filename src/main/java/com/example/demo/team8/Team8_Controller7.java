package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class Team8_Controller7 {
	@GetMapping("/team8_2-1")
	public String index(@ModelAttribute("empForm") Team8_EmpForm2_1 empForm) {
//		System.out.println("indexメソッド実行");
		log.info("[質問画面2-1]getメソッドのinfoログ");
		return "team8/team8_question2-1";
	}
	
	@PostMapping(value = "/team8_2-1", params = "next")
	public String send1(@ModelAttribute("empForm") @Validated Team8_EmpForm2_1 empForm, BindingResult result, Model model) {
		
		if (result.hasErrors()) {
			log.info("[質問画面2-1]postメソッドのinfoログ");
			return "team8/team8_question2-1";
		}
		
		//model.addAttribute("empForm", empForm);
		
		if (empForm.getQuestion2_1().equals("answer1")) {
//			System.out.println(empForm.getQuestion2_1());
			log.info("[質問画面2-1]postメソッドのinfoログ");
			return "redirect:/team8_3-1";
		} else if (empForm.getQuestion2_1().equals("answer2")) {
			log.info("[質問画面2-1]postメソッドのinfoログ");
			return "redirect:/team8_3-2";
		}
		
		return "team8/team8_kekka";
	}
	
	
	@PostMapping(value = "/team8_2-1", params = "back")
	public String send3() {
//		System.out.println("send3実行");
		log.info("[質問画面2-1]postメソッドのinfoログ");
		return "redirect:/team8_1";
	}
}
