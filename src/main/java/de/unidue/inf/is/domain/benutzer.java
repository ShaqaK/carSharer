package de.unidue.inf.is.domain;


public class benutzer {
	
	
	public benutzer() {};
	/* CREATE TABLE benutzer (
	bid SMALLINT NOT NULL GENERATED ALWAYS AS IDENTITY,
	name VARCHAR(50) NOT NULL,
  	email VARCHAR(50) NOT NULL UNIQUE,
  	PRIMARY KEY (bid)
);*/
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}

	private int bid;
	private String name;
	private String email;
	

}
