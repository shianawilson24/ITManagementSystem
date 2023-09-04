package com.taskmanager.ITTaskManagmentSystem.Validator;

import com.taskmanager.ITTaskManagmentSystem.DTO.TaskDTO;

public class Validator {
	
    public static void validateStatusAndPriority(String status, String priority) {
        if (!ValidStatus(status)) {
            System.out.println("Invalid status: Status must be 'In Progress', 'Closed', or 'Open'");
        }

        if (!ValidPriority(priority)) {
            System.out.print("Invalid priority: Priority must be 'Low', 'Medium', or 'High'.");
        }
    }
	
	public static boolean ValidStatus(String status) {
	
		if(status.equalsIgnoreCase("In Progress") || status.equalsIgnoreCase("Closed") || 
				status.equalsIgnoreCase("Open")) {
			return true;
		}
		return false;
	
	}
	
	public static boolean ValidPriority(String priority) {

		if(priority.equalsIgnoreCase("Low") || priority.equalsIgnoreCase("Medium") || priority.equalsIgnoreCase("High")) {
			return true;
		}
		return false;
		
	}

}
