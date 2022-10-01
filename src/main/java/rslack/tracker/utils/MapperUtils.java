package rslack.tracker.utils;

import rslack.tracker.entity.ItemEntity;
import rslack.tracker.payload.GetItemResponse;

public class MapperUtils {
    public static GetItemResponse toGetItemsResponse(ItemEntity item) {

        return GetItemResponse.builder()
                .id(item.getId())
                .name(item.getName())
                .quantity(item.getQuantity())
                .price(item.getPrice())
                .build();
    }
}
