package rslack.tracker.service.impl;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rslack.tracker.dao.ItemDAO;
import rslack.tracker.entity.ItemEntity;
import rslack.tracker.enums.ItemCategoryEnums;
import rslack.tracker.exceptions.ItemNotSavedException;
import rslack.tracker.payload.AddItemRequest;
import rslack.tracker.payload.AddItemResponse;
import rslack.tracker.payload.GetItemResponse;
import rslack.tracker.service.ItemService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static rslack.tracker.utils.MapperUtils.toGetItemsResponse;
import static rslack.tracker.utils.RandomGenerator.generateRandomUUID;

@Service
public class ItemServiceImpl implements ItemService {

    private static final Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);
    private List<ItemEntity> itemList = new ArrayList<>();

    @Autowired
    private ItemDAO itemDAO;

    @Override
    public List<GetItemResponse> getItems() {
        initializeItemList();
        logger.info("itemList has been initialized!");

        List<GetItemResponse> response = new ArrayList<>();
        for (ItemEntity item : itemList) {
            logger.info("new item: " + item.getName());
            response.add(toGetItemsResponse(item));
            logger.info("added new item: " + item.getName());
        }

        return response;
    }

    @Override
    public AddItemResponse addItem(AddItemRequest request) throws ItemNotSavedException {
        ItemEntity newItem = ItemEntity.builder()
                .id(generateRandomUUID())
                .name(request.getName())
                .brand(request.getBrand())
                .category(request.getCategory())
                .quantity(request.getQuantity())
                .price(request.getPrice())
                .build();

        ItemEntity savedItem = itemDAO.save(newItem);
        if (savedItem == null) {
            throw new ItemNotSavedException("Item was not saved!");
        }

        return toAddItemResponse("Item saved", savedItem.getId());
    }

    private void initializeItemList() {
        ItemEntity item = new ItemEntity();
        item.setName("Candy");
        item.setBrand("Maxx");
        item.setCategory(ItemCategoryEnums.FOOD);
        item.setPrice(BigDecimal.valueOf(1));
        item.setId(generateRandomUUID());

        ItemEntity item2 = new ItemEntity();
        item2.setName("Alcohol");
        item2.setBrand("Green cross");
        item2.setCategory(ItemCategoryEnums.HYGIENE);
        item2.setPrice(BigDecimal.valueOf(25));
        item2.setId(generateRandomUUID());

        itemList.add(item);
        itemList.add(item2);
    }

    private AddItemResponse toAddItemResponse(String msg, String id) {
        return AddItemResponse.builder()
                .id(id)
                .message(msg)
                .build();
    }
}
