package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class Team8_Controller1 {
	@GetMapping("/team8_start")
	public String index() throws Throwable {
//		System.out.println("getメソッド実行");
		try {
			log.info("[スタート画面]getメソッドのinfoログ");
			return "team8/team8_start";
		} catch(Exception e) {
			return "team8/team8_error";
		}
		
	}
	
	@PostMapping(value = "/team8_start", params = "next")
	public String send1(@ModelAttribute("empForm") Team8_EmpForm empForm) {
//		System.out.println("send1メソッド実行");
//		model.addAttribute("empForm", new Team8_EmpForm1());
		log.info("[スタート画面]postメソッドのinfoログ");
		return "redirect:/team8_1";
	}
	
	//質問画面１
	@GetMapping("/team8_1")
	public String index1(@ModelAttribute("empForm") Team8_EmpForm empForm) {
		log.info("[質問画面1]getメソッドのinfoログ");
		return "team8/team8_question1";
	}
	
	@PostMapping(value = "/team8_1", params = "next")
	public String send2(@ModelAttribute("empForm") @Validated Team8_EmpForm empForm, BindingResult result) {
//		System.out.println("send2メソッド実行");
//		System.out.println(empForm.getQuestion1());
		
		if(result.hasErrors()) {
			log.info("[質問画面1]postメソッドのinfoログ");
			return "team8/team8_question1";
		}
		
		if(empForm.getQuestion1().equals("answer1")) {
//			System.out.println(empForm.getQuestion1());
			log.info("[質問画面1]postメソッドのinfoログ");
			return "redirect:/team8_2-1";
		}else if(empForm.getQuestion1().equals("answer2")) {
//			System.out.println(empForm.getQuestion1());
			log.info("[質問画面1]postメソッドのinfoログ");
			return "redirect:/team8_2-2";
		}
		
		return "team8/team8_question1";
		}
	
	@PostMapping(value = "/team8_1", params = "back")
	public String send3() {
//		System.out.println("send3メソッド実行");
		log.info("[質問画面1]postメソッドのinfoログ");
		return "team8/team8_start";
	}
	
}
