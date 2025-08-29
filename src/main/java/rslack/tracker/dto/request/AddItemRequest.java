package rslack.tracker.dto.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddItemRequest {
    private String name;
    private String type;
    private BigDecimal price;
}
