package com.cg.dao;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.cg.bean.Task;

@FeignClient(name = "ToDoList-service", url = "https://todo-cqrs-service.herokuapp.com")
public interface TaskViewServiceProxy {

	@GetMapping("getTasks")
	public List<Task> getTasks();
}
