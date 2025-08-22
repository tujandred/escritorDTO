package com.tujandred.escritor.CRUD.entidades.proyecto;


import com.tujandred.escritor.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.entidades.proyecto.Contenedor}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "ContenedorDto", description = "DTO que representa un contenedor de textos dentro de un proyecto narrativo. Hereda de ElementoDto. Incluye información sobre el proyecto, el contenedor padre y el tipo de contenedor de texto.")
public class ContenedorDto extends ElementoDto {
    @Schema(description = "Identificador del proyecto al que pertenece el contenedor", example = "1")
    Long proyectoId;
    @Schema(description = "Identificador del contenedor padre (si existe)", example = "10")
    Long contenedorId;
    @Schema(description = "Tipo de contenedor de texto", example = "CAPITULO")
    TipoContenedorTexto tipoContenedorTexto;
    @Override
    public String toString() {
        return super.toString();
    }
}