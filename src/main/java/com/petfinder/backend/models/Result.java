package com.petfinder.backend.models;

public class Result {

	private Object	petfinder;

	private Boolean	status;

	public Result() {

		super();
		this.setStatus(true);
	}

	public Result(Object petfinder, Boolean status) {

		super();
		this.petfinder = petfinder;
		this.status = status;
	}

	public Result(Boolean status) {

		super();
		this.status = status;
	}

	public Result(Object petfinder) {

		super();
		this.petfinder = petfinder;
		this.setStatus(true);
	}

	public Object getPetFinder() {

		return petfinder;
	}

	public void setPetfinder(Object petfinder) {

		this.petfinder = petfinder;
	}

	public Boolean getStatus() {

		return status;
	}

	public void setStatus(Boolean status) {

		this.status = status;
	}

}
