package com.ecom.spring.datajpa.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "product")
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	@Column(name = "name")
    private  String name;
	@Column(name = "price")
    private String price;
	@Column(name = "details")
    private String details;
	@Column(name = "image")
    private String image;

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
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public Product(String name,String price,String details,String image) {
		this.name = name;
		this.price = price;
		this.details = details;
		this.image = image;

		
	}
    public Product() {
		
	}
    @Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", price=" + price + ", details=" + details + ",image=" +image +"]";
	}
	
}
