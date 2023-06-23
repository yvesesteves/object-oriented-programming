import java.time.LocalDate;
import java.io.Serializable;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;


public class Transacoes implements Serializable {

    private Conta conta;
    private LocalDate dataAtual;
    private String tipoDeTransferencia;
    private double valor;
    private String CanaldeTransferencia;
    private double valorAtual;

    public Transacoes(Conta conta, LocalDate data,String CanaldeTransferencia, String tipoDeTransferencia, double valor) {
        this.conta = conta;
        this.dataAtual = data;
        this.tipoDeTransferencia = tipoDeTransferencia;
        this.valor = valor;
        this.CanaldeTransferencia = CanaldeTransferencia;
    }

    public Conta getConta() {
        return conta;
    }

    public double getValor() {
        return valor;
    }

    public String getCanaldeTransferencia() {
        return CanaldeTransferencia;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCanaldeTransferencia(String canaldeTransferencia) {
        CanaldeTransferencia = canaldeTransferencia;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public LocalDate getDataAtual() {
        return dataAtual;
    }

    public void setDataAtual(LocalDate dataAtual) {
        this.dataAtual = dataAtual;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }


    public void setValorSaque(double valorSaque) {
        this.valor = valorSaque;
    }

    public String getTipoDeTransferencia() {
        return tipoDeTransferencia;
    }

    public void setTipoDeTransferencia(String tipoDeTransferencia) {
        this.tipoDeTransferencia = tipoDeTransferencia;
    }
    // pega os objetos no arquivo "transacoes.bin" e armazena em uma lista de transacoes.
    public static List<Transacoes> recuperarTransacoes() {
        List<Transacoes> transacoes = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream("transacoes.bin");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            while (true) {
                try {
                    Transacoes transacao = (Transacoes) objectInputStream.readObject();
                    transacoes.add(transacao);
                } catch (EOFException e) {
                    break;
                }
            }

            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return transacoes;
    }
    // nao funciona por nada
    public static void exibirTransacoesPorConta(Conta conta) {

        List<Transacoes> transacoes = recuperarTransacoes();

        for (Transacoes transacao : transacoes) {
            if (transacao.getConta().getNumero().equals(conta.getNumero())) {
                System.out.println("Conta: " + transacao.getConta().getNumero());
                System.out.println("Data: " + transacao.getDataAtual());
                System.out.println("Tipo de Transferência: " + transacao.getTipoDeTransferencia());
                System.out.println("Canal de Transferencia: " + transacao.getCanaldeTransferencia());
                System.out.println("Valor: " + transacao.getValor());
                System.out.println("-----------------------------");
        }
    }


}
}
