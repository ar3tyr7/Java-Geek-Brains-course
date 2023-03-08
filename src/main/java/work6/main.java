package work6;

import java.util.ArrayList;
import java.util.*;
public class main {
    public static void main(String[] args) {
        notebook lenovo = new notebook(123, "Lenovo", 900.1, "Новая модель линейки леново..", 13, "red", 12, 500, "Nvidea");
        notebook hp1 = new notebook(23, "HP_13_vision", 334, "Опитимальная модель НР...", 13, "black", 8, 250, "Radeon");
        notebook hp2 = new notebook(234, "HP_VAC", 512, "Опитимальная модель НР...", 15, "silver", 12, 500, "Radeon");
        notebook acer = new notebook(222, "ACER-turbus", 604, "Опитимальная модель acer...", 12, "yellow", 12, 1024, "Radeon");
        notebook asus = new notebook(222, "asus_veta", 604, "Опитимальная модель acer...", 12, "black", 24, 1024, "Radeon-2000");
        Sclad notebooks = new Sclad();
        notebooks.addNotebook(lenovo);
        notebooks.addNotebook(hp1);
        notebooks.addNotebook(hp2);
        notebooks.addNotebook(acer);
        notebooks.addNotebook(asus);
        System.out.println(notebooks.findprice(900.1));
        System.out.println(notebooks.findName("ACER-turbus"));

    }



}


