package mi.dio.santander_back_end.service;

import mi.dio.santander_back_end.model.User;

public interface UserSerevice {
    User findById(Long id);
    User create(User userToCreate);
}
