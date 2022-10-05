package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    public String numCartao;
    private List<Endereco> enderecos;
    private String cpf;

    public void adicionaEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new NullPointerException("Endereco nao pode ser nulo");
        }

        if (endereco.cep == null) {
            throw new NullPointerException("Cep nao pode ser nulo");
        }
        getEnderecos().add(endereco);

    }

    private List<Endereco> getEnderecos() {
        if(enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
