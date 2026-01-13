package painel;
import javax.swing.*;

import logica.Carrinho;
import logica.itemVenda;

import java.awt.*;

    /*esse é o construtor das instancias de itens a serem adicionados no carrinho */
    public class painelItemVenda extends JPanel{
        private itemVenda item;
        private Carrinho car;
        painelCarrinho p;
        public painelItemVenda(itemVenda item, Carrinho carrinho, painelCarrinho pCarrinho){
            this.item= item;
            this.car= carrinho;
            this.p= pCarrinho;
            setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

            ImageIcon imagemOriginal=new ImageIcon(getClass().getResource(item.getImagempath()));
            Image imagemMaior= imagemOriginal.getImage();
            Image imagemMenor=imagemMaior.getScaledInstance(100,140,Image.SCALE_SMOOTH);
            ImageIcon iconeR= new ImageIcon(imagemMenor);
            JLabel imagem= new JLabel(iconeR);

            JLabel nome= new JLabel(item.getNome());
            JLabel valor= new JLabel("R$"+ item.getPrecoStr());
            JButton adicionarButton= new JButton("adicionar");

            adicionarButton.addActionListener(e->{
                car.adicionar(item);
                p.atualizarValores();
            });

            nome.setAlignmentX(Component.CENTER_ALIGNMENT);
            imagem.setAlignmentX(Component.CENTER_ALIGNMENT);
            valor.setAlignmentX(Component.CENTER_ALIGNMENT);
            adicionarButton.setAlignmentX(Component.CENTER_ALIGNMENT);

            add(nome);
            add(imagem);
            add(valor);
            add(adicionarButton);
    }
    
        public itemVenda getItem() {
        return item;
    }
        public void setItem(itemVenda item) {
        this.item = item;
    }

    }
