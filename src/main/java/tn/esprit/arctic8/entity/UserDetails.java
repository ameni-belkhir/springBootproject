package tn.esprit.arctic8.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.PathVariable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idDetails;

    @ManyToOne
    User user;
}
