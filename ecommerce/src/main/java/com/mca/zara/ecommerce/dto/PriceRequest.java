package com.mca.zara.ecommerce.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class PriceRequest {

	private Date fechaAplicacion;
	private int identificadorProducto;
	private Long identificadorCadena;
	
	
}
