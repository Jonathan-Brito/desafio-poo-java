import br.com.jonathan.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("A linguagem numero 01 para backend");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("A linguagem numero 01 para frontend");
        curso2.setCargaHoraria(15);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Repassando as vantagens e desvantagens da linguagem Java");
        mentoria1.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("Mentoria de JavaScript");
        mentoria2.setDescricao("Repassando as vantagens e desvantagens da linguagem JavaScript");
        mentoria2.setData(LocalDate.now());

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Maior Bootcamp de Java de todos os tempos");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        bootcamp1.getConteudos().add(mentoria2);

        Dev dev1 = new Dev();
        dev1.setNome("Jonathan");

        Dev dev2 = new Dev();
        dev2.setNome("Jonathan Junior");

        dev1.increverBootcamp(bootcamp1);
        dev2.increverBootcamp(bootcamp1);


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
        System.out.println("Conteudos Inscritos: " + dev1.getConteudosIncritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos Inscritos: " + dev2.getConteudosIncritos());
        dev2.progredir();
        System.out.println("Conteudos Concluídos: " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        System.out.println("Conteudos Concluídos: " + dev2.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());
    }
}
