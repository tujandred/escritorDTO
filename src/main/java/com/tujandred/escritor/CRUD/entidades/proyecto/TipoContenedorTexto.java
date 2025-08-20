package com.tujandred.escritor.CRUD.entidades.proyecto;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(name = "TipoContenedorTexto", description = "Enum que representa los tipos de contenedores de texto en un proyecto narrativo. Cada valor tiene un nombre descriptivo en español.")
public enum TipoContenedorTexto {
    @Schema(description = "Saga narrativa compuesta por varias series o libros")
    SAGA("Saga"),
    @Schema(description = "Serie narrativa compuesta por varios libros")
    SERIE("Serie"),
    @Schema(description = "Libro individual dentro de la narrativa")
    LIBRO("Libro"),
    @Schema(description = "Parte de un libro, como un volumen o sección mayor")
    PARTE_LIBRO("Parte de libro"),
    @Schema(description = "Capítulo de un libro o parte")
    CAPITULO("Capítulo"),
    @Schema(description = "Sección dentro de un capítulo")
    SECCION_CAPITULO("Sección de capítulo"),
    @Schema(description = "Otro tipo de contenedor no especificado")
    OTRO("Otro");

    private final String displayName;

    TipoContenedorTexto(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
