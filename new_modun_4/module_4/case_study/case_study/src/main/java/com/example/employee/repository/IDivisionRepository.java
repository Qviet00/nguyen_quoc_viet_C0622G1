package com.example.employee.repository;

import com.example.employee.model.Division;
import com.example.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDivisionRepository extends JpaRepository<Division, Integer> {
}
