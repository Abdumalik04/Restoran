package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.ZonedDateTime;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "cheque")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cheque {
    @Id
    @GeneratedValue(generator = "cheque_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "cheque_gen", sequenceName = "cheque_seq", allocationSize = 1)
    private Long id;
    private int priceAverage;
    private ZonedDateTime createdAt;
    @OneToMany(cascade = {DETACH, MERGE, REFRESH}, mappedBy = "cheque")
    private List<Users> users;
    @ManyToMany(mappedBy = "cheque",cascade = {DETACH, MERGE, REFRESH})
    private List<Menu>menus;

    public Cheque(int priceAverage, ZonedDateTime createdAt) {
        this.priceAverage = priceAverage;
        this.createdAt = createdAt;
    }
}
