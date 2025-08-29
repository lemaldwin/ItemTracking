package rslack.tracker.payload;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddItemResponse {
    String message;
    String id;
}
