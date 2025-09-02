package rslack.tracker.dao;

import rslack.tracker.entity.ItemEntity;

import java.util.List;
import java.util.UUID;

public interface ItemDAO {
    ItemEntity save(ItemEntity itemEntity);
    ItemEntity update(ItemEntity itemEntity);
    ItemEntity findById(UUID id);
    List<ItemEntity> findAll();
    void delete(UUID id);
}
