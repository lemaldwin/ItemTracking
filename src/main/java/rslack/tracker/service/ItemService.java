package rslack.tracker.service;

import rslack.tracker.dto.request.AddItemRequest;
import rslack.tracker.dto.response.AddItemResponse;

public interface ItemService {
    AddItemResponse addItem (AddItemRequest request);
}
