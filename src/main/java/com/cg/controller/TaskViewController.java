package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Task;
import com.cg.dao.TaskViewServiceProxy;

@RestController
@CrossOrigin
public class TaskViewController {

	@Autowired
	TaskViewServiceProxy proxy;

	@GetMapping("getTasks")
	public List<Task> getTasks(){
		return proxy.getTasks();
	}
	
}
