package tn.esprit.arctic8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic8.entity.User;

import java.time.LocalDate;
import java.util.List;

@Repository //java + options
public interface IUserRepo extends JpaRepository<User, Long> {

    default List<User> findUsersByCinAAndAndDateOfBirthBetween(Long cin, LocalDate start, LocalDate end) {
        return null;
    }


}
