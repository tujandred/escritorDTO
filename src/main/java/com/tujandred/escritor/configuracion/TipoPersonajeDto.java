package com.tujandred.escritor.configuracion;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.configuracion.tipoPersonaje.TipoPersonaje}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "TipoPersonajeDto", description = "DTO que representa un tipo de personaje en la configuración del sistema. Incluye información sobre nombre, descripciones, motivaciones, características psicológicas y atributos narrativos.")
public class TipoPersonajeDto implements Serializable {
    @Schema(description = "Identificador único del tipo de personaje", example = "1")
    private Long id;
    @Schema(description = "Nombre del tipo de personaje", example = "Héroe")
    private String nombre = "";
    @Schema(description = "Descripción del tipo de personaje", example = "El protagonista de la historia")
    private String descripcion = "";
    @Schema(description = "Tipo numérico asociado", example = "2")
    private Integer tipo;
    @Schema(description = "Nombre del tipo asociado", example = "Principal")
    private String nombreTipo;
    @Schema(description = "Lema característico del personaje", example = "Siempre adelante")
    private String lema;
    @Schema(description = "Características principales del personaje", example = "Valiente, decidido")
    private String caracteristicas;
    @Schema(description = "Necesidad principal del personaje", example = "Ser aceptado")
    private String necesita;
    @Schema(description = "Pecado o defecto principal", example = "Orgullo")
    private String pecado;
    @Schema(description = "Obsesión del personaje", example = "La perfección")
    private String obsesion;
    @Schema(description = "Temor principal del personaje", example = "Fracaso")
    private String temor;
    @Schema(description = "Defensa psicológica del personaje", example = "Negación")
    private String defensa;
    @Schema(description = "Deseo principal del personaje", example = "Triunfar")
    private String deseo;
    @Schema(description = "Motivación principal del personaje", example = "Proteger a su familia")
    private String motivacion;
    @Schema(description = "A quién o qué manipula el personaje", example = "A sus rivales")
    private String manipula;
    @Schema(description = "Número de ala (influencia secundaria)", example = "1")
    private Integer ala;
    @Schema(description = "Nombre del ala (influencia secundaria)", example = "El ayudante")
    private String nombreAla;
    @Schema(description = "Miedo básico del personaje", example = "Ser olvidado")
    private String miedoBasico;
    @Schema(description = "Deseo básico del personaje", example = "Ser recordado")
    private String deseoBasico;
    @Schema(description = "Fortaleza principal del personaje", example = "Resiliencia")
    private String fortaleza;
    @Schema(description = "Debilidad principal del personaje", example = "Impulsividad")
    private String debilidad;
    @Schema(description = "Motivación relacionada con el ala", example = "Ayudar a los demás")
    private String motivacionAla;
    @Schema(description = "Motivo de estrés del personaje", example = "Presión social")
    private String motivoEstres;
    @Schema(description = "Empleos o roles típicos del personaje", example = "Líder, mentor")
    private String empleos;
    private String searchTerm = "";
}