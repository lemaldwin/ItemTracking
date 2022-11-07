package rslack.tracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rslack.tracker.exceptions.ItemNotSavedException;
import rslack.tracker.payload.AddItemRequest;
import rslack.tracker.payload.AddItemResponse;
import rslack.tracker.payload.GetItemResponse;
import rslack.tracker.service.ItemService;

import java.util.List;
import java.util.Map;

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
    public AddItemResponse addItem(@RequestBody AddItemRequest request) throws ItemNotSavedException {
        return itemService.addItem(request);
    }

    @ExceptionHandler(ItemNotSavedException.class)
    @ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
    public Map<String, String> handleItemNotSavedException( ItemNotSavedException e) {
        return Map.of("ItemNotSavedException", e.getMessage());
    }

}
