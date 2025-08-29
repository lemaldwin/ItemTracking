package rslack.tracker.dto.response;

import lombok.*;
import rslack.tracker.dto.ItemDTO;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddItemResponse {
    private String status;
    private String traceId;
    private String code;
    private String message;
    private ItemDTO item;

}
