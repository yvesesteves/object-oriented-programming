import java.time.LocalDate;

public class Amigos extends Contato{
    private int grau;
    public Amigos(String apelido, String nome, String email, LocalDate aniversario, int grau) {
        super(apelido, nome, email, aniversario);
        this.grau = grau;
    }

    @Override
    public void imprimirContato() {
        System.out.println("<<Amigos>>");
        System.out.println(imprimirBasico());
        if(grau == 1){
            System.out.println("Grau: " + getGrau() + " - Melhor amigo");
        }
        if(grau == 2){
            System.out.println("Grau: " + getGrau() + " - Amigo");
        }
        if(grau == 3){
            System.out.println("Grau: " + getGrau() + " - Conhecido");
        }
        System.out.println("-----------------");
    }

    public int getGrau() {
        return grau;
    }
}
