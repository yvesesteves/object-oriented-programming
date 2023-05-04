import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Arrays;
/*
    RESPONDENDO A QUESTÃO (e) DO EXERCICIO 3 -
    Sim, é possível utilizar o método print(boolean) em um polimorfismo tendo como base um vetor da classe Estudante
    Ao declarar um vetor da classe Estudante, podemos armazenar objetos de qualquer subclasse de Estudante,
     ou seja, objetos das classes EstudanteGraduacao, EstudanteMestrado e EstudanteDoutorado.
      Quando chamamos o método print(boolean) em um objeto do vetor,
       o método que será executado dependerá do tipo de objeto armazenado nessa posição do vetor.
       por exemplo:
       Estudante[] estudantes = new Estudante[3];
       estudantes[0] = new EstudanteGraduacao("João", 20, "1234567");
       estudantes[1] = new EstudanteMestrado("Maria", 25, "7654321", "Sistemas de Informação");

        for (int i = 0; i < estudantes.length; i++) {
        estudantes[i].print(true);
        }

 */
public class Universidade {
    private String nomeUniversidade;
    private LocalDate dataFundacao;
    private Estudante[] alunos;
    private int numAlunos;
    private EstudantePosGrad[] posgrad;
    public Universidade(String nomeUniversidade, LocalDate dataFundacao) {
        this.nomeUniversidade = nomeUniversidade;
        this.dataFundacao = dataFundacao;
        this.alunos = new Estudante[100];
        this.numAlunos = 0;
    }

    public void adicionarAluno(Estudante aluno){
        if(this.numAlunos < 100){
            this.alunos[numAlunos] = aluno;
            this.numAlunos++;
        }else{
            System.out.println("Limite de alunos máximo atingido.");
        }
    }

    public void listarAlunos(){
        System.out.println("Lista de alunos da Universidade " + this.nomeUniversidade + ":");
        for(int i = 0; i < this.numAlunos; i++){
            if(this.alunos[i] instanceof EstudanteDoutorado ){
                System.out.println(this.alunos[i].getNome() + ",mora em " + this.alunos[i].getEndereco() +
                ",cursa " + ((EstudanteDoutorado) this.alunos[i]).getFormacao() + ", tem como linha de pesquisa " +
                        ((EstudanteDoutorado) this.alunos[i]).getLinhaDePesquisa() + "com o título de " + ((EstudanteDoutorado) this.alunos[i]).getTituloTese());
            }else if(this.alunos[i] instanceof EstudantePosGrad){
                System.out.println(this.alunos[i].getNome() + ",mora em " + this.alunos[i].getEndereco() +
                        ",cursa " + ((EstudantePosGrad) this.alunos[i]).getFormacao() + ", tem como linha de pesquisa " +
                        ((EstudantePosGrad) this.alunos[i]).getLinhaDePesquisa());
            }
            else{
                System.out.println(this.alunos[i].getNome());
            }

        }
    }



    public void mostrarQtdAlunosTipo(){
        int graduacao = 0, mestrado = 0, doutorado = 0;
        for(int x = 0; x < numAlunos; x++){
            Estudante aluno = alunos[x];
            if(aluno instanceof EstudanteGraduacao){
                graduacao++;
            }else if(aluno instanceof EstudanteDoutorado){
                doutorado++;
            }else if(aluno instanceof EstudanteMestrado){
                mestrado++;
            }
        }
        System.out.println("A universidade " + this.nomeUniversidade + " possui: ");
        System.out.println(graduacao + " Alunos de Graduação");
        System.out.println(doutorado + " Alunos de Doutorado");
        System.out.println(mestrado + " Alunos de Mestrado");

    }

    @Override
    public String toString() {
        return "Universidade{" +
                "nomeUniversidade='" + nomeUniversidade + '\'' +
                ", dataFundacao=" + dataFundacao +
                ", alunos=" + Arrays.toString(alunos) +
                ", numAlunos=" + numAlunos +
                '}';
    }

    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public void setNomeUniversidade(String nomeUniversidade) {
        this.nomeUniversidade = nomeUniversidade;
    }

    public LocalDate getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(LocalDate dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
}
