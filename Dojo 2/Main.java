package com.company;

public class Main extends Object {

    public static void main(String[] args) {
        Casa ca1 = new Casa(3, 1, false, false, 20745281, 45, "Meier", "Casa");
        Casa ca2 = new Casa(5, 3, true, true, 11456133, 85, "Centro", "Casa");

        Apartamento ap1 = new Apartamento(3, 1, false, true, true, false, true, "Apartamento");
        Apartamento ap2 = new Apartamento(8, 3, true, true, true, true, true, "Apartamento");

        Trailer trailer1 = new Trailer(1, 1, false, false, 8, "Gasolina", "Trailer");

        Residencia[] residencias = {ca1,ca2,ap1,ap2,trailer1};
        ImprimirInfo.imprimirInfo(residencias);
    }
}
