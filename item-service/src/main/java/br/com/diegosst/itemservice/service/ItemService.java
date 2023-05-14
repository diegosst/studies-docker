package br.com.diegosst.itemservice.service;

import br.com.diegosst.itemservice.entity.Item;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    public Item getItem(String code, String name, String description, Double price, List<String> attributes) {
        Item item = new Item();
        item.setCode(code);
        item.setName(name);
        item.setDescription(description);
        item.setPrice(price);
        item.setAttributes(attributes);
        return item;
    }
}