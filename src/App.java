
public class App {
    public static void main(String[] args){                                       
        itemVenda item= new itemVenda("Carrinho","0.00","/imagens/imagem2.jpeg");
        //itemVenda item2= new itemVenda("Carrinho","0.00","/imagens/imagem1.jpeg");
        carrinho car= new carrinho();
        new telaPrincipal(item, car);

    }
}
