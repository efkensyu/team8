package com.example.demo.team8;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class Team8_ControllerLoop {
	@PostMapping("/team8_kekka")
	public String send(@RequestParam @ModelAttribute("empFormN") String restart, Team8_EmpForm empForm, Team8_EmpFormName empFormN, Model model) {
		try {
			model.addAttribute("restart", restart);
//			System.out.println("sendメソッド実行");
			log.info("[診断結果画面]postメソッドのinfoログ");
			return "redirect:/team8_start";
		} catch(Exception e) {
			log.error("エラー発生");
			return "team8/team8_error";
		}
	}
}
