import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
import java.io.Serializable;

public class Agencia implements Serializable {
    private static final long serialVersionUID = 12345;
    private int numero;
    private String nome;
    private Gerente gerente;
    private List<Cliente> clientes;
    private List<Conta> contas;
    private String cidade;
    private String estado;
    private String bairro;


    public Agencia(int numero, String nome, Gerente gerente, String cidade, String estado, String bairro) {
        this.numero = numero;
        this.nome = nome;
        this.gerente = gerente;
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        contas = new ArrayList<>();
        clientes = new ArrayList<>();

    }

    public Agencia() {

    }

    // -------------------------------------------------SETS AND GETTERS ---------------------------------------------------
    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Gerente: \t" + gerente.getNome());
        System.out.println("Cidade: \t" + cidade);
        System.out.println("Estado: \t" + estado);
        System.out.println("Bairro: \t" + bairro);
        /* Testando contas
        int op;
        do {
            System.out.println("Deseja imprimir as contas cadastradas?");
            System.out.println("1-Sim");
            System.out.println("0-Nao");
            Scanner scanner = new Scanner(System.in);
            op = scanner.nextInt();
            if(op == 1){
                System.out.println("--------Contas--------");
                for(Conta conta : contas){
                    System.out.println(conta);
                }
                op = 0;
            }
        }while(op != 0);*/
    }
    public Conta encontrarContaPorNumero(String numero) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }
    public static List<Agencia> deserializeAgencias() {
        List<Agencia> agencias = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream("Agencias.bin");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            agencias = (List<Agencia>) ois.readObject();
            System.out.println("Agencias deserializadas com sucesso!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Erro ao deserializar as agencias: " + e.getMessage());
        }

        return agencias;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }
    public void adicionarCliente(Cliente cliente) {
       clientes.add(cliente);
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    public List<Conta> getContas() {
        return contas;
    }
    // talvez precise adicionar um add conta para cada tipo.
    public void setContas(Conta novaConta) {
        contas.add(novaConta);
    }


    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}