package peaksoft.service;

import peaksoft.dto.SimpleResponse;
import peaksoft.dto.user.requestUser.UserRequest;
import peaksoft.dto.user.responseUser.UserResponse;

import java.util.List;

public interface UserService {

    SimpleResponse save(UserRequest userRequest);
    List<UserResponse>getAll();
    SimpleResponse getById(Long id);
    SimpleResponse update(Long id,UserRequest userRequest);
    SimpleResponse delete(Long id);
}
