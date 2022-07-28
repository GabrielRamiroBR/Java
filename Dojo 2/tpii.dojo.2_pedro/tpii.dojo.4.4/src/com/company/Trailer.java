package com.company;

public class Trailer extends Residencia{
    private int quantidadeDeRodas;
    private String combustivel;
    private String tipoResidencia;

    public Trailer(int numeroDeComodos, int numeroDeBanheiros, boolean temQuartoSeparado, boolean temSuite, int quantidadeDeRodas, String combustivel,String tipoResidencia) {
        super(numeroDeComodos, numeroDeBanheiros, temQuartoSeparado, temSuite);
        this.quantidadeDeRodas = quantidadeDeRodas;
        this.combustivel = combustivel;
        this.tipoResidencia = tipoResidencia;
    }

    public float calculaIPTU() {
        final int valorBaseCalculoIPTU = 250;
        float valorDoApartamento = (float) ((Math.random() * 500) * 1000);
        float calculo = (float) ((valorDoApartamento + valorBaseCalculoIPTU) * 0.1);
        return calculo;
    }

    public float calculaConsumoDeLuz() {
        final double reaisPorkWh = 0.30;
        float kWhUsados = (float) (Math.random() * 100);
        float calculo = (float) (reaisPorkWh * kWhUsados);
        return calculo;

    }

    public String informacoes() {
        return String.format("Tipo de residência %s; Número de comodos %d; Número de banheiros %d; Tem quarto separado? %b; Tem suite? %b",
                tipoResidencia , numeroDeComodos, numeroDeBanheiros, temQuartoSeparado, temSuite);
    }

    public int getQuantidadeDeRodas() {
        return quantidadeDeRodas;
    }

    public void setQuantidadeDeRodas(int quantidadeDeRodas) {
        this.quantidadeDeRodas = quantidadeDeRodas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void ligaLuz() {
        System.out.println("Liga o gerador e ascende a luz");
    }
    public void desligaLuz() {
        System.out.println("Desliga o gerador e apaga a luz");
    }
    public void Correio(){
        System.out.println("Nao recebe correios");
    }
}
