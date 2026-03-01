package tn.esprit.arctic8.service;

import tn.esprit.arctic8.entity.User;

import java.util.List;

public interface IUserService {
    User addUser(User user);

    User updateUser(Long idUser, String firstName);

    void deleteUser(Long idUser);

    List<User> getAllUsers();

    User getUserById(Long idUser);
}
