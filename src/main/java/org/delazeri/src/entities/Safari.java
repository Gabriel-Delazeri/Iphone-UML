package org.delazeri.src.entities;

import org.delazeri.src.interfaces.NavegadorInternet;

public class Safari implements NavegadorInternet {
    private final String versao;

    public Safari() {
        this.versao = "0.1";
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public String getVersao() {
        return versao;
    }
}
