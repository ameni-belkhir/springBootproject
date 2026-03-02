package tn.esprit.arctic8.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.arctic8.entity.UserDetails;
@Repository
public interface IUserDetailsRepo extends JpaRepository<UserDetails, Long> {
}
