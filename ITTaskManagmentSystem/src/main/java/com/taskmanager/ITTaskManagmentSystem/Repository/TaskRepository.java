package com.taskmanager.ITTaskManagmentSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.taskmanager.ITTaskManagmentSystem.Entity.Task;
import com.taskmanager.ITTaskManagmentSystem.Entity.User;

import jakarta.websocket.server.PathParam;



@Repository(value = "taskRepository")
public interface TaskRepository extends JpaRepository<Task, Integer>{
	@Query(value = "select * from task where userId= :userId", nativeQuery = true)
	public List<Task> getAllTaskFromUser(@Param("userId") Integer userId);
	@Query(value = "select * from task", nativeQuery = true)
	public List<Task> getAllTask(Task task);
	@Query (value = "INSERT INTO task (title,description,status,userId,duedate, priority) VALUES (:task)", nativeQuery = true)
	public User addTaskForUser(Task task);
	
	
}