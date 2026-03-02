package tn.esprit.arctic8.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.arctic8.entity.User;
import tn.esprit.arctic8.entity.UserDetails;
import tn.esprit.arctic8.repository.IUserDetailsRepo;
import tn.esprit.arctic8.repository.IUserRepo;

import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor //assurer l'injection des dépondances
public class UserServiceImpl implements IUserService {

    IUserRepo userRepo;
    IUserDetailsRepo userDetailsRepo;


    @Override
    public User addUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public User updateUser(Long idUser, String firstName) {
        User u = userRepo.findById(idUser).orElse(null); // recuperation
        u.setFirstName(firstName);
        return userRepo.save(u) ;
    }

    @Override
    public void deleteUser(Long idUser) {
        userRepo.deleteById(idUser);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(Long idUser) {
        return userRepo.findById(idUser).orElse(null);
    }

    @Override
    public List<User> getUserByCinAndDateOfBirth(Long cin, LocalDate start, LocalDate end) {
        return userRepo.findUsersByCinAAndAndDateOfBirthBetween(cin, start, end);
    }

    @Override
    public void assignUserToUserDetails(Long idUser, Long idDetails) {
        User user = userRepo.findById(idUser).orElse(null);
        UserDetails userDetails = userDetailsRepo.findById(idDetails).orElse(null);
        userDetails.setUser(user);
        userDetailsRepo.save(userDetails);

    }
}
