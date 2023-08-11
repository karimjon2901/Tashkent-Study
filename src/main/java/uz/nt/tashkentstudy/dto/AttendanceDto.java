package uz.nt.tashkentstudy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceDto {
    private Integer id;
    private UsersDto user;
    private SessionDto session;
    private Boolean isAbsent;
}
