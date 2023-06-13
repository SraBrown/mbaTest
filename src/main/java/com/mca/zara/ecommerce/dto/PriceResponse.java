package com.mca.zara.ecommerce.dto;

import java.time.LocalDateTime;

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
	private LocalDateTime fechaAplicacion;
	private double PrecioFinalAplicar;

}
