package com.mca.zara.ecommerce.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mca.zara.ecommerce.dto.PriceRequest;
import com.mca.zara.ecommerce.dto.PriceResponse;
import com.mca.zara.ecommerce.models.Price;
import com.mca.zara.ecommerce.repository.PriceRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PriceService {

	@Autowired
	private PriceRepository priceRepository;

	
	public PriceResponse searchPrice(PriceRequest price) {
	
		Optional<Price> modelsPrice= Optional.of(new Price());
		PriceResponse response=new PriceResponse();
		try {
			
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
			LocalDateTime dateTime=LocalDateTime.parse(price.getFechaAplicacion(),formatter);
			
			log.info("PriceService "+ price.getIdentificadorProducto() + price.getIdentificadorCadena()+price.getFechaAplicacion());

			modelsPrice = Optional.ofNullable(priceRepository.findPriceByBrandIdAndProductIdAndStartDate(price.getIdentificadorCadena(),price.getIdentificadorProducto(),
					dateTime));
			//modelsPrice = priceRepository.findById(price.getIdentificadorCadena());
			if(modelsPrice.isPresent()) {
				response.setFechaAplicacion(modelsPrice.get().getStartDate());
				response.setIdentificadorCadena(modelsPrice.get().getBrandId().intValue());
				response.setIdentificadorProducto(modelsPrice.get().getProductId());
				response.setPrecioFinalAplicar(modelsPrice.get().getPrice());
				
			}
			log.info("PriceService "+ modelsPrice.get().getProductId());
		}catch (Exception e) {
			log.info("PriceService Error "+ e);
		}

		return response;
		
		
	}
	
}
