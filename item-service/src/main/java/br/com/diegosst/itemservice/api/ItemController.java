package br.com.diegosst.itemservice.api;

import br.com.diegosst.itemservice.entity.Item;
import br.com.diegosst.itemservice.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @GetMapping
    public ResponseEntity<Item> generateItem(
            @RequestParam String code,
            @RequestParam String name,
            @RequestParam String description,
            @RequestParam Double price
    ) {
        Item item = itemService.getItem(code, name, description, price);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

}
