package com.iphone;

import com.iphone.funcoes.Navegador;
import com.iphone.funcoes.ReprodutorMusical;
import com.iphone.funcoes.Telefone;

public abstract class Iphone implements Navegador, ReprodutorMusical, Telefone {
    public static void main(String[] args) {
        ReprodutorMusical.tocar();
        ReprodutorMusical.pausar();
        ReprodutorMusical.selecionarMusica("Henrique e Juliano");

        Telefone.ligar("João");
        Telefone.iniciarCorreioVoz("Karine");
        Telefone.atender();

        Navegador.adicionarNovaAba();
        Navegador.exibirPagina();
        Navegador.atualizarPagina();

    }
}
