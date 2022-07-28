package com.company;

public class Casa extends Residencia{

    private long cep;
    private int numeroDaCasa;
    private String bairro;
    private String tipoResidencia;

    public Casa(int numeroDeComodos, int numeroDeBanheiros, boolean temQuartoSeparado, boolean temSuite, long cep, int numeroDaCasa, String bairro, String tipoResidencia) {
        super(numeroDeComodos, numeroDeBanheiros, temQuartoSeparado, temSuite);
        this.cep = cep;
        this.numeroDaCasa = numeroDaCasa;
        this.bairro = bairro;
        this.tipoResidencia = tipoResidencia;

    }

    public float calculaIPTU() {
        final int valorBaseCalculoIPTU = 1250;
        float valorDoApartamento = (float) ((Math.random() * 500) * 1000);
        float calculo = (float) ((valorDoApartamento + valorBaseCalculoIPTU) * 0.1);
        return calculo;
    }

    public float calculaConsumoDeLuz() {
        final double reaisPorkWh = 0.83;
        float kWhUsados = (float) (Math.random() * 100);
        float calculo = (float) (reaisPorkWh * kWhUsados);
        return calculo;

    }

    public String informacoes() {
        return String.format("Tipo de residência %s; Número de comodos %d; Número de banheiros %d; Tem quarto separado? %b; Tem suite? %b",
                tipoResidencia , numeroDeComodos, numeroDeBanheiros, temQuartoSeparado, temSuite);
    }

    public long getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(int numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void ligaLuz() {
        System.out.println("liga o interruptor e ascende a luz");
    }
    public void desligaLuz() {
        System.out.println("Desliga o interruptor e apaga a luz");
    }

    public void Correio(){
        System.out.println("Pegar correio na caixa de correios");
    }
}
