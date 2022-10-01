package rslack.tracker.service;

import rslack.tracker.payload.AddItemRequest;
import rslack.tracker.payload.AddItemResponse;
import rslack.tracker.payload.GetItemResponse;

import java.util.List;

public interface ItemService {
    List<GetItemResponse> getItems();
    AddItemResponse addItem(AddItemRequest request);
}
