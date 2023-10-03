package org.example;

import java.util.ArrayList;

public interface AparelhoTelefonico {

    ArrayList<Contato> agenda = new ArrayList<>();

    private boolean sinalRede() {
        return true;
    }
    void ligar();
    void atender();
    void adicionarContato();
}
