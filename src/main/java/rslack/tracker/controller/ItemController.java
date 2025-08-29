package rslack.tracker.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rslack.tracker.dto.request.AddItemRequest;
import rslack.tracker.dto.response.AddItemResponse;
import rslack.tracker.service.ItemService;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    private final ItemService itemService;

    ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping("/add")
    public ResponseEntity<AddItemResponse> addItem (@RequestBody AddItemRequest request) throws Exception {
        AddItemResponse response = itemService.addItem(request);
        return new ResponseEntity<>(response , HttpStatus.OK);
    }
}
