package com.departament.userdepto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class user {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id; //Definir a variavel como ID
	private String name;
	private String email;
	
	@ManyToOne //Definir o tipo de relação (Muitos para um, no caso)
	@JoinColumn(name = "department_id") //Definir o nome da chave extrangeira
	private Department department;
	
	public user() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	

}
