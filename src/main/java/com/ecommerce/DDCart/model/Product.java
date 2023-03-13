package com.ecommerce.DDCart.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="product")
public class Product {
	
	@Id
	private Integer id;
	
	private String name;
	private String imageUrl;
	private double price;
	private String description;
	
	public Product(Integer id, String name, String imageUrl, double price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.imageUrl = imageUrl;
		this.price = price;
		this.description = description;
	}

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", imageUrl=" + imageUrl + ", price=" + price + ", description="
				+ description + "]";
	}
	
	

}
