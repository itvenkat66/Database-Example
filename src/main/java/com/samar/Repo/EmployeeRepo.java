package com.samar.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.samar.Entity.Emp;

public interface EmployeeRepo extends JpaRepository<Emp, Integer> {

}
