package uz.nt.tashkentstudy.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.nt.tashkentstudy.model.Groups;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsersDto {
    private Integer id;
    private String firstName;
    private String lastName;
    private String middleName;
    private String phoneNumber;
    private String birthDate;
    private List<Groups> groups;
    private String email;
    private String gender;
    private String password;
    private Boolean isActive;
    private Double balance;
    private String role;

}
