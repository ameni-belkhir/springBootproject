package tn.esprit.arctic8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic8.entity.User;
import tn.esprit.arctic8.entity.UserDetails;

import java.time.LocalDate;
import java.util.List;

@Repository //java + options
public interface IUserRepo extends JpaRepository<User, Long> {

    List<User> findUsersByCinAndDateOfBirthBetween(Long cin, LocalDate start, LocalDate end);

    @Query(value = "SELECT * FROM user WHERE cin = :cin", nativeQuery = true)
    User chercherParCin(@Param("cin") long cin);

    @Query("select u from User u where u.cin = :cin")
    User chercherParCinJPQL(@Param("cin") long cin);

    //@Query(value = "select u from UserDetails u join u.details details where details.description =:description", nativeQuery = false)
    //UserDetails chercherUserParDescription(@Param("cin")long cin);

    @Query("select u from User u where u.firstName =:nom1")
    User chercherUserParNom(@Param("nom1")String nom);

}
