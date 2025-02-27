package org.fastfood.domain;

public class Order {

    private String text;

    public Order(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
