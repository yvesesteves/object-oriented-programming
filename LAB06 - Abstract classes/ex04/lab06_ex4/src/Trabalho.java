import java.time.LocalDate;

public class Trabalho extends Contato{
    private String tipo;
    public Trabalho(String apelido, String nome, String email, LocalDate aniversario, String tipo) {
        super(apelido, nome, email, aniversario);
        this.tipo = tipo;
    }


    @Override
    public void imprimirContato() {
        System.out.println("<<Trabalho>>");
        System.out.println(imprimirBasico());
        System.out.println("Tipo de contato: " + getTipo());
        System.out.println("-----------------");
    }

    public String getTipo() {
        return tipo;
    }
}
