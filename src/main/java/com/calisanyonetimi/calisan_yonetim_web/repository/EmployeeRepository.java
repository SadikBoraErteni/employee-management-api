package com.calisanyonetimi.calisan_yonetim_web.repository;

import com.calisanyonetimi.calisan_yonetim_web.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}