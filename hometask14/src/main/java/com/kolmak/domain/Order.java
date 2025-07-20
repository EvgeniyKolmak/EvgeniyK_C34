package com.kolmak.domain;

import lombok.*;

import java.util.Objects;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Order {

    private Integer id;
    private String name;
    private String status;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(name, order.name) && Objects.equals(status, order.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, status);
    }
}
