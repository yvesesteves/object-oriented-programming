public class ContaComum extends ContaCorrente {
    public float limite;
    public ContaComum(float val, int num, int pwd) {
        super(val, num, pwd);
        limite = 0;
    }

    @Override
    public boolean debitaValor(float val, int pwd) {
        if (senha != pwd) {
            return false; // senha deve ser válida
        }
        if (val <= 0) {
            return false; // val > 0
        }
        if (val > saldo) {
            return false; // valor maior que o saldo
        }
        saldo -= val;
        return true;
    }
}