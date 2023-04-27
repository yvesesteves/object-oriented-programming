public class C2 extends C1{
    public int pub2;
    protected int prot2;
    private int priv2;
    public C2() {
        System.out.println("Classe C2: chamada do construtor padrão, SEM parâmetros");
    }

    public C2(int pub1, int prot1, int priv1, int pub2, int prot2, int priv2) {
        super(pub1, prot1, priv1);
        this.pub2 = pub2;
        this.prot2 = prot2;
        this.priv2 = priv2;
        System.out.println("Classe C2: chamada do construtor COM parâmetros");
    }

    public void mostrar_atributos(){
        super.mostrar_atributos();
        System.out.println("pub2: " + pub2);
        System.out.println("prot2: " + prot2);
        System.out.println("priv2 " + priv2);
    }
    public void mostrar_atributos_super(){
        super.mostrar_atributos_super();
        System.out.println("pub2: " + pub2);
        System.out.println("prot2: " + prot2);
        System.out.println("priv2 " + priv2);
    }
}
