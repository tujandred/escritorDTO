package com.tujandred.escritor.generacion.ingesta;

import com.tujandred.escritor.generacion.ingesta.items.RegistroEntradaItemGenerable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistroEntradaRelacion extends RegistroEntrada {
    private String tipoRelacion = "";
    private RegistroEntradaItemGenerable elementoOrigen = null;
    private String etiquetaOrigen = "";
    private RegistroEntradaItemGenerable elementoDestino = null;
    private  String etiquetaDestino = "";
}
