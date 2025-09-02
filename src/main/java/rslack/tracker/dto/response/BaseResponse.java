package rslack.tracker.dto.response;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BaseResponse {
    private String status;
    private String traceId;
    private String code;
    private String message;
}
