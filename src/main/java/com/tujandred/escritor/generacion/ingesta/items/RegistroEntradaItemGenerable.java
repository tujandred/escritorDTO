package com.tujandred.escritor.generacion.ingesta.items;

import com.tujandred.escritor.CRUD.basicos.TipoDatos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegistroEntradaItemGenerable extends  RegistroEntradaItem {
    private TipoDatos tipoDatos = TipoDatos.DESCONOCIDO;
}
