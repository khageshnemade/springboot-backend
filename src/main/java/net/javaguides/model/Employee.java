package net.javaguides.model;

import jakarta.persistence.*;
import lombok.*;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor
@Entity@Table(name = "employees")
public class Employee {
   @Id@GeneratedValue private long id;
    private String firstName;
    private String lastName;
    private String emailId;

}
