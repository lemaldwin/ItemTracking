package rslack.tracker.dto;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemDTO {
    private UUID id;
    private String name;
    private String type;
    private BigDecimal price;
}
