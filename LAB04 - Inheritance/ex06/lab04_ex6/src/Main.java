public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50.0);
        ingresso.escreveValor(); // Valor do ingresso: 50.0

        VIP vip = new VIP(100.0, 50.0);
        System.out.println(vip.getValorVIP()); // 150.0
        System.out.println("---------");
        Normal normal = new Normal(50.0);
        normal.imprimeNormal(); // Ingresso Normal
        System.out.println("---------");


        CamaroteInferior camaroteInferior = new CamaroteInferior(100.0, 50.0, "Setor A");
        System.out.println(camaroteInferior.getValorVIP()); // 150.0
        System.out.println(camaroteInferior.getLocalizacao()); // Setor A
        camaroteInferior.imprimeLocalizacao(); // Localização do camarote inferior: Setor A
        System.out.println("---------");

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100.0, 50.0, "Setor B");
        System.out.println(camaroteSuperior.valorCamaroteSuperior()); // 250.0
        System.out.println(camaroteSuperior.getLocalizacao()); // Setor B
        camaroteSuperior.imprimeLocalizacao();
        System.out.println("---------");
    }

}
