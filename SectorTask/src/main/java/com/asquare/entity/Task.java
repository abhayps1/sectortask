package com.asquare.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Task {

	@Id
	@Column(name = "taskId")
	private Integer id;

	@Column(name = "taskTitle")
	private String title;

	@Column(name = "Priority")
	private String priority;

	@Column(name = "task")
	private String description;

	@Column(name = "Done/Not")
	private Boolean status;

	public Task() {
		super();
	}

	public Task(Integer id, String title, String priority, String description, Boolean status) {
		super();
		this.id = id;
		this.title = title;
		this.priority = priority;
		this.description = description;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", priority=" + priority + ", description=" + description
				+ ", status=" + status + "]";
	}

}
