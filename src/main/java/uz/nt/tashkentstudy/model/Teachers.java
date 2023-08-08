package uz.nt.tashkentstudy.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Teachers {
    @Id
    @GeneratedValue(generator = "teacherIdSeq")
    @SequenceGenerator(name = "teacherIdSeq", sequenceName = "teacher_id_seq",allocationSize = 1)
    private Integer id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String phoneNumber;
    private String birthDate;
    @OneToMany()
    private List<Groups> groups;
    private String email;
    private String gender;
    private String password;
    private Boolean isActive;
    private Double balance;
    private String role="TEACHER";
}
