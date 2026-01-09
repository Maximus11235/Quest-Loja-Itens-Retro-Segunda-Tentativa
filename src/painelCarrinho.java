import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class painelCarrinho extends JPanel{
    private carrinho car;
    private JTextField exibirTotal;
    private JTextField exibirTotalDesconto;
    private JLabel nomeTotal= new JLabel("Valor Total R$:");
    private JLabel nomeTotalDesconto= new JLabel("Valor com Desconto R$:");
    
    public painelCarrinho(carrinho carrinho){
        this.car=carrinho;
        exibirTotal= new JTextField(""+car.getValorTotal());
        exibirTotalDesconto= new JTextField(""+car.getValorComDesconto());
        add(exibirTotal);
        add(exibirTotalDesconto);
        add(nomeTotal);
        add(nomeTotalDesconto);
    }

}
