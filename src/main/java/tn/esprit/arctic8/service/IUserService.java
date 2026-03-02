package tn.esprit.arctic8.service;

import tn.esprit.arctic8.entity.User;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IUserService {
    User addUser(User user);

    User updateUser(Long idUser, String firstName);

    void deleteUser(Long idUser);

    List<User> getAllUsers();

    User getUserById(Long idUser);

    List<User> getUserByCinAndDateOfBirth(Long cin, LocalDate start, LocalDate end);

    void assignUserToUserDetails(Long idUser, Long idDetails);
}
