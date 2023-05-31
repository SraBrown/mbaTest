package com.mca.zara.ecommerce.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mca.zara.ecommerce.dto.PriceRequest;
import com.mca.zara.ecommerce.dto.PriceResponse;
import com.mca.zara.ecommerce.models.Price;
import com.mca.zara.ecommerce.repository.PriceRepository;
import com.mca.zara.ecommerce.service.PriceService;

import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/api/price")
@RequiredArgsConstructor
@Slf4j
public class PriceController {
	
	@Autowired
	private PriceService servicie;
	
	
	@GetMapping(path = "/searchall/{id}")
	private void PriceSearchAll(@PathVariable
			Long id) {
		
		
		log.info("api/price/searchall");
	}
	
	@PostMapping(path = "/search/{requestPrice}")
	private ResponseEntity<PriceRequest> PriceSearch(@RequestBody
			PriceRequest requestPrice) {
		
		servicie.searchPrice(requestPrice);
		
		
		
		log.info("api/price/search");
	}

}
