package com.mca.zara.ecommerce;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import com.mca.zara.ecommerce.dto.PriceResponse;
import com.mca.zara.ecommerce.models.Price;
import com.mca.zara.ecommerce.repository.PriceRepository;
import com.mca.zara.ecommerce.service.PriceService;

@SpringBootTest
class EcommerceApplicationTests {
	
	
	private static final Price priceMock = new Price();
	
	PriceRepository repositoryMock=Mockito.mock(PriceRepository.class);
	
	@Mock
	Optional<Price> modelsPrice;
	@Mock
	PriceService service;
	
	@BeforeEach
	void contextLoads() {
		priceMock.setBrandId(Long.valueOf(100));
		priceMock.setProductId(100);
		priceMock.setBrandId(Long.valueOf(1));
	}
	
	@Test
	void test1() {
		PriceResponse responseDto=new PriceResponse();
				responseDto.setIdentificadorProducto(35455);
		responseDto.setIdentificadorCadena(1);
		responseDto.setFechaAplicacion("2020-06-14 15:00:00");
		Mockito.when(repositoryMock.findPriceByBrandIdAndProductIdAndStartDate(Long.valueOf(responseDto.getIdentificadorCadena()),
				responseDto.getIdentificadorProducto(), responseDto.getFechaAplicacion())).thenReturn(priceMock);
		
	}

}
