package rslack.tracker.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import rslack.tracker.dao.ItemDAO;
import rslack.tracker.dto.request.AddItemRequest;
import rslack.tracker.dto.response.AddItemResponse;
import rslack.tracker.dto.ItemDTO;
import rslack.tracker.entity.ItemEntity;
import rslack.tracker.service.ItemService;

import java.util.UUID;

@Service
@Slf4j
public class ItemServiceImpl implements ItemService {

    ItemDAO itemDAO;

    ItemServiceImpl(ItemDAO itemDAO) {
        this.itemDAO = itemDAO;
    }

    @Override
    public AddItemResponse addItem(AddItemRequest request) {
        log.info("add new item");

        // save the item to db
        ItemEntity newEntity = convertRequestToItemEntity(request);
        ItemEntity savedEntity = itemDAO.save(newEntity);

        ItemDTO itemDTO = convertItemEntityToItemDTO(savedEntity);
        return convertToAddItemResponse(itemDTO);
    }

    private ItemDTO convertItemEntityToItemDTO(ItemEntity savedEntity) {
        return ItemDTO.builder()
                .id(savedEntity.getId())
                .name(savedEntity.getName())
                .type(savedEntity.getType())
                .price(savedEntity.getPrice())
                .build();
    }

    private ItemEntity convertRequestToItemEntity(AddItemRequest request) {
        return ItemEntity.builder()
                .name(request.getName())
                .type(request.getType())
                .price(request.getPrice())
                .build();
    }

    private AddItemResponse convertToAddItemResponse(ItemDTO itemDTO) {
        return AddItemResponse.builder()
                .message("Added item successfully")
                .code("IT-00")
                .traceId(UUID.randomUUID().toString())
                .status("SUCCESS")
                .item(itemDTO)
                .build();
    }
}
