package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employe;
import com.example.demo.repository.EmployeRepository;

@RestController
@RequestMapping("employes")
public class EmployeController {
	@Autowired
	private EmployeRepository employeRepository;
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/save")
	public void save(@RequestBody Employe employe){
		employeRepository.save(employe);
	}

	@PostMapping("/addUser")
	public void saveUser(@RequestBody User user){
		userRepository.save(user);
	}

	@GetMapping("/all")
	public List<Employe> findAll(){
		return employeRepository.findAll();
	}
}
