package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import lombok.extern.slf4j.Slf4j;

@SessionAttributes({"empFormN", "empForm"})
@Slf4j
@Controller
public class Team8_Controller1 {
	//意図的にエラーを起こすメソッド
	public void causeError() throws RuntimeException {
		throw new RuntimeException();
	}
	
	@ModelAttribute("empFormN")
	public Team8_EmpFormName setUpEmpFormN() {
		return new Team8_EmpFormName();
	}
	@ModelAttribute("empForm")
	public Team8_EmpForm setUpEmpForm() {
		return new Team8_EmpForm();
	}
	
	@GetMapping("/team8_start")
	public String index(@ModelAttribute("empFormN") Team8_EmpFormName empFormN) {
//		System.out.println("getメソッド実行");
		
		try {
			//エラーを起こす(エラーログを試す)
			//causeError();
			log.info("[スタート画面]getメソッドのinfoログ");
			return "team8/team8_start";
		} catch(Exception e) {
			log.error("エラー発生", e);
			return "team8/team8_error";
		}
	}
	
	@PostMapping(value = "/team8_start", params = "next")
	public String send1(@ModelAttribute("empFormN") @Validated Team8_EmpFormName empFormN, BindingResult result) {
//		System.out.println("send1メソッド実行");
		
		try {
			if(result.hasErrors()) {
				log.info("[スタート画面1]postメソッドのinfoログ");
				return "team8/team8_start";
			}
			log.info("[スタート画面]postメソッドのinfoログ");
			return "redirect:/team8_1";
		} catch(Exception e) {
			log.error("エラー発生", e);
			return "team8/team8_error";
		}
	}
	
	//質問画面１
	@GetMapping("/team8_1")
	public String index1(@ModelAttribute("empForm1") Team8_EmpForm empForm, Team8_EmpFormName empFormN) {
		
		try {
			log.info("[質問画面1]getメソッドのinfoログ");
			return "team8/team8_question1";
		} catch(Exception e) {
			log.error("エラー発生", e);
			return "team8/team8_error";
		}
	}
	
	@PostMapping(value = "/team8_1", params = "next")
	public String send2(@ModelAttribute("empForm1") @Validated Team8_EmpForm empForm, BindingResult result) {
//		System.out.println("send2メソッド実行");
//		System.out.println(empForm.getQuestion1());
		
		try {
			
			//causeError();
			
			if(result.hasErrors()) {
				log.info("[質問画面1]postメソッドのinfoログ");
				return "team8/team8_question1";
			}
			
			if(empForm.getQuestion1().equals("answer1")) {
//				System.out.println(empForm.getQuestion1());
				log.info("[質問画面1]postメソッドのinfoログ");
				return "redirect:/team8_2-1";
			}else if(empForm.getQuestion1().equals("answer2")) {
//				System.out.println(empForm.getQuestion1());
				log.info("[質問画面1]postメソッドのinfoログ");
				return "redirect:/team8_2-2";
			}
		} catch(Exception e) {
			log.error("エラー発生", e);
			}
			return "team8/team8_error";
		}
	
	@PostMapping(value = "/team8_1", params = "back")
	public String send3() {
		
		try {
//			System.out.println("send3メソッド実行");
			log.info("[質問画面1]postメソッドのinfoログ");
			return "redirect:/team8_start";

		} catch(Exception e) {
			log.error("エラー発生", e);
			}
			return "team8/team8_error";
		}
}
