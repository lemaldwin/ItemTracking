package rslack.tracker.entity;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rslack.tracker.enums.ItemCategoryEnums;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ItemEntity {

    @NotNull
    @Id
    String id;

    @NotNull
    String name;

    @NotNull
    String brand;

    @Enumerated(EnumType.STRING)
    ItemCategoryEnums category;

    BigDecimal price;

    String quantity;
}
