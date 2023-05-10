package br.com.diegosst.itemservice.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {

    private Long id;

    private String code;

    private String name;

    private String description;

    private Double price;
}