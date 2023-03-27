package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class Subcategoria {

    private int codigo;

    private int codigoCategoria;

    private String descicao;

    private LocalDate dataDeInclusao;

    private List<Produto> produtos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoCategoria() {
        return codigoCategoria;
    }

    public void setCodigoCategoria(int codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getDescicao() {
        return descicao;
    }

    public void setDescicao(String descicao) {
        this.descicao = descicao;
    }

    public LocalDate getDataDeInclusao() {
        return dataDeInclusao;
    }

    public void setDataDeInclusao(LocalDate dataDeInclusao) {
        this.dataDeInclusao = dataDeInclusao;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Subcategoria() {
    }

    public Subcategoria(int codigo, int codigoCategoria, String descicao, LocalDate dataDeInclusao) {
        this.codigo = codigo;
        this.codigoCategoria = codigoCategoria;
        this.descicao = descicao;
        this.dataDeInclusao = dataDeInclusao;
    }

}
