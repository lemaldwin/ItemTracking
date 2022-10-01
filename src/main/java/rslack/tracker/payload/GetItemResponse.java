package rslack.tracker.payload;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetItemResponse {
    String id;
    String name;
    String quantity;
    BigDecimal price;
}
