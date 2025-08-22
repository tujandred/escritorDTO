package com.tujandred.escritor.CRUD.entidades;


import com.tujandred.escritor.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.Escenario}
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Schema(name = "EscenarioDto", description = "DTO que representa un escenario dentro de un universo. Hereda de ElementoDto.")
public class EscenarioDto extends ElementoDto {
    @Schema(description = "Identificador del universo al que pertenece el escenario", example = "1")
    Long universoId;
}
