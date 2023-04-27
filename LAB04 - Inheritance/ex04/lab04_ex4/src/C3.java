public class C3 extends C2{
    public int pub3;
    protected int prot3;
    private int priv3;

    public C3() {
        System.out.println("Classe C3: chamada do construtor padrão, SEM parâmetros");
    }

    public C3(int pub1, int prot1, int priv1, int pub2, int prot2, int priv2, int pub3, int prot3, int priv3) {
        super(pub1, prot1, priv1, pub2, prot2, priv2);
        this.pub3 = pub3;
        this.prot3 = prot3;
        this.priv3 = priv3;
        System.out.println("Classe C3: chamada do construtor COM parâmetros");
    }

    public void mostrar_atributos(){
        super.mostrar_atributos();
        System.out.println("pub3: " + pub3);
        System.out.println("prot3: " + prot3);
        System.out.println("priv3 " + priv3);
    }
    public void mostrar_atributos_super(){
        super.mostrar_atributos_super();
        System.out.println("pub3: " + pub3);
        System.out.println("prot3: " + prot3);
        System.out.println("priv3 " + priv3);
    }
}
