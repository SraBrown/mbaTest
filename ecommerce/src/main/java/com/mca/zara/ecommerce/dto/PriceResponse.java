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
public class PriceResponse {
	
	private int identificadorProducto;
	private int identificadorCadena;
	private int tarifaAplicar;
	private Date fechaAplicacion;
	private int PrecioFinalAplicar;

}
