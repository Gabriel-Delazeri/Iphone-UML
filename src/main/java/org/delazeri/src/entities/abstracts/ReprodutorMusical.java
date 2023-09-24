package org.delazeri.src.entities.abstracts;

public abstract class ReprodutorMusical {

    private String musica;

    public ReprodutorMusical() {
        this.musica = "";
    }

    public void tocar() {
        if (this.musica == "") {
            System.out.println("Nenhuma música selecionada");
        }

        System.out.println("Tocando " + this.musica);
    }


}
