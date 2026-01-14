package painel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import logica.Carrinho;
import logica.itemVenda;
import logica.listaPainelItem;

    /*Esse arquivo gerencia a tela principal e cria todas as instâncias de objetos dentro dela*/
public class telaPrincipal extends JFrame {

    public telaPrincipal(listaPainelItem itens, Carrinho carrinho){
        setTitle("Loja");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setResizable(false);
        
        JPanel painelItem= new JPanel();
        painelItem.setLayout(new GridLayout(1,3));
        
        JPanel painelCarro= new JPanel();
        painelCarro.setLayout(new GridBagLayout());
        painelCarrinho painel2= new painelCarrinho(carrinho);
        painelCarro.add(painel2);

        for(itemVenda item : itens.getLista()){
            painelItemVenda painel = new painelItemVenda(item, carrinho, painel2);
            painelItem.add(painel);
        }
        
        add(painelItem, BorderLayout.NORTH);
        add(painelCarro, BorderLayout.CENTER);
        

        setVisible(true);
    }

}