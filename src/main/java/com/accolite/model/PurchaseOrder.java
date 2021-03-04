package com.accolite.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PurchaseOrder")
public class PurchaseOrder {
	
	@Id
	private int purchaseId;
	
	@ManyToOne
	@JoinColumn(name = "supplierId", referencedColumnName = "supplierId")
	private Supplier supplierId;
	
	@ManyToMany(mappedBy = "purchaseOrder")
	private List<Product> products;
	
	@Column(name="status", columnDefinition="enum('Not Confirmed', 'Confirmed', 'Shipped', 'Delivered', 'Cancelled')")
	private String purchaseStatus;

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	
	public Supplier getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Supplier supplierId) {
		this.supplierId = supplierId;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public String getPurchaseStatus() {
		return purchaseStatus;
	}

	public void setPurchaseStatus(String purchaseStatus) {
		this.purchaseStatus = purchaseStatus;
	}
	
}
