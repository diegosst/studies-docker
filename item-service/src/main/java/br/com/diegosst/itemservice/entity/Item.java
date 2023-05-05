package br.com.diegosst.itemservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Item {
    private String name;
    private String description;
    private Double price;
}
