package work6;

import java.util.ArrayList;
import java.util.List;

public class Sclad {

    private List<notebook> notebooks = new ArrayList<>();

    public List<notebook> getNotebooks() {
        return this.notebooks;
    }


    public List<notebook> addNotebook(notebook item) {
        this.notebooks.add(item);
        return this.notebooks;
    }


    public Integer findName(String name) {
        for (notebook item : this.notebooks) {
            if (item.getName() == name) {
                return item.getId();
            }
        }
        return null;
    }
    public Integer findprice(double price) {
        for (notebook item : this.notebooks) {
            if (price == item.getPrice()) {
                return item.getId();
            }
        }
        return null;
    }
}
