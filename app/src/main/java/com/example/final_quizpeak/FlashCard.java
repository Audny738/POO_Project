package com.example.flashcards;

public class FlashCard {
    private String nombreFlashCard;
    private String pregunta;
    private String respuesta;

    public FlashCard() {
    }

    public FlashCard(String nombreFlashCard, String pregunta, String respuesta) {
        this.nombreFlashCard = nombreFlashCard;
        this.pregunta = pregunta;
        this.respuesta = respuesta;
    }

    public String getNombreFlashCard() {
        return nombreFlashCard;
    }

    public void setNombreFlashCard(String nombreFlashCard) {
        this.nombreFlashCard = nombreFlashCard;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}