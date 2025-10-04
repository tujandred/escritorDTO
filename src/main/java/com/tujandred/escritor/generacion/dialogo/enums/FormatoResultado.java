package com.tujandred.escritor.generacion.dialogo.enums;

public enum FormatoResultado {
    JSON, TEXTO, MARKDOWN;


    @Override
    public String toString() {
        switch (this) {
            case MARKDOWN -> {
                return "Markdown";
            }
            case TEXTO -> {
                return "Texto";
            }
            case JSON -> {
                return "JSON";
            }
        }
        return "";
    }
}
