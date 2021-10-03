package com.cake.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cake.manager.model.Cake;

@Repository
public interface CakeRepository extends JpaRepository<Cake, Long>{

}
