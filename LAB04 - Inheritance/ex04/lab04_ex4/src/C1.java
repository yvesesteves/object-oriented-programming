public class C1 {
    public int pub1;
    protected int prot1;
    private int priv1;

    public C1() {
        System.out.println("Classe C1: chamada do construtor padrão, SEM parâmetros");
    }

    public C1(int pub1, int prot1, int priv1) {
        this.pub1 = pub1;
        this.prot1 = prot1;
        this.priv1 = priv1;
        System.out.println("Classe C1: chamada do construtor COM parâmetros");
    }

    public void mostrar_atributos(){
        System.out.println("pub1: " + pub1);
        System.out.println("prot1: " + prot1);
        System.out.println("priv1 " + priv1);
    }

    public void mostrar_atributos_super(){
        System.out.println("pub1: " + pub1);
        System.out.println("prot1: " + prot1);
        System.out.println("priv1 " + priv1);
    }
}
