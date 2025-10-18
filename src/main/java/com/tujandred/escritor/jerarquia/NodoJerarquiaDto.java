package com.tujandred.escritor.jerarquia;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tujandred.escritor.CRUD.basicos.ElementoDto;
import com.tujandred.escritor.CRUD.basicos.TipoDatos;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Schema(name = "NodoJerarquiaDto", description = "Nodo de la jerarquía de entidades. Contiene información sobre la entidad, su relación jerárquica y sus hijos.")
public class NodoJerarquiaDto implements Serializable {
    @Schema(description = "Identificador único del nodo", example = "1")
    private Long id;

    @Schema(description = "Nombre del nodo", example = "Capítulo 1")
    private String nombre;

    @Schema(description = "Descripción del nodo", example = "Primer capítulo de la historia")
    private String descripcion;

    @Schema(description = "Descripción adicional del nodo", example = "Contiene la introducción y el desarrollo inicial")
    private String entradaAdicional;

    @Schema(description = "Número de orden dentro de su jerarquía. Si es menor o igual que 0 o null, indica no ordenado", example = "1")
    private Integer orden;

    @Schema(description = "Término de búsqueda asociado", example = "capitulo1")
    private String searchTerm;

    @Schema(description = "Etiqueta del nodo", example = "Capítulo")
    private String etiqueta;

    @Schema(description = "Tipo de datos del nodo", example = "Texto")
    private TipoDatos tipoDatos;

    @Schema(description = "ID del nodo padre", example = "50")
    private Long padreId;

    @Schema(description = "Lista de nodos hijos")
    private List<NodoJerarquiaDto> hijos = new ArrayList<>();

    @Schema(description = "Lista de tipos asociados al nodo")
    private List<String> tipos = new ArrayList<>();

    @Schema(description = "Indica si el nodo puede subir", example = "true")
    private boolean puedeSubir;
    @Schema(description = "Indica si el nodo puede bajar", example = "true")
    private boolean puedeBajar;
    @Schema(description = "Número de propiedades generables asociadas al nodo", example = "5")
    private int numPropsGenerables;
    @Schema(description = "Número de propiedades incompletas asociadas al nodo", example = "2")
    private int numPropsIncompletas;

}
