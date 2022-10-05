package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); //Obrigatoriamente eu adicione um curso ou mentoria só uma vez e não vai ser repetida
    private Set<Conteudo> conteudosConcluidos= new LinkedHashSet<>();  //Enquanto o ArrayList adiciona mas pode ser repetido

    //tem função de pegar tudo o que for adicionado em Conteudos e adicionar em conteudosInscritos
    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        //tem função de pegar o "bootcamp DevsInscritos" e adicionar no "inscreverBootcamp(Bootcamp bootcamp)"
        bootcamp.getDevsInscritos().add(this);
    }

    //this.stream().findFirst(); = tem função de pegar o primeiro conteudo
    //Optional = surgiu no Java 8 e tem o objetivo de resolver a questão de retornos nulos
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        //Função de colocar o conteudosInscrito nos conteudosconcluidos
        if(conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
            //emprime um erro caso não esteja inscrito
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    }
    //"Estudar Colections" tem função de pegar o stream e mapToDouble para somar o conteudo e calcularXp "sum" soma os valores " -> ou ::"
    public double calcularTotalXp() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXp)
                .sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
