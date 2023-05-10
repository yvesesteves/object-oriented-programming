public abstract class ContaCorrente {
    protected float saldo;
    protected int estado; // 1 = conta ativa, 2 = conta inativa
    protected int numConta;
    protected int senha;

    public ContaCorrente(float val, int num, int pwd) {
        numConta = num;
        senha = pwd;
        saldo = val;
        estado = 1; // conta ativa
        System.out.println("Conta numero: " + numConta + " que possui valor de : " + saldo + " R$");
    }


    public abstract boolean debitaValor(float val, int pwd);

    public void debitaValor(float val) {
        saldo -= val;
    }

    public float getSaldo(int pwd) {
        if (senha == pwd) {
            return saldo;
        } else {
            return -1; // indicando que houve problema na senha
        }
    }

    public void creditaValor(int pwd, float val) {
        if (senha == pwd) {
            saldo += val;
        }
    }

    protected int getEstado(int pwd) {
        if (senha == pwd) {
            System.out.println("Saldo atual: " + saldo);
            return estado;
        } else {
            return -1;
        }
    }

    protected void setEstado(int pwd, int e) {
        if (senha == pwd) {
            estado = e;
        }
    }

    protected boolean isSenha(int pwd) {
        if (senha == pwd) {
            return true;
        } else {
            return false;
        }
    }
}
