package logica;
import java.util.ArrayList;

public class Carrinho {
    /*Funções:
    - adiciona instâncias de venda
    - remove instâncias de venda
    - calcula o valor total
    - calcula o valor total com desconto */
    private ArrayList<itemVenda> carrinho= new ArrayList<>();
    private double valorTotal;
    private final double valorDesconto=0.85;

    
    public void adicionar(itemVenda obj){
        if(carrinho.stream().anyMatch(itemVenda->itemVenda.getNome().equals(obj.getNome()))){
            return;
        }
        else{
            carrinho.add(obj);
        }
    }
    public void remover(itemVenda obj){
        carrinho.remove(obj);
    }
    public double getValorComDesconto(){
        if(getValorTotal()>150){
            return getValorTotal()*valorDesconto;
        }
        return getValorTotal();
    }
    public void setValorTotal() {
        this.valorTotal = getValorTotal();
    }
    public double getValorTotal(){
        valorTotal=0;
        for(itemVenda item : carrinho){
            valorTotal+=item.getPreco();
        }
        return valorTotal;
    }
    
}