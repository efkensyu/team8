package com.example.demo.team8;

import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class Team8_EmpFormName {
	@NotBlank(message = "名前を入力してください！")
	private String name;
}
