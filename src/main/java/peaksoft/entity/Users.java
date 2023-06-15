package peaksoft.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import peaksoft.enums.Role;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.List;

import static jakarta.persistence.CascadeType.*;

@Entity
@Table(name = "users")
@Getter@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Users implements UserDetails {
    @Id
    @GeneratedValue(generator = "users_gen",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "users_gen",sequenceName = "users_seq",allocationSize = 1)
    private Long id;
    private String fistName;
    private String lastName;
    private ZonedDateTime dateOfBirth;
    private String email;
    private String password;
    private String phoneNumber;
    private Role role;
    private int experience;
    @ManyToOne(cascade = {DETACH,MERGE,REFRESH,PERSIST})
    private Restaurant restaurant;
    @ManyToOne(cascade = {ALL})
    private Cheque cheque;



    public Users(String fistName, String lastName, ZonedDateTime dateOfBirth, String email, String password, String phoneNumber, Role role, int experience) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.role = role;
        this.experience = experience;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
