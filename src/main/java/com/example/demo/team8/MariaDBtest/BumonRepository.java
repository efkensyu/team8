package com.example.demo.team8.MariaDBtest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BumonRepository extends JpaRepository<Bumon, String> {
	
}
