import java.util.List;

public class Main {

    public static void main(String[] args){
        Artigo artigo1 = new Artigo(1, "Ciencia da Computação", "Resumo do artigo 1");
        Artigo artigo2 = new Artigo(2,"Sistemas da Informação", "Resumo do artigo 2");
        Autor autor = new Autor(70.0f, "João", "17/04/1985");
        autor.adicionarArtigo(artigo1);
        autor.adicionarArtigo(artigo2);
        Revista revista = new Revista("Revista Científica");
        // publicando artigos na revista
        revista.publicarArtigo(artigo1);
        revista.publicarArtigo(artigo2);

        List<Artigo> artigosDoAutor = autor.getArtigos();
        System.out.println("O autor "+autor.getNome() + ", nascido em " + autor.getDataNascimento() + ", de peso " + autor.getPeso() + ", escreveu os artigos:");
        System.out.println(artigo1.getCodigo() + ", " + artigo1.getArea() + ", " + artigo1.getResumo());
        System.out.println(artigo2.getCodigo() + ", " + artigo2.getArea() + ", " + artigo2.getResumo());

        // Imprimir os artigos publicados na revista
        List<Artigo> artigosPublicados = revista.getArtigosPublicados();
        for (Artigo artigo : artigosPublicados) {
            System.out.println("Artigo " + artigo.getCodigo() + " publicado na revista " + revista.getNome());
        }

    }
}

// A classe artigo e autor utiliza o conceito de Associação

/*
    Sim, os objetos das classes Autor e Artigo são independentes nesse programa.
    Isso significa que cada objeto é responsável por seus próprios atributos e métodos,
     e não depende de outros objetos para funcionar corretamente.

    Por exemplo, um objeto da classe Autor pode ter uma lista de artigos,
     mas cada objeto dessa lista também é independente e tem seus próprios atributos e métodos.
 */


/*
    A relação entre as classes Revista e Artigo é de Agregação,
     pois a Revista possui uma coleção de Artigos, mas a existência dos artigos não depende da Revista.
      Ou seja, se a Revista deixar de existir, os Artigos ainda podem existir independentemente.
 */

// e sim, na implementação , os objetos da classe Autor, Artigo e Revista são independentes.

/*
    Resposta do ex3:
    Isso depende da relação entre o objeto todo e o objeto parte.
    Se a relação for de composição, onde o objeto todo é responsável por criar e gerenciar os objetos parte,
     então a remoção do objeto todo resultará na remoção automatica dos objetos parte associados a ele.
    Isso ocorre porque os objetos parte não têm existência autônoma, eles são partes integrantes do objeto todo.
    Por outro lado, se a relação for de agregação ou associação,
     onde o objeto parte tem existência autônoma e não depende do objeto todo para existir,
     então a remoção do objeto todo não afetará a existência dos objetos parte.
    Nesse caso, os objetos parte continuarão existindo independentemente do objeto todo.

 */