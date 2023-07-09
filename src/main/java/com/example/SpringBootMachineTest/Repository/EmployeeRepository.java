package com.example.SpringBootMachineTest.Repository;

import com.example.SpringBootMachineTest.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
