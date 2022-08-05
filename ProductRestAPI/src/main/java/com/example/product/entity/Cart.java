package com.example.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	// auto_increment
	@Column(name="srno")
	private Integer srno;
	
	@Column(name="productid")
	private Integer productId;
	
	@Column(name="quantity")
	private Integer quantity;
	
	public Cart() {
		
	}

	public Cart(Integer srno, Integer productId, Integer quantity) {
		this.srno = srno;
		this.productId = productId;
		this.quantity = quantity;
	}

	public Integer getSrNo() {
		return srno;
	}

	public void setSrNo(Integer srno) {
		this.srno = srno;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
