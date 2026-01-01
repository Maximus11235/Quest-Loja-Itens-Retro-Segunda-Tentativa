

public class itemVenda{
    private String nome;
    private String preco;
    private String imagempath;

    public itemVenda(String nome, String preco, String imagempath) {
        this.nome = nome;
        this.preco = preco;
        this.imagempath = imagempath;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        double var= Float.parseFloat(preco);
        return var;
    }
    public String getPrecoStr() {
        return preco;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }
    public String getImagempath() {
        return imagempath;
    }
    public void setImagempath(String imagempath) {
        this.imagempath = imagempath;
    }
    
    

    

}
