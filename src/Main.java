import br.com.br.desafio.dominio.Bootcamp;
import br.com.br.desafio.dominio.Curso;
import br.com.br.desafio.dominio.Dev;
import br.com.br.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        // curso1.setDescription("haha");
        curso1.setCargaHoraria(20);
//        System.out.println(curso1);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria java");
//        mentoria1.setDescription("description java");
        mentoria1.setData(LocalDate.now());
//        System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCaio = new Dev();
        devCaio.setName("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Caio:" + devCaio.getConteudosInscritos());
        devCaio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Caio:" + devCaio.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Caio:" + devCaio.getConteudosConcluidos());
        System.out.println("XP:" + devCaio.calcularTotalxp());

        System.out.println("__________");

        Dev devHelena = new Dev();
        devHelena.setName("Helena");
        devHelena.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Caio:" + devHelena.getConteudosInscritos());
        devHelena.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Caio:" + devHelena.getConteudosInscritos());
        System.out.println("Conteúdos Inscritos Caio:" + devHelena.getConteudosConcluidos());

        System.out.println("__________");
        System.out.println("XP:" + devHelena.calcularTotalxp());

    }
    }
