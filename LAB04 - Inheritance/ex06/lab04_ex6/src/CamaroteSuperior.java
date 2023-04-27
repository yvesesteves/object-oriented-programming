public class CamaroteSuperior extends VIP{
    private String localizacao;

    public CamaroteSuperior(double valor, double valorAdicional, String localizacao) {
        super(valor, valorAdicional);
        this.localizacao = localizacao;
    }

    public double valorCamaroteSuperior(){
        System.out.println("Camarote superior");
        return valor + valorAdicional;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void imprimeLocalizacao(){
        System.out.println("Localização do ingresso: " + localizacao);
    }
}
