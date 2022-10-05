import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Conteudo conteudo1 = new Mentoria();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRuan = new Dev();
        devRuan.setNome("Ruan França");
        devRuan.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Ruan França:" + devRuan.getConteudosInscritos());
        devRuan.progredir();
        devRuan.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Ruan França:" + devRuan.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Ruan França:" + devRuan.getConteudosConcluidos());
        System.out.println("XP:" + devRuan.calcularTotalXp());

        System.out.println("---------");

        Dev devSilva = new Dev();
        devSilva.setNome("Gabriel Silva");
        devSilva.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Gabriel Silva:" + devSilva.getConteudosInscritos());
        System.out.println("-");
        devSilva.progredir();
        devSilva.progredir();
        devSilva.progredir();
        System.out.println("Conteúdos Inscritos Gabriel Silva:" + devSilva.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Gabriel Silva:" + devSilva.getConteudosConcluidos());
        System.out.println("XP:" + devSilva.calcularTotalXp());



    }
}
