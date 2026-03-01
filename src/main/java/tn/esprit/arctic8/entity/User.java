package tn.esprit.arctic8.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDate;
@Entity

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long idUser;
    @Setter
    String firstName;
    String lastName;
    LocalDate dateOfBirth;
    @Column(length = 8,unique = true, nullable = true)
    long cin;
    @Enumerated(EnumType.STRING)
    TypeUser userType;

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCin(long cin) {
        this.cin = cin;
    }

    public void setUserType(TypeUser userType) {
        this.userType = userType;
    }
}
