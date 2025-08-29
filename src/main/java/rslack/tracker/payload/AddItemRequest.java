package rslack.tracker.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import rslack.tracker.enums.ItemCategoryEnums;

import java.math.BigDecimal;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddItemRequest {
    String name;
    String brand;
    ItemCategoryEnums category;
    BigDecimal price;
    String quantity;
}
