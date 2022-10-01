package rslack.tracker.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import rslack.tracker.entity.ItemEntity;
import rslack.tracker.enums.ItemCategoryEnums;
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
    List<ItemEntity> itemList = new ArrayList<>();

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
    public AddItemResponse addItem(AddItemRequest request) {
        return null;
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
}
