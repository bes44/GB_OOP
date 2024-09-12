package ru.gb.oseminar;

import java.math.BigDecimal;

/**
 * Класс напитков
 */
public class Drinkables extends Product {
    private Double volume;

    /**
     * Переопределенный конструктор напитков
     *
     * @param name   наименование напитка
     * @param cost  цена напитка
     * @param volume объем напитка
     */
    public Drinkables(String name, double cost, Double volume) {
        super(name, cost);
        this.volume = volume;
    }

    /**
     * Получение объема напитка
     *
     * @return объем напитка
     */
    public Double getVolume() {
        return volume;
    }

    /**
     * Переопределенный метод
     *
     * @return наименование продукта, его стоимость и объем;
     */
    @Override
    public String toString() {
        return super.toString() + "объем = " + volume + " ";
    }

    /**
     * Задание объема напитка с проверкой на некорректное значение
     *
     * @param volume объем напитка
     */
    public void setVolume(Double volume) {
        if (volume > 0) this.volume = volume;
        else System.out.println("Объем напитка должен быть больше нуля!");
    }
}
