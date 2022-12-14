package com.example.expcond_rest_api.persistence.entities;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "person",uniqueConstraints = {@UniqueConstraint(columnNames = {"dni"})})
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dni;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    private String sex;

    @Override
    public String toString() {
        return "persons [idPerson=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dni=" + dni + "]";
    }

}
