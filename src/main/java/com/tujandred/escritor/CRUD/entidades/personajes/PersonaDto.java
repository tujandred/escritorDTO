package com.github.tujandred.paperbackDTO.CRUD.entidades.personajes;

import com.github.tujandred.paperbackDTO.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.entidades.personajes.Persona}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "PersonaDto", description = "DTO que representa una persona dentro de un universo narrativo. Hereda de ElementoDto. Incluye información sobre universo, edad, profesión, características físicas, motivaciones, evolución y otros atributos psicológicos y narrativos.")
public class PersonaDto extends ElementoDto {
    @Schema(description = "Identificador del universo al que pertenece la persona", example = "1")
    Long universoId;
    @Schema(description = "Edad de la persona", example = "35 años")
    String edad;
    @Schema(description = "Profesión de la persona", example = "Carpintero")
    String profesion;
    @Schema(description = "Características físicas de la persona", example = "Alto, cabello castaño, cicatriz en la mejilla")
    String caracteristicasFisicas;
    @Schema(description = "Necesidad insatisfecha que impulsa al personaje", example = "Reconocimiento de su familia")
    String necesidadInsatisfecha;
    @Schema(description = "Cómo se ve a sí mismo el personaje", example = "Se considera un líder nato")
    String comoSeVeASiMismo;
    @Schema(description = "Cómo ve a los demás el personaje", example = "Desconfía de los extraños")
    String comoVeALosDemas;
    @Schema(description = "Verdadera naturaleza del personaje", example = "Es más compasivo de lo que aparenta")
    String verdaderaNaturaleza;
    @Schema(description = "Hecho relevante en la vida del personaje", example = "Perdió a su hermano en la guerra")
    String hechoRelevante;
    @Schema(description = "Cómo era el personaje antes de un cambio importante", example = "Era tímido y reservado")
    String comoEraAntes;
    @Schema(description = "En qué se convirtió el personaje tras un cambio importante", example = "Ahora es valiente y decidido")
    String enQueSeConvirtio;
    @Schema(description = "Qué quiere cambiar el personaje de sí mismo o de su entorno", example = "Quiere reconciliarse con su padre")
    String queQuiereCambiar;
    @Schema(description = "Qué piensa el personaje que le traerá felicidad", example = "Cree que la riqueza le dará felicidad")
    String quePiensaTraeFelicidad;
    @Schema(description = "Qué le impide conseguir lo que busca", example = "Su orgullo y miedo al rechazo")
    String queImpideConseguirlo;
    @Schema(description = "Qué tiene que hacer el personaje para lograr su objetivo", example = "Enfrentar sus propios miedos")
    String queTieneHacer;
    @Schema(description = "Hasta dónde está dispuesto a llegar el personaje", example = "Arriesgaría su vida por su familia")
    String hastaDonde;
    @Schema(description = "Identificador del tipo de personaje asociado a la persona", example = "3")
    private Long tipoPersonajeId;
}