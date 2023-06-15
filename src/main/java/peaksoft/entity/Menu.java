package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "menu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Menu {
    @Id
    @GeneratedValue(generator = "menu_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "menu_gen", sequenceName = "menu_seq", allocationSize = 1)
    private Long id;
    private String image;
    private int price;
    private String description;
    private Boolean isVegetarian;
    @ManyToOne(cascade = {ALL})
    private Restaurant restaurant;
    @OneToOne(cascade = {ALL})
    private StopList stopList;
    @ManyToMany(cascade = {ALL})
    private List<Cheque> cheque;
    @OneToMany(mappedBy = "menu", cascade = {DETACH, MERGE, REFRESH})
    private List<Subcategory> subcategory;


    public Menu(String image, int price, String description, Boolean isVegetarian) {
        this.image = image;
        this.price = price;
        this.description = description;
        this.isVegetarian = isVegetarian;
    }
}
