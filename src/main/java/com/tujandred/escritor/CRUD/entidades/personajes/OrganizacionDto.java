package com.tujandred.escritor.CRUD.entidades.personajes;


import com.tujandred.escritor.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.entidades.personajes.Organizacion}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@Schema(name = "OrganizacionDto", description = "DTO que representa una organización dentro de un universo narrativo. Hereda de ElementoDto. Incluye información sobre tipo, objetivo, historia, fechas, misión, visión, valores y otros atributos relevantes.")
public class OrganizacionDto extends ElementoDto {
    @Schema(description = "Identificador del universo al que pertenece la organización", example = "1")
    Long universoId;
    @Schema(description = "Tipo de organización", example = "Secreta")
    String tipo;
    @Schema(description = "Objetivo principal de la organización", example = "Controlar el comercio mágico")
    String objetivo;
    @Schema(description = "Historia de la organización", example = "Fundada hace siglos por magos exiliados.")
    String historia;
    @Schema(description = "Fecha de fundación de la organización", example = "1200-05-01")
    String fundacionFecha;
    @Schema(description = "Misión de la organización", example = "Proteger el conocimiento arcano")
    String mision;
    @Schema(description = "Visión de la organización", example = "Ser la mayor red de sabios del continente")
    String vision;
    @Schema(description = "Valores que rigen la organización", example = "Lealtad, discreción, sabiduría")
    String valores;
    @Schema(description = "Objetivos actuales de la organización", example = "Expandir su influencia en el norte")
    String objetivosActuales;
    @Schema(description = "Ámbito geográfico de influencia", example = "Reinos del norte")
    String influenciaGeografica;
    @Schema(description = "Impacto social de la organización", example = "Ha cambiado la política de varias ciudades")
    String impactoSocial;
    @Schema(description = "Modo de operar de la organización", example = "A través de agentes encubiertos")
    String modoOperar;
    @Schema(description = "Simbolismo o significado de la organización", example = "El búho representa la sabiduría secreta")
    String simbolismo;
}