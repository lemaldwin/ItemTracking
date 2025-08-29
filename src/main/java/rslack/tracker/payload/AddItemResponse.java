package rslack.tracker.payload;


import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddItemResponse {
    String message;
    UUID id;
}
