package main.java.ru.gb.oseminar;


import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrinks implements VendingMachine {
    List<HotDrinks> hotDrinksList = new ArrayList<>();
    List<HotDrinks> resultFind = new ArrayList<>();


    @Override
    public void initProduct() {
    }

    public void initProduct(List<HotDrinks> list) {
        this.hotDrinksList = list;
    }


    @Override
    public String getProduct() {
        return null;
    }


    public String getProduct(String name) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getName().equals(name)) resultFind.add(el);
        }
        return resultFind.toString();
    }


    public String getProduct(double price) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getPrice()== price)  resultFind.add(el);
        }
        return resultFind.toString();
    }

    public String getProduct(int temp) {
        resultFind.clear();
        for (HotDrinks el : hotDrinksList) {
            if (el.getTemp() <= temp) resultFind.add(el);
        }
        return resultFind.toString();
    }
}
