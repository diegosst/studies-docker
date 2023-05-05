package br.com.diegosst.itemservice.api;

import br.com.diegosst.itemservice.entity.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemController {

    @GetMapping
    public List<Item> getItems() {
        return List.of(
               new Item("Sword", "A sturdy steel sword", 50.0),
               new Item("Shield", "A large wooden shield", 35.0),
               new Item("Healing Potion", "Restores 50 health points", 10.0),
               new Item("Bow", "A sturdy longbow made of yew wood", 70.0),
               new Item("Arrow", "A basic arrow for archery", 1.0),
               new Item("Staff", "A powerful wooden staff", 80.0),
               new Item("Robe", "A magical robe", 45.0),
               new Item("Tome", "A powerful spellbook", 100.0),
               new Item("Ring", "A ring with magical properties", 60.0),
               new Item("Amulet", "A magical amulet", 55.0)
        );
    }

}
