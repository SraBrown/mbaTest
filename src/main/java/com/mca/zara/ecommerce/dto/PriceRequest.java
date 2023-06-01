package com.mca.zara.ecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PriceRequest {

	private String fechaAplicacion;
	private int identificadorProducto;
	private Long identificadorCadena;
	
	
}
