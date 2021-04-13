package com.streamliners.models;

public class Variant {
    String name;
    Float price;

    public Variant(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Variant{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
