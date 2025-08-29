package rslack.tracker.dao;

import rslack.tracker.entity.ItemEntity;

import java.util.List;
import java.util.UUID;

public interface ItemDAO {
    //Add functionalities for DB here
    ItemEntity save(ItemEntity entity);
    ItemEntity updateItem(ItemEntity entity);
    List<ItemEntity> getAllItems();
    ItemEntity getItemById(String id);
    void deleteItem(UUID id);
}
