package com.tujandred.escritor.CRUD.entidades.personajes;


import com.tujandred.escritor.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.entidades.personajes.Objeto}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "ObjetoDto", description = "DTO que representa un objeto dentro de un universo narrativo. Hereda de ElementoDto. Incluye información sobre material, origen, poderes, estado y otros atributos relevantes.")
public class ObjetoDto extends ElementoDto {
    @Schema(description = "Tipo de generable al que pertenece el objeto", example = "Artefacto")
    String tipoGenerable;
    @Schema(description = "Material del que está hecho el objeto", example = "Acero mágico")
    String material;
    @Schema(description = "Origen o procedencia del objeto", example = "Forjado en las montañas del norte")
    String origen;
    @Schema(description = "Poder especial que posee el objeto", example = "Invisibilidad")
    String poderEspecial;
    @Schema(description = "Forma de activación del poder especial", example = "Pronunciar la palabra secreta")
    String activacion;
    @Schema(description = "Limitaciones o restricciones del objeto", example = "Solo funciona de noche")
    String limitaciones;
    @Schema(description = "Estado actual del objeto", example = "Dañado")
    String estado;
    @Schema(description = "Nombre alternativo o alias del objeto", example = "La Espada de la Sombra")
    String nombreAlternativo;
    @Schema(description = "Inscripciones o marcas presentes en el objeto", example = "Runas élficas grabadas en la hoja")
    String inscripciones;
    @Schema(description = "Nivel de poder del objeto", example = "Alto")
    String nivelPoder;
    @Schema(description = "Ubicación actual del objeto", example = "Castillo de Eldor")
    String ubicacionActual;
    @Schema(description = "Propósito o función principal del objeto", example = "Proteger al portador de daños mágicos")
    String proposito;
    @Schema(description = "Simbolismo o significado del objeto", example = "Representa la esperanza de los pueblos libres")
    String simbolismo;
    @Schema(description = "Identificador del universo al que pertenece el objeto", example = "1")
    Long universoId;
    @Override
    public String toString() {
        return super.toString();
    }
}