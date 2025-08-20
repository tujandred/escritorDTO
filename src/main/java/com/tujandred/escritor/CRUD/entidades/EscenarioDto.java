package com.tujandred.escritor.CRUD.entidades;


import com.tujandred.escritor.CRUD.basicos.ElementoDto;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * DTO for {@link com.github.tujandred.pbsBackend.datos.generables.Escenario}
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Schema(name = "EscenarioDto", description = "DTO que representa un escenario dentro de un universo. Hereda de ElementoDto.")
public class EscenarioDto extends ElementoDto {
    @Schema(description = "Identificador del universo al que pertenece el escenario", example = "1")
    Long universoId;
}
