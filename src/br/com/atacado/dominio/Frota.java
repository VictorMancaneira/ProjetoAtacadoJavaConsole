package br.com.atacado.dominio;

import java.time.LocalDate;
import java.util.List;

public class Frota extends BaseTransporte {

    private int codigoFrota;

    private String descricao;

    private LocalDate dataInsert;

    private List<Veiculo> Veiculos;

    public int getCodigoFrota() {
        return codigoFrota;
    }

    public void setCodigoFrota(int codigoFrota) {
        this.codigoFrota = codigoFrota;
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

    public List<Veiculo> getVeiculos() {
        return Veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        Veiculos = veiculos;
    }

    public Frota(int codigoTransporte, String descricao, LocalDate dataInsert) {
        super(codigoTransporte, descricao, dataInsert);
    }

    public Frota(int codigoTransporte, String descricao, LocalDate dataInsert, int codigoFrota, String descricao2,
            LocalDate dataInsert2, List<Veiculo> veiculos) {
        super(codigoTransporte, descricao, dataInsert);
        this.codigoFrota = codigoFrota;
        descricao = descricao2;
        dataInsert = dataInsert2;
        Veiculos = veiculos;
    }

    @Override
    public void Imprimir() {
        System.out.println("------------------------------------");
        System.out.println("----------Detalhes da Frota---------");
        System.out.println("Código da Frota: " + this.codigoFrota);
        System.out.println("Descrição da Frota:  " + this.descricao);
        System.out.println("Data da Frota : " + this.dataInsert);
    }

    @Override
    public String toString() {
        return "Frota [" +
                "codigoFrota=" + codigoFrota +
                ", descricao=" + descricao +
                ", dataInsert=" + dataInsert +
                ", Veiculos=" + Veiculos +
                "]";
    }

}