import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
public class painelItemVenda extends JPanel{
    private itemVenda item;
    private carrinho carrinho;

    
    public painelItemVenda(itemVenda item){
        this.item= item;
        
        ImageIcon icone=new ImageIcon(getClass().getResource(item.getImagempath()));
        Image imagemR=icone.getImage().getScaledInstance(120,240,Image.SCALE_REPLICATE);
        ImageIcon iconeR=new ImageIcon(imagemR);

        JLabel nome= new JLabel(item.getNome());
        JLabel valor= new JLabel("R$"+ item.getPrecoStr());
        JLabel imagem= new JLabel(iconeR);
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

}
