package com.example.flashcards;



import java.util.ArrayList;

public class Mazo {
    private String nombre;
    ArrayList<FlashCard> listaFlashCards = new ArrayList<>();

    public Mazo(String nombre) {
        this.nombre = nombre;
        this.listaFlashCards = new ArrayList<FlashCard>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<FlashCard> getListaFlashCards() {
        return listaFlashCards;
    }

    public void setListaFlashCards(ArrayList<FlashCard> listaFlashCards) {
        this.listaFlashCards = listaFlashCards;
    }

    public void crearFlashCard(String nombreFlashCard, String pregunta, String respuesta){
        FlashCard flashCard = new FlashCard(nombreFlashCard, pregunta, respuesta);
        listaFlashCards.add(flashCard);

    }

    public int eliminarFlashCardNombre(String nombre){
        int result = 0;
        for (int i = 0; i < listaFlashCards.size(); i++){
            if (nombre.equals(listaFlashCards.get(i).getNombreFlashCard())){
                listaFlashCards.remove(i);
                result = 1;
            }
        }
        return result;
    }

    public int eliminarFlashCardIndex(int index){
        int result = 0;
        if (index > 0 && index < listaFlashCards.size()){
            listaFlashCards.remove(index);
            result = 1;
        }
        return result;
    }

    public int cambiarFlashCard(String nombre){
        int result = 0;
        for (int i = 0; i < listaFlashCards.size(); i++){
            if (nombre.equals(listaFlashCards.get(i).getNombreFlashCard())){
                listaFlashCards.remove(i);
                result = 1;
                break;
            }
        }
        return result;
    }

    public int buscarFlashCard(String nombre){
        int result = -1;
        for(int i = 0; i < listaFlashCards.size(); i++){
            if(nombre.equals(listaFlashCards.get(i).getNombreFlashCard())){
                result = i;
                break;
            }
        }
        return result;
    }
}