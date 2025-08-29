package rslack.tracker.payload;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetItemResponse {
    String id;
    String name;
    String quantity;
    BigDecimal price;
}
