package com.taskmanager.ITTaskManagmentSystem.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanager.ITTaskManagmentSystem.DTO.TaskDTO;
import com.taskmanager.ITTaskManagmentSystem.DTO.UserDTO;
import com.taskmanager.ITTaskManagmentSystem.Entity.Task;
import com.taskmanager.ITTaskManagmentSystem.Entity.User;
import com.taskmanager.ITTaskManagmentSystem.Repository.TaskRepository;
import com.taskmanager.ITTaskManagmentSystem.Repository.UserRepository;
import com.taskmanager.ITTaskManagmentSystem.Validator.Validator;

@Service(value = "taskService")
public class TaskServiceImpl implements TaskService {
	@Autowired
	private TaskRepository repository;
	@Autowired
	private UserRepository userRepository;

	
	public List<TaskDTO> getAllTask(Task task){
	
		List<Task> alltask = repository.getAllTask(task);
		if(alltask.isEmpty()|| alltask == null) {
			// exception
			System.out.println("error found");
			
		}
		List<TaskDTO> taskDtoList = new ArrayList<>();
		for(Task task2: alltask) {
			TaskDTO dto = new TaskDTO();
			dto.setUserId(task2.getUserId());
			dto.setDescription(task2.getDescription());
			dto.setDueDate(task2.getDueDate());
			dto.setPriority(task2.getPriority());
			dto.setStatus(task2.getStatus());
			dto.setTaskId(task2.getTaskId());
			taskDtoList.add(dto);
		}
		
		return taskDtoList;
	}
	public List<TaskDTO> getAllTaskByUser(Integer userId, Task task){
	    List<Task> allTasks = repository.getAllTaskFromUser(userId); 

		    if (allTasks == null || allTasks.isEmpty()) {
		       System.out.println("user not found for"+ userId);
		    }

		    List<TaskDTO> taskDtoList = new ArrayList<>();
		    for (Task task2 : allTasks) {
		        TaskDTO dto = new TaskDTO();
		        dto.setUserId(task2.getUserId());
		        dto.setDescription(task2.getDescription());
		        dto.setDueDate(task2.getDueDate());
		        dto.setPriority(task2.getPriority());
		        dto.setStatus(task2.getStatus());
		        dto.setTaskId(task2.getTaskId());
		        taskDtoList.add(dto);
		    }

		    return taskDtoList;
	}
	public List<TaskDTO> addTask(Task task) {
 
	    Validator.validateStatusAndPriority(task.getStatus(),task.getPriority());
		
		User user2 = new User();
	    User ided = userRepository.getUserIdForTask(user2.getUserId());
	    Integer id = ided.getUserId();
	    if (id == null)
			System.out.println("No user found");
	    
	    
	    Task newTask = new Task();
	    newTask.setTaskId(task.getTaskId()+ 1);
	    newTask.setUserId(id);
	    newTask.setTitle(task.getTitle());
	    newTask.setDescription(task.getDescription());
	    newTask.setDueDate(task.getDueDate());
	    newTask.setPriority(task.getPriority());
	    newTask.setStatus(task.getStatus()); 
	    Task savedTask = repository.save(newTask);

	    List<TaskDTO> taskDtoList = new ArrayList<>();
	    TaskDTO dto = new TaskDTO();
	    dto.setUserId(savedTask.getUserId());
	    dto.setTitle(savedTask.getTitle());
	    dto.setDescription(savedTask.getDescription());
	    dto.setDueDate(savedTask.getDueDate());
	    dto.setPriority(savedTask.getPriority());
	    dto.setStatus(savedTask.getStatus());
	    dto.setTaskId(savedTask.getTaskId());
	    taskDtoList.add(dto);

	    return taskDtoList;
	
		}

	
}
	
	



