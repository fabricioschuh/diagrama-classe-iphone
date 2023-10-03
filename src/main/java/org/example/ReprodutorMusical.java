package org.example;

import java.util.ArrayList;

public interface ReprodutorMusical {
    ArrayList<Musica> musicas = new ArrayList<>();

    void tocar();
    void pausar();
    void escolherMusica();
}
