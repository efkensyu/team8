package com.example.demo.team8.MariaDBtest;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MariaDBController {
	private final BumonRepository repository;
	
	public  String main(Model model) {
		// TODO 自動生成されたメソッド・スタブ
		@GetMapping("/test08")
		List<Bumon> userDataList = repository.findAll();
		model.addAttribute("userDataList", userDataList);
		return "";
	}

}
