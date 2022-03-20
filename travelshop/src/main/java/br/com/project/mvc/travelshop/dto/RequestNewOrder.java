package br.com.project.mvc.travelshop.dto;

import javax.validation.constraints.NotBlank;

import br.com.project.mvc.travelshop.model.Demand;

public class RequestNewOrder {

	@NotBlank
	private String productName;
	
	@NotBlank
	private String productUrl;
	
	@NotBlank
	private String imageUrl;
	
	private String description;



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getProductUrl() {
		return productUrl;
	}



	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}



	public String getImageUrl() {
		return imageUrl;
	}



	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Demand toDemand() {
		Demand demand = new Demand();
		demand.setProductName(productName);
		demand.setProductUrl(productUrl);
		demand.setImageUrl(imageUrl);
		demand.setDescription(description);
		return demand;
	}

}
