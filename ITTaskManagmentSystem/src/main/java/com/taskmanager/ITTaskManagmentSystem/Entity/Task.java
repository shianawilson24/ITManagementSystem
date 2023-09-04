package com.taskmanager.ITTaskManagmentSystem.Entity;

import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "taskId")
	private Integer taskId;
	@Column(name = "title", nullable = false)
	private String title;
	@Column(name = "description")
	private String description;
	@Column(name = "duedate")
	private Date dueDate;
	@Column(name = "priority")
	private String priority;
	@Column(name = "status")
	private String status;
	@Column(name = "userId")
	private Integer userId;
	public Task(Integer taskId, String title, String description, Date dueDate, String priority, String status,
			Integer userId) {
		super();
		this.taskId = taskId;
		this.title = title;
		this.description = description;
		this.dueDate = dueDate;
		this.priority = priority;
		this.status = status;
		this.userId = userId;
	}
	public Task() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(description, dueDate, priority, status, taskId, title, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(description, other.description) && Objects.equals(dueDate, other.dueDate)
				&& Objects.equals(priority, other.priority) && Objects.equals(status, other.status)
				&& Objects.equals(taskId, other.taskId) && Objects.equals(title, other.title)
				&& Objects.equals(userId, other.userId);
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", title=" + title + ", description=" + description + ", dueDate=" + dueDate
				+ ", priority=" + priority + ", status=" + status + ", userId=" + userId + "]";
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer id) {
		this.userId = id;
	}
	
	

}
	
