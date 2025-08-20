package com.tujandred.escritor.CRUD.basicos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.Instant;
import java.util.Map;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Schema(name = "GenerableDto", description = "DTO base para entidades generables. Contiene información común como identificador, nombre, descripciones, fechas y atributos adicionales.")
public class GenerableDto implements Serializable {
    @Schema(description = "El identificador del registro. Nulo al crear", example = "123")
    @JsonPropertyDescription("El identificador del registro. Nulo al crear")
    private Long id;

    @Schema(description = "El nombre del registro", example = "Mi entidad")
    @JsonPropertyDescription("El nombre del registro")
    private String nombre;

    @Schema(description = "La descripción corta del registro", example = "Descripción breve")
    @JsonPropertyDescription("La descripción corta del registro")
    private String descripcion;

    @Schema(description = "La descripción larga del registro", example = "Descripción detallada de la entidad")
    @JsonPropertyDescription("La descripción larga del registro")
    private String descripcionLarga;

    @Schema(description = "Entrada adicional para la generación del registro", example = "Texto adicional")
    @JsonPropertyDescription("Entrada adicional para la generación del registro")
    private String entradaAdicional;

    @Schema(description = "Atributos adicionales del registro en formato clave-valor", example = "{\"clave\":\"valor\"}")
    @JsonPropertyDescription("Atributos adicionales del registro en formato clave-valor")
    private Map<String, Object> atributos;

    @Schema(description = "La cadena de búsqueda. Generada automáticamente (no hace falta rellenar)", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("La cadena de búsqueda. Generada automáticamente (no hace falta rellenar)")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String searchTerm;

    @Schema(description = "Fecha de creación del registro", type = "string", format = "date-time", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Fecha de creación del registro")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Instant fechaCreacion;

    @Schema(description = "Fecha de última actualización del registro", type = "string", format = "date-time", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Fecha de última actualización del registro")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Instant fechaActualizacion;

    @Schema(description = "Fecha de vectorización del registro", type = "string", format = "date-time", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Fecha de vectorización del registro")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Instant fechaVectorizacion;

    @Schema(description = "Etiqueta del registro (no hace falta rellenar)", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Etiqueta del registro (no hace falta rellenar)")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String etiqueta;

    @Schema(description = "Tipo de datos del registro (no hace falta rellenar)", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Tipo de datos del registro (no hace falta rellenar)")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String tipoDatos;

    @Schema(description = "Identificador del universo al que pertenece el registro (no hace falta rellenar, puede ser nulo)", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Identificador del universo al que pertenece el registro (no hace falta rellenar, puede ser nulo)")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long universoRaizId;

    @Schema(description = "Identificador del padre del registro (no hace falta rellenar, puede ser nulo)", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Identificador del padre del registro (no hace falta rellenar, puede ser nulo)")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private Long padreId;

    @Schema(description = "Tipo de datos del padre del registro (no hace falta rellenar, puede ser nulo)", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Tipo de datos del padre del registro (no hace falta rellenar, puede ser nulo)")
    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String tipoPadre;

}