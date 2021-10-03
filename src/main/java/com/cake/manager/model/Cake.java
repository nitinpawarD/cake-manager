package com.cake.manager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cakes")
public class Cake {

	private long id;
	private String cakeName;
	private double price;
	private int rating;
	
	public Cake() {
		
	}
	
	public Cake(String cakeName, double price, int rating) {
		this.cakeName = cakeName;
		this.price = price;
		this.rating = rating;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "cake_name", nullable = false)
	public String getCakeName() {
		return cakeName;
	}
	public void setCakeName(String cakeName) {
		this.cakeName = cakeName;
	}
	
	@Column(name = "price", nullable = false)
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Column(name = "rating", nullable = false)
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Cake [id=" + id + ", cakeName=" + cakeName + ", price=" + price + ", rating=" + rating
				+ "]";
	}
	
}
