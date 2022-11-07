package rslack.tracker.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rslack.tracker.entity.ItemEntity;

@Repository
public interface ItemRepository extends CrudRepository<ItemEntity, String> {
}
