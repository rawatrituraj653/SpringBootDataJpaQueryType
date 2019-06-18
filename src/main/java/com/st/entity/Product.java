package com.st.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class Product {

	@NonNull @Id
	private Integer prodId;
	@NonNull private String prodName;
	@NonNull private String prodModel;
	@NonNull private String prodVendor;
	@NonNull private Double prodCost;
}
