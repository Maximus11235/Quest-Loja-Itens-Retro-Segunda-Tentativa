import javax.swing.ImageIcon;
import javax.swing.*;
import java.awt.*;

    /*esse é o construtor das instancias de itens a serem adicionados no carrinho */
public class painelItemVenda extends JPanel{
    private itemVenda item;
    private carrinho car;
    
    public painelItemVenda(itemVenda item, carrinho carrinho){
        this.item= item;
        this.car= carrinho;
        ImageIcon imagemOriginal=new ImageIcon(getClass().getResource(item.getImagempath()));
        Image imagemMaior= imagemOriginal.getImage();
        Image imagemMenor=imagemMaior.getScaledInstance(100,140,Image.SCALE_SMOOTH);
        ImageIcon iconeR= new ImageIcon(imagemMenor);
        JLabel imagem= new JLabel(iconeR);
        
        JLabel nome= new JLabel(item.getNome());
        JLabel valor= new JLabel("R$"+ item.getPrecoStr());
        JButton adicionarButton= new JButton("adicionarButton");
        
        adicionarButton.addActionListener(e->{
            car.adicionar(item);
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
