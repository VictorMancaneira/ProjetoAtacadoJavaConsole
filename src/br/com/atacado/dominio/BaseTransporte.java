package br.com.atacado.dominio;

import java.time.LocalDate;

public abstract class BaseTransporte {

    protected int codigoTransporte;

    protected String descricao;

    protected LocalDate dataInsert;

    public int getCodigoTransporte() {
        return codigoTransporte;
    }

    public void setCodigoTransporte(int codigoTransporte) {
        this.codigoTransporte = codigoTransporte;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInsert() {
        return dataInsert;
    }

    public void setDataInsert(LocalDate dataInsert) {
        this.dataInsert = dataInsert;
    }

    public BaseTransporte() {
    }

    public BaseTransporte(int codigoTransporte, String descricao, LocalDate dataInsert) {
        this.codigoTransporte = codigoTransporte;
        this.descricao = descricao;
        this.dataInsert = dataInsert;
    }

}
