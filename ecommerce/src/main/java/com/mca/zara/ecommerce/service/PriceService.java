package com.mca.zara.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mca.zara.ecommerce.dto.PriceRequest;
import com.mca.zara.ecommerce.dto.PriceResponse;
import com.mca.zara.ecommerce.models.Price;
import com.mca.zara.ecommerce.repository.PriceRepository;

public class PriceService {

	@Autowired
	private PriceRepository priceRepository;
	@Autowired
	private Price modelsPrice;
	
	public PriceResponse searchPrice(PriceRequest price) {
		Price modelsPrice;
		PriceResponse response=new PriceResponse();
	
		modelsPrice =   priceRepository.findPriceByBrandIdByStartDateByProductId(price.getIdentificadorCadena(),
				price.getFechaAplicacion(),price.getIdentificadorProducto() );
		
		response.setIdentificadorCadena(modelsPrice);
	}
	
}
