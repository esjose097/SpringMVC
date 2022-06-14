package com.bharath.spring.springmvc.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bharath.spring.springmvc.dto.Employee;

/**
 * Controlador de listas esta es una clase que se encarga de el manejo de
 * colecciones de tipo "List"
 * @author jose casal
 */
@Controller
public class ListController {

	@RequestMapping("/readList") //<-- Se establece la dirección URL
	public ModelAndView sendList() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

                //Se crean multiples objetos de la clase Employee
		Employee employee = new Employee();
		employee.setId(1234);
		employee.setName("John");
		employee.setSalary(8000);

		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("Bharath");
		employee2.setSalary(10000);

		Employee employee3 = new Employee();
		employee3.setId(3);
		employee3.setName("Bob");
		employee3.setSalary(7000);
                //Se crea una arrayList de "Employee" y agrega los empleados previamente declarados
		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
                //Y simplemente se agrega la lista al modelAndView o controlador de vistas
		modelAndView.addObject("employees", employees);

		return modelAndView;
	}
}
