package com.tujandred.escritor.CRUD.basicos;

public enum TipoDatos {
    GENERABLE,
    RELACION,
    ELEMENTO,
    UNIVERSO,
    ESCENARIO,
    PERSONA,
    OBJETO,
    ORGANIZACION,
    PROYECTO,
    CONTENEDOR,
    TEXTO,
    TRAMA,
    ACTO,
    PUNTO;


    @Override
    public String toString() {
        switch (this) {
            case GENERABLE:
                return "Generable";
            case RELACION:
                return "Relación";
            case ELEMENTO:
                return "Elemento";
            case UNIVERSO:
                return "Universo";
            case ESCENARIO:
                return "Escenario";
            case PERSONA:
                return "Persona";
            case OBJETO:
                return "Objeto";
            case ORGANIZACION:
                return "Organización";
            case PROYECTO:
                return "Proyecto";
            case CONTENEDOR:
                return "Contenedor";
            case TEXTO:
                return "Texto";
            case TRAMA:
                return "Trama";
            case ACTO:
                return "Acto";
            case PUNTO:
                return "Punto";
            default:
                return "Desconocido";
        }
    }

    public String getPlural() {
        switch (this) {
            case GENERABLE:
                return "Generables";
            case RELACION:
                return "Relaciones";
            case ELEMENTO:
                return "Elementos";
            case UNIVERSO:
                return "Universos";
            case ESCENARIO:
                return "Escenarios";
            case PERSONA:
                return "Personas";
            case OBJETO:
                return "Objetos";
            case ORGANIZACION:
                return "Organizaciones";
            case PROYECTO:
                return "Proyectos";
            case CONTENEDOR:
                return "Contenedores";
            case TEXTO:
                return "Textos";
            case TRAMA:
                return "Tramas";
            case ACTO:
                return "Actos";
            case PUNTO:
                return "Puntos";
            default:
                return "Desconocido";
        }
    }
}
