package logica;
import java.util.ArrayList;

public class listaPainelItem {
    private ArrayList<itemVenda> listaItem= new ArrayList<>();

    public void add(itemVenda item) {
        listaItem.add(item);
    }
    public ArrayList<itemVenda> getLista(){
        return listaItem;
    }
}
