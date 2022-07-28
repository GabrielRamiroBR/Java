package com.company;

public class Apartamento extends Residencia{
    private boolean temCondominio;
    private boolean temJanela;
    private boolean temElevador;
    private String tipoResidencia;

    public Apartamento(int numeroDeComodos, int numeroDeBanheiros, boolean temQuartoSeparado, boolean temCondominio, boolean temSuite, boolean temJanela,
                       boolean temElevador, String tipoResidencia) {
        super(numeroDeComodos, numeroDeBanheiros, temQuartoSeparado, temSuite);
        this.temCondominio = temCondominio;
        this.temJanela = temJanela;
        this.temElevador = temElevador;
        this.tipoResidencia = tipoResidencia;

    }

    public float calculaIPTU() {
        final int valorBaseCalculoIPTU = 500;
        float valorDoApartamento = (float) ((Math.random() * 500) * 1000);
        float calculo = (float) ((valorDoApartamento + valorBaseCalculoIPTU) * 0.1);
        return calculo;
    }

    public float calculaConsumoDeLuz() {
        final double reaisPorkWh = 0.68;
        float kWhUsados = (float) (Math.random() * 100);
        float calculo = (float) (reaisPorkWh * kWhUsados);
        return calculo;

    }

    public String informacoes() {
            return String.format("Tipo de residência %s; Número de comodos %d; Número de banheiros %d; Tem quarto separado? %b; Tem suite? %b",
                    tipoResidencia , numeroDeComodos, numeroDeBanheiros, temQuartoSeparado, temSuite);
    }

    public boolean isTemCondominio() {
        return temCondominio;
    }

    public void setTemCondominio(boolean temCondominio) {
        this.temCondominio = temCondominio;
    }

    public boolean isTemJanela() {
        return temJanela;
    }

    public void setTemJanela(boolean temJanela) {
        this.temJanela = temJanela;
    }

    public boolean isTemElevador() {
        return temElevador;
    }

    public void setTemElevador(boolean temElevador) {
        this.temElevador = temElevador;
    }

    public void ligaLuz() {
        System.out.println("liga o interruptor e ascende a luz");
    }
    public void desligaLuz() {
        System.out.println("Desliga o interruptor e apaga a luz");
    }

    public void Correio(){
        System.out.println("Pegar correio com o porteiro");
    }
}
