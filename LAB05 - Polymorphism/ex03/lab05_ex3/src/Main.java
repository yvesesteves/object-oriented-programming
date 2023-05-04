import java.time.LocalDate;
import java.util.Date;
public class Main {

    public static void main(String[] args) {
        /*
        Estudante e = new Estudante("Carlos","Rua 1o de Abril");

        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        EstudanteDoutorado epd = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        e.print();

         */

        Universidade u = new Universidade("Federal de Uberlandia", LocalDate.of(1960, 1, 1));
        u.adicionarAluno(new EstudanteGraduacao("João ", "Rua B ", "POO1 Explicado\n" ));
        u.adicionarAluno(new EstudanteMestrado("Maria ", "Santa Monica ","Engenharia Civil ", "Construção ", " Academico ", "Obras\n"));
        u.adicionarAluno(new EstudanteDoutorado("Pedro ", "Umuarama ","Ciência da Computação ", "Banco de Dados ", "MySQL\n"));
        u.adicionarAluno(new EstudantePosGrad("Lucas", "Avenida Segismundo", "Sistemas da Informação", "Algoritmos"));
        System.out.println("----------------------------------");
        u.listarAlunos();
        u.mostrarQtdAlunosTipo();
        u.toString();

        EstudanteGraduacao e1 = new EstudanteGraduacao("Rafael", "São Paulo", "Aplicativo de Banco");
        EstudanteMestrado e2 = new EstudanteMestrado("Gabriel", "Rio de Janeiro", "Odontologia", "Aparelho", "Profissional", "Ortondontia");
        EstudanteDoutorado e3 = new EstudanteDoutorado("Ana", "Niterói", "Medicina", "Pediatria", "Medicando crianças");
        System.out.println("\n");
        System.out.println("<< Imprimindo na mesma linha >>");
        e1.print(true);
        e2.print(true);
        e3.print(true);
        System.out.println("------------------------------");
        System.out.println("<< Imprimindo em linhas diferentes >>");
        e1.print(false);
        e2.print(false);
        e3.print(false);
        /*
        eg.print();
        System.out.println("Título TCC: " + eg.getTituloTCC());

        ep.print();
        System.out.println("Formação prévia: " + ep.getFormacao());

        epm.print();
        System.out.println("Título Dissertação: " + epm.getTituloDissertacao());

        epd.print();
        System.out.println("Título Tese: " + epd.getTituloTese());



        // casos com polimorfismo
        Estudante e2 = new Estudante("Carlos","Rua 1o de Abril");
        Estudante eg2 = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        Estudante ep2 = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        Estudante epm2 = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
        Estudante epd2 = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        // exemplo de uso com vetor e com CAST
        Estudante[] ev = new Estudante[4];
        ev[0] = eg;
        eg.print();
        eg.getTituloTCC();
        ev[0].print();;
        String x = ((EstudanteGraduacao) ev[0]).getTituloTCC();
        String x2 = ((EstudantePosGrad) ev[0]).getFormacao();



        e2.print();
        eg2.print();
        epd2.print();
        ep2.print();
        epd2.print();
        //   EstudanteDoutorado epd3;
        //  epd3 = (EstudanteDoutorado)epd2;
        // System.out.println(epd3.getTituloTese());
        // System.out.println(((EstudanteDoutorado)epd2).getTituloTese());

/*
        eg2.print();
        System.out.println(eg2.getTituloTCC());

        ep2.print();
        System.out.println(ep2.getFormacao());

        epm2.print();
        System.out.println(epm2.getTituloDissertacao());

*/
        /*
        Estudante e2 = new Estudante();
        Estudante eg2 = new EstudanteGraduacao();
        Estudante ep2 = new EstudantePosGrad();
        Estudante epm2 = new EstudanteMestrado();
        Estudante epd2 = new EstudanteDoutorado();

        //EstudantePosGrad e3 = new Estudante();
        //EstudantePosGrad eg3 = new EstudanteGraduacao();
        */

        // polimorfismo com pós-graduação
        // construtor incompleto
        /*
        EstudantePosGrad ep3 = new EstudantePosGrad();
        EstudantePosGrad epm3 = new EstudanteMestrado();
        EstudantePosGrad epd3 = new EstudanteDoutorado();
        */



    }
}
