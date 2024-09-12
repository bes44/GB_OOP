package ru.gb.oseminar;


/**
 * Абстрактный класс всех продуктов
 */
public abstract class Product {
    private String name;
    private double price;

    /**
     * Конструктор по умолчанию, без параметров
     */
    public Product() {
    }

    /**
     * Конструктор с двумя аргументами
     *
     * @param name  Наименование продукта
     * @param price Цена продукта
     */
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    public double getCost() {
        return price;
    }
    /**
     * Задание цены продукта с проверкой на корректность цены
     *
     * @param price цена продукта
     */
    public void setPrice(double price) {
        if (price >= 0)  this.price = price;
        else System.out.println("Стоимость не может быть равна или меньше нуля!");
    }


    @Override
    public String toString() {
        return "\"" + name + "\" стоит: " + price + " у.е. ";
    }
}
