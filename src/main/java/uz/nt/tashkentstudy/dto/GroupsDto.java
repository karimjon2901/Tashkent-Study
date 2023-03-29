package uz.nt.tashkentstudy.dto;

import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.nt.tashkentstudy.model.Users;

import java.time.DayOfWeek;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GroupsDto {
    private Integer id;
    private String name;
    private Integer teacherId;
    private Integer subjectId;
    private String description;
    private List<Users> users;
    private List<DayOfWeek> lessonDays;
    private String lessonTime;
    private Boolean isActive;
    private String createdAt;
}
