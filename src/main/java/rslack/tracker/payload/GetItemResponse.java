package rslack.tracker.payload;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GetItemResponse {
    UUID id;
    String name;
    String quantity;
    BigDecimal price;
}
