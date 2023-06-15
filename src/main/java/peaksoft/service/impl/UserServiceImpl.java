package peaksoft.service.impl;

import peaksoft.dto.SimpleResponse;
import peaksoft.dto.user.requestUser.UserRequest;
import peaksoft.dto.user.responseUser.UserResponse;
import peaksoft.repository.UserRepository;
import peaksoft.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public SimpleResponse save(UserRequest userRequest) {
        return null;
    }

    @Override
    public List<UserResponse> getAll() {
        return null;
    }

    @Override
    public SimpleResponse getById(Long id) {
        return null;
    }

    @Override
    public SimpleResponse update(Long id, UserRequest userRequest) {
        return null;
    }

    @Override
    public SimpleResponse delete(Long id) {
        return null;
    }
}
