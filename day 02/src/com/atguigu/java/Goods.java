package com.atguigu.java;

import org.junit.Test;

/**
 * @author HG
 * @create 2021-10-27-10:05
 */
public class Goods implements Comparable{
    private int name;
    private double price;

    public Goods() {
    }

    public Goods(int number, double price) {
        this.name = number;
        this.price = price;
    }

    public int getNumber() {
        return name;
    }

    public void setNumber(int number) {
        this.name = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name=" + name +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }


}
