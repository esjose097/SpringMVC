package com.bharath.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Controlador encargado de manejar "requestParams"
 * @author jose casal
 */
@Controller
public class RequestParamsController {

        /**
         * Este método recibe una petición y atravez de sus atributos o "params" obtiene la información
         * es decir que maneja peticiones de este estilo:
         * "http://localhost:8080/springmvc/showData?id=123&name=john&sal=72.5"
         * @param id <-- Id del usuario
         * @param name <-- Nombre del usuario
         * @param salary <-- Salario del usuario
         * @return Regresa la pagina de "userReg"
         */
	@RequestMapping("/showData")//<-- Se establece la URL
	public ModelAndView showData(@RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam(value="sal",required=false,defaultValue="60") double salary) {
            /*Algo interesante es que en los mismos parametros se valida el método, valores predeterminados,
            si son obligatorios o no, etc.*/

		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
		System.out.println("Salary:" + salary);

		return new ModelAndView("userReg");
	}
}
