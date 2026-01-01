import java.util.ArrayList;

public class carrinho {
    private ArrayList<itemVenda> carrinho= new ArrayList<>();
    private double valorTotal;
    private double valorDesconto=0.85;
    private double valorComDesconto;

    public double getValorComDesconto() {
        return valorComDesconto;
    }
    public void setValorComDesconto(){
        valorComDesconto= getValortotal()*valorDesconto;
    }
    public void setValorTotal() {
        this.valorTotal = getValortotal();
    }
    public double getValortotal(){
        valorTotal=0;
        for(itemVenda item : carrinho){
            valorTotal+=item.getPreco();
        }
        return valorTotal;
    }
    public void converter(String )
}