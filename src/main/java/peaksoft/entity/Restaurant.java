package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

import static jakarta.persistence.CascadeType.ALL;

@Entity
@Table(name = "restaurant")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Restaurant {
    @Id
    @GeneratedValue(generator = "restaurant_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "restaurant_gen",sequenceName = "restaurant_seq",allocationSize = 1)
    private Long id;
    private String name;
    private String location;
    private String restType;
    private int numberOfEmployees;
    private String service;
    @OneToMany(mappedBy = "restaurant",cascade = ALL)
    private List<Users>users;
    @OneToMany(mappedBy = "restaurant",cascade = ALL)
    private List<Menu> menu;


    public Restaurant(String name, String location, String restType, int numberOfEmployees, String service) {
        this.name = name;
        this.location = location;
        this.restType = restType;
        this.numberOfEmployees = numberOfEmployees;
        this.service = service;
    }
}
