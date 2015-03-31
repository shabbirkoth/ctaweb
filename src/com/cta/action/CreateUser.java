package com.cta.action;

import com.cta.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class CreateUser extends ActionSupport {
	
	private User user;
	
	public User getSponsor() {
		return user;
	}

	public void setSponsor(User user) {
		this.user = user;
	}

	public String execute() {
		System.out.println ("Inside execute");
		return "success";
	}

}
