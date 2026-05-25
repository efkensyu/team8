package com.example.demo.team8;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class Team8_Service {
private final Team8_Repository2 repository;

	public List<Team8_Snack> findBySnackCd(String snackCd) {
		return repository.findBySnackCd(snackCd);
	}
}
