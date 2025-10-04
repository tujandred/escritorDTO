package com.tujandred.escritor.generacion.dialogo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "DialogoDTO", description = "DTO que representa un diálogo completo, incluyendo instrucciones, mensajes y parámetros para la generación con IA.")
public class DialogoDTO {
    @Schema(
        description = "Lista de instrucciones para el diálogo",
        type = "array",
        implementation = MensajeDTO.class,
        example = "[{'uuid':'123e4567-e89b-12d3-a456-426614174000','tipo':'INSTRUCCION','texto':'Sigue estas reglas','timeStamp':'2025-10-04T12:34:56.789Z','tipoResultado':'TEXTO'}]"
    )
    private List<MensajeDTO> instrucciones = new ArrayList<>();

    @Schema(
        description = "Lista de mensajes intercambiados en el diálogo",
        type = "array",
        implementation = MensajeDTO.class,
        example = "[{'uuid':'223e4567-e89b-12d3-a456-426614174001','tipo':'MENSAJE','texto':'Hola','timeStamp':'2025-10-04T12:35:00.000Z','tipoResultado':'TEXTO'}]"
    )
    private List<MensajeDTO> mensajes = new ArrayList<>();

    @Schema(
        description = "Parámetros adicionales para el diálogo",
        type = "object",
        example = "{'idioma':'es','nivel':'avanzado'}"
    )
    private Map<String, String> parametros = new HashMap<>();
}
