package com.taskmanager.ITTaskManagmentSystem.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.taskmanager.ITTaskManagmentSystem.DTO.TaskDTO;
import com.taskmanager.ITTaskManagmentSystem.DTO.UserDTO;
import com.taskmanager.ITTaskManagmentSystem.Entity.Task;
import com.taskmanager.ITTaskManagmentSystem.Entity.User;




public interface TaskService {
	 public List<TaskDTO> getAllTask(Task task);
	 public List<TaskDTO> addTask(Task task);
	 public List<TaskDTO> getAllTaskByUser(Integer userId, Task task);
	
	

}
