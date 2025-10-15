package com.tujandred.escritor.generacion.dialogo.SolicitudesGeneracion;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "InstruccionPropiedad", description = "Instrucciones para la generación de una propiedad específica.")
public class InstruccionPropiedad {
    private String nombreCampo;
    private String significado;
    private int longitud = 100;
}
