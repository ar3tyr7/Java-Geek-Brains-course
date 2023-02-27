package work6;

import java.net.InterfaceAddress;
import java.util.*;

public class notebooks {
    private Integer id;
    private String name;
    private Double price;
    private String description;
    private Double scrnSize;
    private String color;
    private Integer raMemory;
    private Integer hDskSize;
    private String graphicProcessor;
    public notebooks(int id, String name, double price, String description, double scrnSize, String color, int raMemory, int hDskSize, String graphicProcessor) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.scrnSize = scrnSize;
        this.color = color;
        this.raMemory = raMemory;
        this.hDskSize = hDskSize;
        this.graphicProcessor = graphicProcessor;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public Double getScrnSize() {
        return this.scrnSize;
    }

    public String getColor() {
        return this.color;
    }

    public Integer getRaMemory() {
        return this.raMemory;
    }

    public Integer gethDskSize() {
        return this.hDskSize;
    }

    public String getGraphicProcessor() {
        return this.graphicProcessor;
    }
}


