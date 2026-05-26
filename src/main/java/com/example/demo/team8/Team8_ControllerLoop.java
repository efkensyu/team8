package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class Team8_ControllerLoop {
	@PostMapping("/team8_kekka")
	public String send(@ModelAttribute("empFormN") Team8_EmpFormName empFormN) {
		try {
//			System.out.println("sendメソッド実行");
			System.out.println(empFormN.getName());
			log.info("[診断結果画面]postメソッドのinfoログ");
			return "redirect:/team8_start";
		} catch(Exception e) {
			log.error("エラー発生");
			return "team8/team8_error";
		}
	}
}
