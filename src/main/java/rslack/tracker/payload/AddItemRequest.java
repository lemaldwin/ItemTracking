package rslack.tracker.payload;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import rslack.tracker.enums.ItemCategoryEnums;

import java.math.BigDecimal;

@Data
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
