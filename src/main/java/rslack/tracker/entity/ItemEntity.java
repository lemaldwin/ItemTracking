package rslack.tracker.entity;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import rslack.tracker.enums.ItemCategoryEnums;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "items")
public class ItemEntity {

    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    UUID id;

    String name;

    String brand;

    @Enumerated(EnumType.STRING)
    ItemCategoryEnums category;

    BigDecimal price;

    String quantity;

    @CreationTimestamp
    @Temporal(TemporalType.DATE)
    Date createdAt;

    @UpdateTimestamp
    @Temporal(TemporalType.DATE)
    Date updatedAt;

    @Temporal(TemporalType.DATE)
    Date deletedAt;

    Boolean isActive;
}
