package com.javaProgram.Spring.Custome_and_defaultHandling;

import org.springframework.context.ApplicationEvent;

public class WorkEvent_customHandling extends ApplicationEvent{
	

	public WorkEvent_customHandling(Object source) {
		super(source);
		
	}

	@Override
	public String toString() {
		return "Work event occured...";
	}


}
