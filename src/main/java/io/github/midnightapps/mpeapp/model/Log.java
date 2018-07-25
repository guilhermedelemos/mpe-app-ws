package io.github.midnightapps.mpeapp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "log")
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "mensagem")
    private String mensagem;
    @Column(name = "data_cadastro")
    private Date dataCadastro;

    public Log() {
        super();
    }

    public Log(String mensagem, Date dataCadastro) {
        this.mensagem = mensagem;
        this.dataCadastro = dataCadastro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return String.format("Log[id=%d, mensagem=%s, dataCadastro=%s]", id, mensagem, dataCadastro);
    }
}
