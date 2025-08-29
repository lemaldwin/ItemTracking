package rslack.tracker.entity;


import com.sun.istack.NotNull;
import lombok.*;
import rslack.tracker.enums.ItemCategoryEnums;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "items")
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
