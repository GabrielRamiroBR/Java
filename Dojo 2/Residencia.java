package com.company;

public abstract class Residencia implements Eletricidade, Correio {
    protected int numeroDeComodos;
    protected int numeroDeBanheiros;
    protected boolean temQuartoSeparado;
    protected boolean temSuite;

    public Residencia(int numeroDeComodos, int numeroDeBanheiros, boolean temQuartoSeparado, boolean temSuite) {
        this.numeroDeComodos = numeroDeComodos;
        this.numeroDeBanheiros = numeroDeBanheiros;
        this.temQuartoSeparado = temQuartoSeparado;
        this.temSuite = temSuite;
    }

    public abstract float calculaIPTU();

    public abstract float calculaConsumoDeLuz();

    public abstract String informacoes();

    public int getNumeroDeComodos() {
        return numeroDeComodos;
    }

    public void setNumeroDeComodos(int numeroDeComodos) {
        this.numeroDeComodos = numeroDeComodos;
    }

    public int getNumeroDeBanheiros() {
        return numeroDeBanheiros;
    }

    public void setNumeroDeBanheiros(int numeroDeBanheiros) {
        this.numeroDeBanheiros = numeroDeBanheiros;
    }

    public boolean isTemQuartoSeparado() {
        return temQuartoSeparado;
    }

    public void setTemQuartoSeparado(boolean temQuartoSeparado) {
        this.temQuartoSeparado = temQuartoSeparado;
    }

    public boolean isTemSuite() {
        return temSuite;
    }

    public void setTemSuite(boolean temSuite) {
        this.temSuite = temSuite;
    }


}
