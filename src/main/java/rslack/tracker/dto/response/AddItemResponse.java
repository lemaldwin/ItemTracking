package rslack.tracker.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;
import rslack.tracker.dto.ItemDTO;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class AddItemResponse extends BaseResponse {
    private ItemDTO item;
}
