public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(float val, int num, int pwd, float lim) {
        super(val, num, pwd);
        limite = lim;
        if (limite == 0) {
            // se limite for igual a zero, converte para conta comum
            ContaComum novaConta = new ContaComum(saldo, numConta, senha);
            novaConta.setEstado(senha, estado);
            novaConta.creditaValor(senha, saldo);
        }
    }

    @Override
    public boolean debitaValor(float val, int pwd) {
        if (senha != pwd) {
            System.out.println("Senha incorreta");
            return false; // senha deve ser válida
        }
        if (val <= 0) {
            System.out.println("Saldo da conta tem que ser maior do que 0");
            return false; // val > 0
        }
        if (val > saldo + limite) {
            System.out.println("Valor maior que o saldo e o limite disponivel");
            return false;
        }
        if (val > saldo) {
            limite -= (val - saldo);
            saldo = 0;
        } else {
            saldo -= val;
        }
        return true;
    }
    public float getLimite() {
        return limite;
    }
}