package com.taskmanager.ITTaskManagmentSystem.Employee;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanager.ITTaskManagmentSystem.DTO.TaskDTO;
import com.taskmanager.ITTaskManagmentSystem.Entity.Task;
import com.taskmanager.ITTaskManagmentSystem.Entity.User;
import com.taskmanager.ITTaskManagmentSystem.Service.TaskService;

import jakarta.validation.Valid;

@RestController
@Validated
@CrossOrigin
public class ManagementController {
	
	@Autowired
	private TaskService service;
	

	@GetMapping(value = "/employee")
	public ResponseEntity<List<TaskDTO>> getAllEmployeesTask(Task task)throws Exception{
		List<TaskDTO> emps = service.getAllTask(task);
		return new ResponseEntity<>(emps, HttpStatus.OK);
		
	}
	@GetMapping(value = "/task/userId/{userId}")
	public ResponseEntity<List<TaskDTO>> getAllEmployeesTaskByUserId(@PathVariable("userId") Integer userId, Task task)throws Exception{
	
		List<TaskDTO> emps = service.getAllTaskByUser(userId,task);
		return new ResponseEntity<>(emps, HttpStatus.OK);
		
	}
	
	@PostMapping(value ="/task")
	public ResponseEntity<List<TaskDTO>> addTask(@Valid @RequestBody Task task)throws Exception{
		
		List<TaskDTO> emps = service.addTask(task);
		return new ResponseEntity<>(emps, HttpStatus.OK);
		
	}

}
