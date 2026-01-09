public class itemVenda{
    private String nome;
    private String preco;
    private String imagempath;
    /*Função do arquivo itemVenda:
    - gerenciar os atributos de cada item que aparecerá, incluindo nome, imagem e preço*/
public itemVenda(String nome, String preco, String imagempath) {
        this.nome = nome;
        this.preco = preco;
        this.imagempath = imagempath;
        
    }

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return Float.parseFloat(preco);
    }
    public String getPrecoStr() {
        return preco;
    }
    public String getImagempath() {
        return imagempath;
    }
    public void setImagempath(String imagempath) {
        this.imagempath = imagempath;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(String preco) {
        this.preco = preco;
    }
}
