package br.com.atacado.dominio;

import java.time.LocalDate;

public class Funcionario extends PessoaFisica {

    private String matricula;

    private String login;

    private String senha;

    private LocalDate dataContratacao;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(LocalDate dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public Funcionario(int codigoPessoa, String nome, String email, String site, LocalDate dataInclusao, String cpf,
            String rg, String sexo, String raca, String nacionalidade, String naturalidade, String nomePai,
            String nomeMae, String matricula, String login, String senha, LocalDate dataContratacao) {
        super(codigoPessoa, nome, email, site, dataInclusao, cpf, rg, sexo, raca, nacionalidade, naturalidade, nomePai,
                nomeMae);
        this.matricula = matricula;
        this.login = login;
        this.senha = senha;
        this.dataContratacao = dataContratacao;
    }

    @Override
    public void Imprimir() {
        System.out.println("------------------------------------");
        System.out.println("-------Detalhes do Funcionário------");
        System.out.println("Mátricula do Funcionário: " + this.matricula);
        System.out.println("Login: " + this.login);
        System.out.println("Senha: " + this.senha);
        System.out.println("Data de Contratação: " + this.dataContratacao);
    }

    @Override
    public String toString() {
        return "Funcionario [" +
                "matricula=" + matricula +
                ", login=" + login +
                ", senha=" + senha +
                ", dataContratacao=" + dataContratacao + "]";
    }

}
