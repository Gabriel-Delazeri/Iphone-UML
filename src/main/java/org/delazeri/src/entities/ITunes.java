package org.delazeri.src.entities;

import org.delazeri.src.entities.abstracts.ReprodutorMusical;

public class ITunes extends ReprodutorMusical {

    private String versao = "9.2.1";

    public ITunes() {
    }

    public String getVersao() {
        return versao;
    }
}
