public class Artigo {
    private int codigo;
    private String area;
    private String resumo;

    public Artigo(int codigo, String area, String resumo) {
        this.codigo = codigo;
        this.area = area;
        this.resumo = resumo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getArea() {
        return area;
    }

    public String getResumo() {
        return resumo;
    }
    public void cadastrar(String nome, String usuario, String senha, int cpf){
        System.out.println("Artigo cadastrado com sucesso!");
    }
}
