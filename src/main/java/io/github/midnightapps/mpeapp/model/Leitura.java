package io.github.midnightapps.mpeapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "fu_leituras")
public class Leitura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "variavel_id")
    private Variavel variavel;
    @Column(name = "valor")
    private Double valor;
    @Column(name = "data_leitura")
    private Date dataLeitura;
    @Column(name = "situacao")
    private String situacao;

    public Leitura() {
        super();
    }

    public Leitura(Variavel variavel, Double valor, Date dataLeitura, String situacao) {
        this.variavel = variavel;
        this.valor = valor;
        this.dataLeitura = dataLeitura;
        this.situacao = situacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Variavel getVariavel() {
        return variavel;
    }

    public void setVariavel(Variavel variavel) {
        this.variavel = variavel;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataLeitura() {
        return dataLeitura;
    }

    public void setDataLeitura(Date dataLeitura) {
        this.dataLeitura = dataLeitura;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

}
