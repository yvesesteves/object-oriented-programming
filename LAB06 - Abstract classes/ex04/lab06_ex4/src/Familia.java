import java.time.LocalDate;

public class Familia extends Contato{
    private String parentesco;
    public Familia(String apelido, String nome, String email, LocalDate aniversario, String parentesco) {
        super(apelido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    @Override
    public void imprimirContato() {
        System.out.println("<<Familia>>");
        System.out.println(imprimirBasico());
        System.out.println("Parentesco: " + getParentesco());
        System.out.println("-----------------");
    }

    public String getParentesco() {
        return parentesco;
    }
}
