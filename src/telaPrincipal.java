import javax.swing.JFrame;

public class telaPrincipal extends JFrame {

    public telaPrincipal(itemVenda item){
        setTitle("Loja");
        setSize(900,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        painelItemVenda painel=new painelItemVenda(item);
        painel.setBounds(50,50,300,100);

        add(painel);
        setVisible(true);
    }

    public static void main(String[] args){
        itemVenda item=new itemVenda("Carrinho","0.00","/imagens/imagem1.jpeg");

        new telaPrincipal(item);
    }
}