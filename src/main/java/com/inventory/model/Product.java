package com.inventory.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String pid;
	private double price;
	private double unit;
	private long quantity;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cid", nullable = false)
	private Category category;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bid", nullable = true)
	private Brand brand;
	private String added;
	private Date date;

	public Product() {
		super();
	}

	public Product(int id, String name, String pid, double price, double unit, long quantity, Category category, Brand brand, String added, Date date) {
		this.id = id;
		this.name = name;
		this.pid = pid;
		this.price = price;
		this.unit = unit;
		this.quantity = quantity;
		this.category = category;
		this.brand = brand;
		this.added = added;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getUnit() {
		return unit;
	}

	public void setUnit(double unit) {
		this.unit = unit;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getAdded() {
		return added;
	}

	public void setAdded(String added) {
		this.added = added;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
