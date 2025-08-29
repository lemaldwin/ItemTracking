package rslack.tracker.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import rslack.tracker.dto.request.AddItemRequest;
import rslack.tracker.dto.response.AddItemResponse;
import rslack.tracker.dto.ItemDTO;
import rslack.tracker.service.ItemService;

import java.util.UUID;

@Service
@Slf4j
public class ItemServiceImpl implements ItemService {

    @Override
    public AddItemResponse addItem(AddItemRequest request) {
        log.info("add new item");

        // save the item to db
//        ItemEntity newEntity = convertRequestToItemEntity(request)
//        ItemEntity savedEntity = itemDAO.save(newEntity);
//        convertItemEntityToItemDTO(savedEntity);
        return convertToAddItemResponse(request);
    }

    private AddItemResponse convertToAddItemResponse(AddItemRequest request) {
        return AddItemResponse.builder()
                .message("Added item successfully")
                .code("IT-00")
                .traceId(UUID.randomUUID().toString())
                .status("SUCCESS")
                .item(convertRequestToItemDTO(request))
                .build();
    }

    private ItemDTO convertRequestToItemDTO(AddItemRequest request) {
        return ItemDTO.builder()
                .id(UUID.randomUUID())
                .name(request.getName())
                .type(request.getType())
                .price(request.getPrice())
                .build();
    }
}
