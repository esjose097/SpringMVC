package com.bharath.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bharath.spring.springmvc.dto.Employee;

/**
 * Controlador de objetos
 * Clase encargada de enviar objetos a controlador de UI
 * @author jose casal
 */
@Controller
public class ObjectController {

	@RequestMapping("/readObject")//<-- Se establece la ruta url
	public ModelAndView sendObject() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayObject");
		Employee employee = new Employee();
		employee.setId(1234);
		employee.setName("John");
		employee.setSalary(8000);
		modelAndView.addObject("employee", employee);//Se envia un objeto.

		return modelAndView;
	}
}
