public class Main {
    public static void main(String[] args) {
        Produto[] produtos = new Produto[3];
        produtos[0] = new Produto(3);
        produtos[1] = new Produto(1);
        produtos[2] = new Produto(2);

        Cliente[] clientes = new Cliente[3];
        clientes[0] = new Cliente("Maria");
        clientes[1] = new Cliente("João");
        clientes[2] = new Cliente("Pedro");

        Servico[] servicos = new Servico[3];
        servicos[0] = new Servico(150.0);
        servicos[1] = new Servico(50.0);
        servicos[2] = new Servico(100.0);

        Classificador classificador = new Classificador();
        classificador.ordena(produtos);
        classificador.ordena(clientes);
        classificador.ordena(servicos);

        System.out.println("Produtos ordenados:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        System.out.println("\n");

        System.out.println("Clientes ordenados:");
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }

        System.out.println("\n");

        System.out.println("Serviços ordenados:");
        for (Servico servico : servicos) {
            System.out.println(servico);
        }
    }
}