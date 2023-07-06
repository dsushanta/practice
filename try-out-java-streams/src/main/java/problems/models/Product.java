package problems.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.With;

import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long id;

    private String name;

    private String category;

    @With
    private Double price;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Set<Order> orders;

}
