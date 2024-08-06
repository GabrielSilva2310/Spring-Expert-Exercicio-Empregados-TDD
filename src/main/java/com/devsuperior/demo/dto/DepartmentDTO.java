package com.devsuperior.demo.dto;

import com.devsuperior.demo.entities.Department;

public class DepartmentDTO {
	
	private Long id;
	private String name;
	
	public DepartmentDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public DepartmentDTO(Department entity) {
		this.id = entity.id;
		this.name = entity.name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
	

}
