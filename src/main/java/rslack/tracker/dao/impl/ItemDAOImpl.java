package rslack.tracker.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rslack.tracker.dao.ItemDAO;
import rslack.tracker.entity.ItemEntity;
import rslack.tracker.repository.ItemRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ItemDAOImpl implements ItemDAO {

    @Autowired
    ItemRepository itemRepository;

    @Override
    public ItemEntity save(ItemEntity entity) {
        return itemRepository.save(entity);
    }

    @Override
    public ItemEntity updateItem(ItemEntity entity) {
        return itemRepository.save(entity);
    }

    @Override
    public List<ItemEntity> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public ItemEntity getItemById(String id) {
        return null;
    }

    @Override
    public void deleteItem(UUID id) {
        itemRepository.deleteById(id);
    }
}
