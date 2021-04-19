package com.lesson6.Blinov.Task1;

import java.util.ArrayList;
import java.util.List;

//Создать класс Payment с внутренним классом, с помощью объектов которого
//можно сформировать покупку из нескольких товаров.
public class Payment {
    private List<Goods> basket=new ArrayList<>();
    private int summ=0;

    public void putGoods(String name, float cost){
        Goods goods=new Goods();
        goods.setName(name);
        goods.setCost(cost);
        basket.add(goods);
    }
    public int getSumm(){
        for (Goods goods : basket)
            summ+=goods.getCost();
        return summ;
    }
    public class Goods {
        private String name;
        private float cost;

        public float getCost() {
            return cost;
        }

        public String getName() {
            return name;
        }

        public void setCost(float cost) {
            this.cost = cost;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public void printList(){
        for(Goods goods : basket) {
            System.out.println("Наименование товара: " +goods.getName()+" Цена: "+goods.getCost());
            System.out.println("Общая сумма покупки: "+getSumm());
        }
    }
}
