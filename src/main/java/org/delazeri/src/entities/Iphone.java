package org.delazeri.src.entities;

import org.delazeri.src.entities.abstracts.ReprodutorMusical;
import org.delazeri.src.interfaces.AparelhoTelefonico;
import org.delazeri.src.interfaces.NavegadorInternet;

public class Iphone implements AparelhoTelefonico {

    private final NavegadorInternet navegadorInternet;
    private final int bateria;
    private final int armazenamento;
    private final String ios;
    private final ReprodutorMusical reprodutorMusical;

    public Iphone(int bateria, int armazenamento, String ios) {
        super();
        this.ios = ios;
        this.bateria = bateria;
        this.armazenamento = armazenamento;
        this.navegadorInternet = new Safari();
        this.reprodutorMusical = new ITunes();
    }

    public String getIos() {
        return ios;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public int getBateria() {
        return bateria;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    @Override
    public void ligar() {
        System.out.println("Ligando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
