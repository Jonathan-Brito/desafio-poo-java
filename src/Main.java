import br.com.jonathan.desafio.dominio.Conteudo;
import br.com.jonathan.desafio.dominio.Curso;
import br.com.jonathan.desafio.dominio.Mentoria;

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


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);
    }
}
