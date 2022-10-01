package rslack.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rslack.tracker.payload.AddItemRequest;
import rslack.tracker.payload.AddItemResponse;
import rslack.tracker.payload.GetItemResponse;
import rslack.tracker.service.ItemService;

import java.util.List;

@RequestMapping("item")
@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping
    public List<GetItemResponse> getItems() {
        return itemService.getItems();
    }

    @PostMapping
    public AddItemResponse addItem(@RequestBody AddItemRequest request) {
        return new AddItemResponse();
    }
}
