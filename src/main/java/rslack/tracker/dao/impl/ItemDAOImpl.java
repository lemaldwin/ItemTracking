package rslack.tracker.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rslack.tracker.dao.ItemDAO;
import rslack.tracker.entity.ItemEntity;
import rslack.tracker.repository.ItemRepository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

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

        List<ItemEntity> itemList = new ArrayList<>();
        itemRepository.findAll().forEach(itemList::add);
        return itemList;
//        List<ItemEntity> itemList = new ArrayList<>();
//        Iterator<ItemEntity> iterator = itemRepository.findAll().iterator();
//        while (iterator.hasNext()) {
//            itemList.add(iterator.next());
//        }
//        return itemList;
    }

    @Override
    public ItemEntity getItemById(String id) {
        return null;
    }

    @Override
    public void deleteItem(String id) {
        itemRepository.deleteById(id);
    }
}
