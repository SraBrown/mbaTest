package com.mca.zara.ecommerce.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mca.zara.ecommerce.dto.PriceRequest;
import com.mca.zara.ecommerce.dto.PriceResponse;
import com.mca.zara.ecommerce.service.PriceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/api/price")
@RequiredArgsConstructor
@Slf4j
public class PriceController {
	
	@Autowired
	private PriceService serviciePrice;
	
	
	@GetMapping(path = "/searchall/{id}")
	private void PriceSearchAll(@PathVariable
			Long id) {
		log.info("api/price/searchall");
	}
	 
	@PostMapping(value = "search", consumes = "application/json", produces = "application/json")
	private ResponseEntity<PriceResponse> PriceSearch(@RequestBody
			PriceRequest requestPrice) {
		log.info("search/{requestPrice}");
		
		PriceResponse respo = serviciePrice.searchPrice(requestPrice);
		return ResponseEntity.ok(respo);
		
	}

}
