package com.iphone.funcoes;

public interface Telefone {
    public static void ligar(String nome) {
        System.out.println("Ligando para " + nome);
    }

    public static void atender() {
        System.out.println("Atendendo telefone");
    }

    public static void iniciarCorreioVoz(String nomeMensagem) {
        System.out.println("Deixando recado para " + nomeMensagem);
    }
}
