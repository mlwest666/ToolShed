package nl.miwnn.se13.mareth.toolshed.controller;

import nl.miwnn.se13.mareth.toolshed.model.Item;
import nl.miwnn.se13.mareth.toolshed.model.Tool;
import nl.miwnn.se13.mareth.toolshed.repositories.ItemRepository;
import nl.miwnn.se13.mareth.toolshed.repositories.ToolRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

/**
 * @author Mareth Westhoff.
 * Doel
 */

@Controller
public class ItemController {
    private final ToolRepository toolRepository;
    private final ItemRepository itemRepository;

    public ItemController(ToolRepository toolRepository, ItemRepository itemRepository) {
        this.toolRepository = toolRepository;
        this.itemRepository = itemRepository;
    }

    @GetMapping("/item/new/{itemId}")
    private String CreateNewItem(@PathVariable("itemId") Long itemId) {
    Optional<Tool> optionalTool = toolRepository.findById(itemId);
    // bepaal of er een tool is, als deze er is create item
        if (optionalTool.isPresent()) {
            Item item = new Item();
            item.setTool(optionalTool.get());
            itemRepository.save(item);
        }
        // sowieso wil je terug sturen
        return "redirect:/";
    }
}
