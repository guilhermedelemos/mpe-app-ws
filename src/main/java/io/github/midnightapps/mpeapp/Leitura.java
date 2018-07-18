package io.github.midnightapps.mpeapp;

import java.util.Date;

public class Leitura {
    private long id;
    private Variavel variavel;
    private Date dataLeitura;
    private double valor;

    public Leitura() {
        super();
    }

    public Leitura(long id, Variavel variavel, Date dataLeitura, double valor) {
        this.id = id;
        this.variavel = variavel;
        this.dataLeitura = dataLeitura;
        this.valor = valor;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Variavel getVariavel() {
        return variavel;
    }

    public void setVariavel(Variavel variavel) {
        this.variavel = variavel;
    }

    public Date getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(Date dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
