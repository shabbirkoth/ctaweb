package com.cta.model;

public class Password {
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPasswordDigest() {
		return passwordDigest;
	}
	public void setPasswordDigest(String passwordDigest) {
		this.passwordDigest = passwordDigest;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isHasAutoGen() {
		return hasAutoGen;
	}
	public void setHasAutoGen(boolean hasAutoGen) {
		this.hasAutoGen = hasAutoGen;
	}
	public String getKeyLocation() {
		return keyLocation;
	}
	public void setKeyLocation(String keyLocation) {
		this.keyLocation = keyLocation;
	}
	public String getSecreatQuestion() {
		return secreatQuestion;
	}
	public void setSecreatQuestion(String secreatQuestion) {
		this.secreatQuestion = secreatQuestion;
	}
	public String getSecreatAnswer() {
		return secreatAnswer;
	}
	public void setSecreatAnswer(String secreatAnswer) {
		this.secreatAnswer = secreatAnswer;
	}
	private int userId;
	private String passwordDigest;
	private String password;
	private boolean hasAutoGen;
	private String keyLocation;
	private String secreatQuestion;
	private String secreatAnswer;
	
}
