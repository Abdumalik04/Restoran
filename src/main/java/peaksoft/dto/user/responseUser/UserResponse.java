package peaksoft.dto.user.responseUser;

import lombok.*;
import peaksoft.enums.Role;

import java.time.ZonedDateTime;
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Long id;
    private String fistName;
    private String lastName;
    private ZonedDateTime dateOfBirth;
    private String email;
    private String password;
    private String phoneNumber;
    private Role role;
    private int experience;
}
