package com.company;

public class ImprimirInfo {

    public static void imprimirInfo(Residencia[] residencias) {
        for (Residencia r: residencias) {
            System.out.println(r.informacoes());
            System.out.println("Iptu R$" + r.calculaIPTU());
            System.out.println("Consumo de luz R$" + r.calculaConsumoDeLuz());
            r.ligaLuz();
            r.desligaLuz();
            r.Correio();
            System.out.println("----------------------------------");
        }
    }
}
