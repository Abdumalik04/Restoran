package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "subcategory")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Subcategory {
    @Id
    @GeneratedValue(generator = "subcategory_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "subcategory_gen",sequenceName = "subcategory_seq",allocationSize = 1)
    private Long id;
    private String name;
   @OneToMany(cascade = {DETACH,MERGE,REFRESH},mappedBy = "subcategory")
    private List<Category> category;
    @ManyToOne(cascade = {ALL})
   private Menu menu;
    public Subcategory(String name) {
        this.name = name;
    }
}
