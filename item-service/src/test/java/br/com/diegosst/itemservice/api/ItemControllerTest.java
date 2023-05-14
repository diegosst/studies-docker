package br.com.diegosst.itemservice.api;

import br.com.diegosst.itemservice.entity.Item;
import br.com.diegosst.itemservice.service.ItemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.mockito.Mockito.when;

@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @MockBean
    private ItemService itemService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGenerateItem() throws Exception {
        Item item = new Item();
        item.setCode("1234");
        item.setName("Test Item");
        item.setDescription("This is a test item");
        item.setPrice(10.0);

        when(itemService.getItem("1234", "Test Item", "This is a test item", 10.0, List.of("movie", "CD"))).thenReturn(item);

        mockMvc.perform(MockMvcRequestBuilders.get("/item")
                        .param("code", "1234")
                        .param("name", "Test Item")
                        .param("description", "This is a test item")
                        .param("price", "10.0")
                        .param("attributes", "movie", "CD")
                        .contentType(MediaType.APPLICATION_JSON)
                )
                .andExpect(MockMvcResultMatchers.status().isCreated())
                .andExpect(MockMvcResultMatchers.jsonPath("$.code").value("1234"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.name").value("Test Item"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.description").value("This is a test item"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.price").value(10.0))
                .andExpect(MockMvcResultMatchers.jsonPath("$.attributes").isArray())
                .andExpect(MockMvcResultMatchers.jsonPath("$.attributes[0]").value("movie"))
                .andExpect(MockMvcResultMatchers.jsonPath("$.attributes[1]").value("CD"));
    }
}