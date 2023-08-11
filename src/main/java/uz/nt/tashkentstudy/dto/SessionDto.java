package uz.nt.tashkentstudy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SessionDto {
    private Integer id;
    private Date date;
    private Time time;
    private GroupsDto group;
    private ClassroomDto classroom;
}
