package com.example.demo.team8;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Team8_EmpForm {
	@NotNull(message = "どちらかを選んでください！")
	private String question1;
	
	@NotBlank
	private String name;
}
