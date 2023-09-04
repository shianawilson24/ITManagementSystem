package com.taskmanager.ITTaskManagmentSystem.DTO;

import java.util.Date;
import java.util.Objects;

public class TaskDTO {

	private Integer taskId;
	private String Title;
	private String description;
	private Date dueDate;
	private String priority;
	private String status;
	private Integer userId;
	@Override
	public int hashCode() {
		return Objects.hash(Title, description, dueDate, priority, status, taskId, userId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaskDTO other = (TaskDTO) obj;
		return Objects.equals(Title, other.Title) && Objects.equals(description, other.description)
				&& Objects.equals(dueDate, other.dueDate) && Objects.equals(priority, other.priority)
				&& Objects.equals(status, other.status) && Objects.equals(taskId, other.taskId)
				&& Objects.equals(userId, other.userId);
	}
	@Override
	public String toString() {
		return "TaskDTO [taskId=" + taskId + ", Title=" + Title + ", description=" + description + ", dueDate="
				+ dueDate + ", priority=" + priority + ", status=" + status + ", userId=" + userId + "]";
	}
	public Integer getTaskId() {
		return taskId;
	}
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
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
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	
}


