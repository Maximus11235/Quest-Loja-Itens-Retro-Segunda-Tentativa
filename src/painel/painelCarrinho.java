package painel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import logica.Carrinho;

public class painelCarrinho extends JPanel{
    private Carrinho car;
    private JTextField exibirTotal;
    private JTextField exibirTotalDesconto;
    private JLabel nomeTotal;
    private JLabel nomeTotalDesconto;
    
    public painelCarrinho(Carrinho carrinho){
        this.car=carrinho;

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        exibirTotal= new JTextField(""+car.getValorTotal());
        exibirTotalDesconto= new JTextField(""+car.getValorComDesconto());
        exibirTotal.setEditable(false);
        exibirTotal.setEditable(false);

        nomeTotal= new JLabel("Valor Total R$:");
        nomeTotalDesconto= new JLabel("Valor com Desconto R$:");

        JPanel painelTotal=new JPanel();
        painelTotal.setLayout(new BoxLayout(painelTotal,BoxLayout.Y_AXIS));
        painelTotal.add(nomeTotal);
        painelTotal.add(exibirTotal);

        JPanel painelDesconto=new JPanel();
        painelDesconto.setLayout(new BoxLayout(painelDesconto,BoxLayout.Y_AXIS));
        painelDesconto.add(nomeTotalDesconto);
        painelDesconto.add(exibirTotalDesconto);

        add(painelTotal);
        add(painelDesconto);

    }
    public void atualizarValores(){
        exibirTotal.setText(String.valueOf(car.getValorTotal()));
        exibirTotalDesconto.setText(String.valueOf(car.getValorComDesconto()));

    }
}
