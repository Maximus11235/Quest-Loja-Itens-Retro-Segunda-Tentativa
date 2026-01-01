import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class painelItemVenda extends JPanel{
    private itemVenda item;
    private carrinho carrinho;

    
    public painelItemVenda(itemVenda item, carrinho carrinho){
        this.item= item;
        this.carrinho= carrinho;
        
        JLabel nome= new JLabel(item.getNome());
        JLabel valor= new JLabel("R$"+ item.getPrecoStr());
        JLabel imagem= new JLabel(item.getImagempath());
        JButton adicionarButton= new JButton("adicionarButton");

        adicionarButton.addActionListener(e->{
            carrinho.adicionar(item);
        });
        add(nome);
        add(valor);
        add(imagem);
        add(adicionarButton);

    }

    
    public itemVenda getItem() {
        return item;
    }

    public void setItem(itemVenda item) {
        this.item = item;
    }

    public carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(carrinho carrinho) {
        this.carrinho = carrinho;
    }


}
