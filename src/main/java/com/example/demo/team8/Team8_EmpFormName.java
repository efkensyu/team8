package com.example.demo.team8;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import lombok.Data;

@Data
public class Team8_EmpFormName {
	@NotBlank(message = "名前を入力してください！")
	@Size(min = 1, max = 10, message = "1文字以上10文字以下でおねがいします！")
	private String name;
}
