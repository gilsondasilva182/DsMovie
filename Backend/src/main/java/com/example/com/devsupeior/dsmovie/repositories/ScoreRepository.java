package com.example.com.devsupeior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.com.devsupeior.dsmovie.entities.Score;
import com.example.com.devsupeior.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	

}
