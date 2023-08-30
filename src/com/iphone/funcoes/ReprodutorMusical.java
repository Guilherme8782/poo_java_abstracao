package com.iphone.funcoes;

public interface ReprodutorMusical {
    public static void tocar() {
        System.out.println("Tocando música");
    }
    public static void pausar() {
        System.out.println("Pausando Música");
    }
    public static void selecionarMusica(String nome) {
        System.out.println("Tocando " + nome);
    }
}
