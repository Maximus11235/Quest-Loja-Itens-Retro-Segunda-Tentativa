import logica.Carrinho;
import logica.itemVenda;
import logica.listaPainelItem;
import painel.telaPrincipal;

public class App {
    public static void main(String[] args){
        listaPainelItem lista= new listaPainelItem();                                       
        itemVenda item1= new itemVenda("Super Aventura 64","45.00","/imagens/imagem1.jpeg");
        itemVenda item2= new itemVenda("Combate Espacial","60.00","/imagens/imagem2.jpeg");
        itemVenda item3= new itemVenda("Corrida Turbo","50.00","/imagens/imagem3.jpeg");
        Carrinho car= new Carrinho();

        lista.add(item1);
        lista.add(item2);
        lista.add(item3);
        new telaPrincipal(lista, car);
    }
}
