package com.tujandred.escritor.RAG;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DocumentoDTO {
    private Long id;
    private String nombre;
    private String contenido;
    private Map<String, Object> metadatos;
}
