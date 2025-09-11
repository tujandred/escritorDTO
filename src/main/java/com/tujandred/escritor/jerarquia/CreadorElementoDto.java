package com.tujandred.escritor.jerarquia;

import com.tujandred.escritor.CRUD.basicos.TipoDatos;
import com.tujandred.escritor.CRUD.entidades.proyecto.TipoContenedorTexto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import io.swagger.v3.oas.annotations.media.Schema;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Schema(description = "DTO para la creación de un elemento en la jerarquía. Contiene información relevante para la creación de nodos, incluyendo nombre, tipo, identificador del padre, orden y tipo de contenedor de texto.")
public class CreadorElementoDto implements Serializable {
    @Schema(description = "Nombre del elemento a crear.")
    private String nombre;

    @Schema(description = "Entrada adicional para el elemento.")
    private String entradaAdicional;

    @Schema(description = "Tipo del elemento a crear.")
    private TipoDatos tipo;

    @Schema(description = "Identificador del elemento padre.")
    private Long padreId;

    @Schema(description = "Orden del elemento entre sus hermanos.")
    private Integer orden;

    @Schema(description = "Tipo del elemento padre.")
    private TipoDatos tipoPadre;

    @Schema(description = "Tipo de contenedor de texto asociado, si aplica.")
    private TipoContenedorTexto tipoContenedorTexto = null;
}
