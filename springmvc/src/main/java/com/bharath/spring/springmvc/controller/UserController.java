package com.bharath.spring.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bharath.spring.springmvc.dto.User;

/**
 * Controlador de usuarios encargado de registros de usuarios, teoricamente deberia encargarse de todo
 * lo que tenga que ver con la entidad "User" pero bueno.
 * @author jose casal
 */
@Controller
public class UserController {

    /**
     * Muestra la pag jsp
     * @return 
     */
	@RequestMapping("registrationPage")//Se establece el url
	public String showRegistrationPage() {
		return "userReg";
	}

        /**
         * Registra un usuario
         * @param user <-- Uusario a registrar
         * @param model <-- No tengo idea
         * @return 
         */
	@RequestMapping(value = "registerUser", method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap model) {
		System.out.println(user);
                //Se guarda el usuario en el model
		model.addAttribute("user", user);
		return "regResult";
	}

}
