package com.taskmanager.ITTaskManagmentSystem.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import com.taskmanager.ITTaskManagmentSystem.Entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
	@Query(value = "SELECT * FROM employee WHERE userId = :userId", nativeQuery = true)
	public User  getAllUserDetails(@Param("userId") Integer userId);
	
	@Query(value = "select * from employee where department=IT", nativeQuery=true)
	public User getITUserDetails(User user);
	@Query(value = "select userId from employee where userId = :userId", nativeQuery=true)
	public User getUserIdForTask(@Param("userId") Integer integer);
    
}
