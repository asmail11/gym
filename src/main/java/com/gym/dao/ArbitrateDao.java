package com.gym.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gym.model.Arbitrate;

@Repository
public interface ArbitrateDao extends JpaRepository<Arbitrate, Long> {

}
