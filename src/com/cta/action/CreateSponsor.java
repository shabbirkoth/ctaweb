package com.cta.action;

import com.cta.model.Sponsor;
import com.opensymphony.xwork2.ActionSupport;

public class CreateSponsor extends ActionSupport {
	
	private Sponsor sponsor;
	
	public Sponsor getSponsor() {
		return sponsor;
	}

	public void setSponsor(Sponsor sponsor) {
		this.sponsor = sponsor;
	}

	public String execute() throws Exception{
		return "";
	}
	
	

}
