package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.ZonedDateTime;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "stopList")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StopList {
    @Id
    @GeneratedValue(generator = "stopList_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "stopList_gen",sequenceName = "stopList_seq",allocationSize = 1)
    private Long id;
    private String reason;
    private ZonedDateTime date;
    @OneToOne(cascade = {DETACH,MERGE,REFRESH,PERSIST})
    private Menu menu;

    public StopList(String reason, ZonedDateTime date) {
        this.reason = reason;
        this.date = date;
    }
}
