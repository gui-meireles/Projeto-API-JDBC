package br.com.guilherme.springjdbcdemo.controller;

import br.com.guilherme.springjdbcdemo.dao.EmployeeDAO;
import br.com.guilherme.springjdbcdemo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDAO eDAO;

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return eDAO.getAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
         return eDAO.getById(id);
    }

    @PostMapping("/employees")
    public String saveEmployee(@RequestBody Employee employee) {
        return eDAO.save(employee) + " No. of rows saved to the database!";
    }

    @PostMapping("/employees/{id}")
    public String updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
        return eDAO.update(employee, id) + " No. of rows updated to the database";
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployeeById(@PathVariable int id) {
        return eDAO.delete(id) + " No. of rows deleted from the database";
    }
}

