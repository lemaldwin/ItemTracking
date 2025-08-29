package rslack.tracker.entity;


import com.sun.istack.NotNull;
import lombok.*;
import rslack.tracker.enums.ItemCategoryEnums;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

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
    UUID id;

    @NotNull
    String name;

    @NotNull
    String brand;

    @Enumerated(EnumType.STRING)
    ItemCategoryEnums category;

    BigDecimal price;

    String quantity;
}
