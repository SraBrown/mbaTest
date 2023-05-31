package com.mca.zara.ecommerce.repository;

import java.util.Date;

import org.springframework.data.repository.CrudRepository;

import com.mca.zara.ecommerce.models.Price;

public interface PriceRepository extends CrudRepository<Price, Long> {

	Price findPriceByBrandIdByStartDateByProductId(Long Id,Date date,int productId );
}
