package com.tujandred.escritor.CRUD.entidades.proyecto;


import com.tujandred.escritor.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.entidades.proyecto.Texto}
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Schema(name = "TextoDto", description = "DTO que representa un texto dentro de un proyecto narrativo. Hereda de ElementoDto. Incluye información sobre el contenedor al que pertenece y el contenido del texto.")
public class TextoDto extends ElementoDto {
    @Schema(description = "Identificador del contenedor al que pertenece el texto", example = "10")
    Long contenedorId;
    @Schema(description = "Contenido del texto", example = "Érase una vez en un reino lejano...")
    String contenido;
}