package rslack.tracker.dao.impl;

import org.springframework.stereotype.Service;
import rslack.tracker.dao.ItemDAO;
import rslack.tracker.entity.ItemEntity;
import rslack.tracker.repository.ItemRepository;

import java.util.List;
import java.util.UUID;

@Service
public class ItemDAOImpl implements ItemDAO {

    ItemRepository itemRepository;

    ItemDAOImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public ItemEntity save(ItemEntity itemEntity) {
        return itemRepository.save(itemEntity);
    }

    @Override
    public ItemEntity update(ItemEntity itemEntity) {
        return itemRepository.save(itemEntity);
    }

    @Override
    public ItemEntity findById(UUID id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public List<ItemEntity> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public void delete(UUID id) {
        itemRepository.deleteById(id);
    }
}
