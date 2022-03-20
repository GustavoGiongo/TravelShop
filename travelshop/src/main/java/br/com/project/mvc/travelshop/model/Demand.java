package br.com.project.mvc.travelshop.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Demand {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	private String productName;
	private BigDecimal negotiatedValue;
	private LocalDate deliveryDate;
	private String productUrl;
	private String imageUrl;
	private String description;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public BigDecimal getNegotiatedValue() {
		return negotiatedValue;
	}
	public void setNegotiatedValue(BigDecimal negotiatedValue) {
		this.negotiatedValue = negotiatedValue;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public String getProductUrl() {
		return productUrl;
	}
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
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
}
