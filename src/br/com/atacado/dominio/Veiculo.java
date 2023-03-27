package br.com.atacado.dominio;

import java.time.LocalDate;

public class Veiculo extends BaseTransporte {

    private int codigoVeiculo;

    private int codigoFrota;

    private String descricao;

    private String placa;

    private LocalDate dataInsert;

    public Veiculo(int codigoTransporte, String descricao, LocalDate dataInsert) {
        super(codigoTransporte, descricao, dataInsert);
    }

    public Veiculo(int codigoTransporte, String descricao, LocalDate dataInsert, int codigoVeiculo, int codigoFrota,
            String descricao2, String placa, LocalDate dataInsert2) {
        super(codigoTransporte, descricao, dataInsert);
        this.codigoVeiculo = codigoVeiculo;
        this.codigoFrota = codigoFrota;
        descricao = descricao2;
        this.placa = placa;
        dataInsert = dataInsert2;
    }

    @Override
    public void Imprimir() {
        System.out.println("------------------------------------");
        System.out.println("-------Detalhes do Veículo------");
        System.out.println("Código de Veículo: " + this.codigoVeiculo);
        System.out.println("Código da Frota:  " + this.codigoFrota);
        System.out.println("Descrição do Veículo:  " + this.descricao);
        System.out.println("Placa de Veículo: " + this.placa);
        System.out.println("Data de Locação: " + this.dataInsert);
    }

    @Override
    public String toString() {
        return "Veiculo [" +
                "codigoVeiculo=" + codigoVeiculo +
                ", codigoFrota=" + codigoFrota +
                ", descricao=" + descricao +
                ", placa=" + placa +
                ", dataInsert=" + dataInsert +
                "]";
    }

}
