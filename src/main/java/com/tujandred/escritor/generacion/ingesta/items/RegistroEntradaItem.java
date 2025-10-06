package com.tujandred.escritor.generacion.ingesta.items;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroEntradaItem {
    private String nombre = "";
    private String descripcion = "";
}
