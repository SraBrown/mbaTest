package com.mca.zara.ecommerce;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.mca.zara.ecommerce.dto.PriceRequest;
import com.mca.zara.ecommerce.dto.PriceResponse;
import com.mca.zara.ecommerce.models.Price;
import com.mca.zara.ecommerce.repository.PriceRepository;
import com.mca.zara.ecommerce.service.PriceService;

@SpringBootTest
class PriceServiceTests {
	
	
	private static final Price priceMock = new Price();
	
	PriceRepository repositoryMock=Mockito.mock(PriceRepository.class);
	
	@Autowired
	PriceService service = new PriceService();
	
	PriceRequest requestFake=new PriceRequest();
	PriceResponse data=new PriceResponse();
	
	@BeforeEach
	void contextLoads() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime dateTime=LocalDateTime.parse("2020-06-14 15:00:00",formatter);
		
		priceMock.setBrandId(Long.valueOf(100));
		priceMock.setProductId(100);
		priceMock.setPrice(2000);
		
		requestFake.setFechaAplicacion("2020-06-14 15:00:00");
		requestFake.setIdentificadorCadena(Long.valueOf(2));
		requestFake.setIdentificadorProducto(35455);
		
		
		Mockito.when(repositoryMock.findPriceByBrandIdAndProductIdAndStartDate(Long.valueOf(requestFake.getIdentificadorCadena()),
				requestFake.getIdentificadorProducto(), dateTime)).thenReturn(priceMock);
		
		data.setIdentificadorCadena(priceMock.getBrandId().intValue());
		data.setIdentificadorProducto(priceMock.getProductId());
		data=service.searchPrice(requestFake);
		
	}

	@Test
	void findPriceBackRequest() {
		Assertions.assertNotNull(data);	
		
	}


	@Test
	void findPriceByBrandIdAndProductIdtest() {
		//data.setIdentificadorCadena(priceMock.getBrandId().intValue());
		//data.setIdentificadorProducto(priceMock.getProductId());
		//data=service.searchPrice(requestFake);
		Assertions.assertEquals(2, data.getIdentificadorCadena());
		
	}
	
	
	

}
