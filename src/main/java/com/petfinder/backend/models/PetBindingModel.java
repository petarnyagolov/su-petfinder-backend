package com.petfinder.backend.models;

import java.util.Date;
import java.util.List;

import com.petfinder.backend.entities.Breed;
import com.petfinder.backend.entities.PetType;
import com.petfinder.backend.entities.Shelter;

public class PetBindingModel {

	private List<Option> options;
	private String status;
	private Contact contact;
	private String age;
	private PetType animal;
	private List<Breed> breeds;
	private String size;
	private List<Photo> photos;
	private String shelterPetId;
	private String name;
	private String sex;
	private String description;
	private Boolean mix;
	private String shelterId;
	private Shelter shelter;

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public PetType getAnimal() {
		return animal;
	}

	public void setAnimal(PetType animal) {
		this.animal = animal;
	}

	public List<Breed> getBreeds() {
		return breeds;
	}

	public void setBreeds(List<Breed> breeds) {
		this.breeds = breeds;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public String getShelterPetId() {
		return shelterPetId;
	}

	public void setShelterPetId(String shelterPetId) {
		this.shelterPetId = shelterPetId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getMix() {
		return mix;
	}

	public void setMix(Boolean mix) {
		this.mix = mix;
	}

	public String getShelterId() {
		return shelterId;
	}

	public void setShelterId(String shelterId) {
		this.shelterId = shelterId;
	}

	public Shelter getShelter() {
		return shelter;
	}

	public void setShelter(Shelter shelter) {
		this.shelter = shelter;
	}

}
