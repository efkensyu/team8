package com.example.demo.team8;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface Team8_RankingRepository extends JpaRepository<Team8_Ranking, String>{
	@Query(value = "select s.snack_nm, count(*) from team8_ranking_tbl r "
			+ "join team8_snack_tbl s on r.snack_cd = s.snack_cd "
			+ "group by r.snack_cd order by count(*) desc limit 3", nativeQuery = true)
	public List<Object[]> getRanking();
}
