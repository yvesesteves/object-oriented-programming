public class Main {
    public static void main(String[] args) {
        C1 classe1 = new C1(1,2,3);
        classe1.mostrar_atributos();
        classe1.mostrar_atributos_super();

        C2 classe2 = new C2(1,2,3,4,5,6);
        classe2.mostrar_atributos();
        classe2.mostrar_atributos_super();

        C3 classe3 = new C3(1,2,3,4,5,6,7,8,9);
        classe3.mostrar_atributos();
        classe3.mostrar_atributos_super();
    }
}
