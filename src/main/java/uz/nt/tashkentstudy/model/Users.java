package uz.nt.tashkentstudy.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(generator = "userIdSeq")
    @SequenceGenerator(name = "UserIdSeq", sequenceName = "user_id_seq",allocationSize = 1)
    private Integer id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String phoneNumber;
    private String birthDate;
    @ManyToMany(mappedBy = "users")
    private List<Groups> groups;
    private String email;
    private String gender;
    private String password;
    private Boolean isActive;
    private Double balance;
    private String role="USER";
}
