package rslack.tracker.payload;

import com.sun.istack.NotNull;
import lombok.*;
import rslack.tracker.enums.ItemCategoryEnums;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddItemRequest {

    @NotNull
    String name;

    @NotNull
    String brand;

    ItemCategoryEnums category;

    BigDecimal price;

    String quantity;
}
