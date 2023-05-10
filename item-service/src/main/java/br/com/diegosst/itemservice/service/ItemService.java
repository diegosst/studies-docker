package br.com.diegosst.itemservice.service;

import br.com.diegosst.itemservice.entity.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    public Item getItem(String code, String name, String description, Double price) {
        Item item = new Item();
        item.setCode(code);
        item.setName(name);
        item.setDescription(description);
        item.setPrice(price);
        return item;
    }
}