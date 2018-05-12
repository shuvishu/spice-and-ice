package org.spiceandice.app.model;

public class EventBooking {
	String name;
	String email;
	String date;
	Integer people;
	Boolean isOutdoor;
	String special;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	public EventBooking(String name, String email, String date, Integer people, Boolean isOutdoor, String special) {
		super();
		this.name = name;
		this.email = email;
		this.date = date;
		this.people = people;
		this.isOutdoor = isOutdoor;
		this.special = special;
	}
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getPeople() {
		return people;
	}
	public void setPeople(Integer people) {
		this.people = people;
	}
	public Boolean getIsOutdoor() {
		return isOutdoor;
	}
	public void setIsOutdoor(Boolean isOutdoor) {
		this.isOutdoor = isOutdoor;
	}
	public String getSpecial() {
		return special;
	}
	public void setSpecial(String special) {
		this.special = special;
	}
	
}
