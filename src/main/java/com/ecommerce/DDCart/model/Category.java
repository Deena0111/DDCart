package com.ecommerce.DDCart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="category")
public class Category {
	@Id
	private Integer id;
	private String categoryName;
	private String description;
	private String imageUrl;
	
	
	public Category(Integer id, String categoryName, String description, String imageUrl) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.description = description;
		this.imageUrl = imageUrl;
	}
	
	


	public Category(String categoryName, String description, String imageUrl) {
		super();
		this.categoryName = categoryName;
		this.description = description;
		this.imageUrl = imageUrl;
	}




	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", description=" + description + ", imageUrl="
				+ imageUrl + "]";
	}
	
	

}
