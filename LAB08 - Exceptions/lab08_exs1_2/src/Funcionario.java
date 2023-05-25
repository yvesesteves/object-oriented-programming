public class Funcionario {
    private String cpf;
    private String nome;
    private double salario;

    private double tetoSalarial = 40000.0;

    public void aumentoSalarial(double porcentagem) throws SalarioInvalidoException{
        double novoSalario = salario + (salario * porcentagem / 100);
        salario = novoSalario;
        if(salario < 0){
            throw new SalarioInvalidoException("Valor inválido de salário.");
        }if(salario > tetoSalarial){
            throw new SalarioInvalidoException("Com o aumento, o salario de " + getNome() + " iria para " + getSalario() +
                    " porém, esse valor ultrapassa o teto.");
        }
        System.out.println("Novo salario de " + getNome() + ": " + getSalario());
    }

    public Funcionario(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }


    public String getNome() {
        return nome;
    }


    public double getSalario() {
        return salario;
    }

    public  double getTetoSalarial() {
        return tetoSalarial;
    }

    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }


    public void mostrarDados(){
        System.out.println("Funcionario (" +
                " cpf = '" + cpf + '\'' +
                ", nome = '" + nome + '\'' +
                ", salario atual = " + salario +
                ')');
    }
}
