package com.accolite.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	
	@Id
	private int productId;

	private String productName;
	
	private String productOnHand;
	
	private String productAvailable;
	
	private String productOutgoing;
	
	private String productIncoming;
	
	private String productcostPrice;
	
	private String productSellingPrice;

	@ManyToMany
	@JoinTable(
        name = "PurchaseOrder_Product", 
        joinColumns = { @JoinColumn(name = "productId") }, 
        inverseJoinColumns = { @JoinColumn(name = "purchaseId") }
	)
	private List<PurchaseOrder> purchaseOrder;
	
	@ManyToMany
	
	@JoinTable(
        name = "CustomerOrder_Product", 
        joinColumns = { @JoinColumn(name = "productId") }, 
        inverseJoinColumns = { @JoinColumn(name = "customerId") }
    )
	private List<CustomerOrder> customerOrder;
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductOnHand() {
		return productOnHand;
	}

	public void setProductOnHand(String productOnHand) {
		this.productOnHand = productOnHand;
	}

	public String getProductAvailable() {
		return productAvailable;
	}

	public void setProductAvailable(String productAvailable) {
		this.productAvailable = productAvailable;
	}

	public String getProductOutgoing() {
		return productOutgoing;
	}

	public void setProductOutgoing(String productOutgoing) {
		this.productOutgoing = productOutgoing;
	}

	public String getProductIncoming() {
		return productIncoming;
	}

	public void setProductIncoming(String productIncoming) {
		this.productIncoming = productIncoming;
	}

	public String getProductcostPrice() {
		return productcostPrice;
	}

	public void setProductcostPrice(String productcostPrice) {
		this.productcostPrice = productcostPrice;
	}

	public String getProductSellingPrice() {
		return productSellingPrice;
	}

	public void setProductSellingPrice(String productSellingPrice) {
		this.productSellingPrice = productSellingPrice;
	}
	
}
