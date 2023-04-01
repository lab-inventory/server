package com.inventory.model;
import lombok.Setter;
import lombok.Getter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;

import java.sql.Date;
@Getter
@Setter
@Entity
@Table(name = "Vendor")
public class Vendor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "vendorName")
	private String vendorName;
	@Column(name = "phone")
	private int phone;
	@Column(name = "address")
	private String address;
	@Column(name = "dateAdded")
	private Date dateAdded;
	@Column(name = "country")
	private String country;

	public Vendor(int id, String vendorName, int phone, String address, Date dateAdded, String country) {
		this.id = id;
		this.vendorName = vendorName;
		this.phone = phone;
		this.address = address;
		this.dateAdded = dateAdded;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
