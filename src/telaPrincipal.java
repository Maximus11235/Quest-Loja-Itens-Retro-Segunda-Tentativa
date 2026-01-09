import javax.swing.JFrame;

public class telaPrincipal extends JFrame {

    public telaPrincipal(itemVenda item, carrinho carrinho){
        setTitle("Loja");
        setSize(900,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        
        painelItemVenda painel=new painelItemVenda(item, carrinho);
        painelCarrinho painel2= new painelCarrinho(carrinho);
        painel.setBounds(80,50,800,200);
        painel2.setBounds(80,200,90,40);

        add(painel);
        add(painel2);
        setVisible(true);
    }

}