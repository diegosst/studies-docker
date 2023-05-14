package br.com.diegosst.itemservice.service;

import br.com.diegosst.itemservice.entity.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ItemServiceTest {

    @InjectMocks
    private ItemService itemService;

    @Test
    public void testGenerateItem() {
        Item item = new Item();
        item.setCode("1234");
        item.setName("Test Item");
        item.setDescription("This is a test item");
        item.setPrice(10.0);
        item.setAttributes(List.of("movie", "CD"));

        Item result = itemService.getItem("1234", "Test Item", "This is a test item", 10.0, List.of("movie", "CD"));

        assertThat(result.getCode()).isEqualTo(item.getCode());
        assertThat(result.getName()).isEqualTo(item.getName());
        assertThat(result.getDescription()).isEqualTo(item.getDescription());
        assertThat(result.getPrice()).isEqualTo(item.getPrice());
        assertThat(result.getAttributes()).isEqualTo(item.getAttributes());
    }
}