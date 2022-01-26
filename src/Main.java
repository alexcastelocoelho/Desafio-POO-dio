import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("curso sobre java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("curso sobre jjs");
        curso2.setCargahoraria(5);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java ");
        mentoria.setDescricao("mentoria do curso de java");
        mentoria.setDate(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devlogan = new Dev();
        devlogan.setNome("logan");
        devlogan.inscreverbootcamp(bootcamp);
        System.out.println("conteudos inscritos logan: " + devlogan.getConteudosInscritos());
        devlogan.progredir();
        devlogan.progredir();
        devlogan.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos logan: " + devlogan.getConteudosInscritos());
        System.out.println("conteudos concluidos logan: " + devlogan.getConteudosConcluidos());
        System.out.println("XP:" + devlogan.calculartotalxp());

        System.out.println("----------------");

        Dev devcharles = new Dev();
        devcharles.setNome("charles");
        devcharles.inscreverbootcamp(bootcamp);
        System.out.println("conteudos inscritos charles: " + devcharles.getConteudosInscritos());
        devcharles.progredir();
        devcharles.progredir();
        System.out.println("-");
        System.out.println("conteudos inscritos charles: " + devcharles.getConteudosInscritos());
        System.out.println("conteudos concluidos charles: " + devcharles.getConteudosConcluidos());
        System.out.println("XP:" + devcharles.calculartotalxp());





    }
}
