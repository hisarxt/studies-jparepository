package com.artxrz.jpa_repository.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.artxrz.jpa_repository.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	// Consulta usando JpaSQL
	@Query("SELECT obj FROM User obj WHERE obj.salary >= :minSalary AND obj.salary <= :maxSalary")
	Page<User> searchSalary(Double minSalary, Double maxSalary, Pageable pageable);
	
	// Mesma consulta usando somente o FrameWork
	Page<User> findBySalaryBetween(Double minSalary, Double maxSalary, Pageable pageable);
	
	// Consulta por nome usando JpaSQL
	@Query("SELECT obj FROM User obj WHERE LOWER(obj.name) LIKE LOWER(CONCAT('%',:name,'%'))")
	Page<User> searchName(String name, Pageable pageable);

	// Mesma consulta usando somente o framework
	Page<User> findByNameContainingIgnoreCase(String name, Pageable pageable);

}
