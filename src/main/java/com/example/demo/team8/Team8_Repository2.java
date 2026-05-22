package com.example.demo.team8;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Team8_Repository2 extends JpaRepository<Team8_Snack, String> {
	public List<Team8_Snack> findById();
}
