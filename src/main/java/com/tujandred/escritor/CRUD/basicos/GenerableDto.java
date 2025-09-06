package com.tujandred.escritor.CRUD.basicos;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
    private Map<String, Object> atributos = new HashMap<>();

    @Schema(description = "La cadena de búsqueda. Generada automáticamente (no hace falta rellenar)", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("La cadena de búsqueda. Generada automáticamente (no hace falta rellenar)")
    private String searchTerm;

    @Schema(description = "Fecha de creación del registro", type = "string", format = "date-time", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Fecha de creación del registro")
    private Instant fechaCreacion;

    @Schema(description = "Fecha de última actualización del registro", type = "string", format = "date-time", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Fecha de última actualización del registro")
    private Instant fechaActualizacion;

    @Schema(description = "Fecha de vectorización del registro", type = "string", format = "date-time", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Fecha de vectorización del registro")
    private Instant fechaVectorizacion;

    @Schema(description = "Etiqueta del registro (no hace falta rellenar)", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Etiqueta del registro (no hace falta rellenar)")
    private String etiqueta;

    @Schema(description = "Tipo de datos del registro (no hace falta rellenar)", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Tipo de datos del registro (no hace falta rellenar)")
    private TipoDatos tipoDatos;

    @Schema(description = "Identificador del universo al que pertenece el registro (no hace falta rellenar, puede ser nulo)", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Identificador del universo al que pertenece el registro (no hace falta rellenar, puede ser nulo)")
    private Long universoRaizId;

    @Schema(description = "Identificador del padre del registro (no hace falta rellenar, puede ser nulo)", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Identificador del padre del registro (no hace falta rellenar, puede ser nulo)")
    private Long padreId;

    @Schema(description = "Tipo de datos del padre del registro (no hace falta rellenar, puede ser nulo)", accessMode = Schema.AccessMode.READ_ONLY)
    @JsonPropertyDescription("Tipo de datos del padre del registro (no hace falta rellenar, puede ser nulo)")
    private String tipoPadre;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenerableDto{id=").append(id);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tipoDatos='").append(tipoDatos).append('\'');
        sb.append('}');
        return super.toString();
    }

    @Override
    public int hashCode() {
        return getId() != null ? getId().hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        GenerableDto that = (GenerableDto) obj;
        return getId() != null && getId().equals(that.getId());
    }
}