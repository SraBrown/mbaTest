package com.mca.zara.ecommerce.repository;

import java.time.LocalDateTime;

import org.springframework.data.repository.CrudRepository;

import com.mca.zara.ecommerce.models.Price;



public interface PriceRepository extends CrudRepository<Price, Long> {

	//Price findPriceByBrandIdByStartDateByProductId(Long brandId,Date startDate,int productId);
	
	Price findPriceByBrandIdAndProductIdAndStartDate(Long brandId,int productId,LocalDateTime startDate);
	
}
