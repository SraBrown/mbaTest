package com.mca.zara.ecommerce.models;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Price {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BRAND_ID")
	private Long brandId;
	@Column(name = "START_DATE")
	private Timestamp startDate;
	@Column(name = "END_DATE")
	private Timestamp endDate;
	@Column(name = "PRICE_LIST")
	private String pricelist;
	@Column(name = "PRODUCT_ID")
	private int productId;
	@Column(name = "PRIORITY")
	private Long priority;
	@Column(name = "PRICE")
	private double price;
	@Column(name = "CURR")
	private String curr;
	

}
