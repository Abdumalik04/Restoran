package peaksoft.dto.user.requestUser;

import lombok.Builder;
import peaksoft.enums.Role;

import java.time.ZonedDateTime;
@Builder
public record UserRequest(String firstName, String lastName, ZonedDateTime dateOfBirth, String email, String password,
                          Role role,int experience){
    public UserRequest {
    }
}
