package uz.nt.tashkentstudy.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.DayOfWeek;
import java.util.List;

@Entity
@Getter
@Setter
public class Groups {
    @Id
    @GeneratedValue(generator = "groupIdSeq")
    @SequenceGenerator(name = "groupIdSeq", sequenceName = "group_id_seq", allocationSize = 1)
    private Integer id;
    private String name;
    @ManyToOne
    private Users teacherId;
    @OneToOne
    private Subjects subjectId;
    private String description;
    @ManyToMany()
    private List<Users> users;
    private List<DayOfWeek> lessonDays;
    private String lessonTime;
    private Boolean isActive;
    private String createdAt;
}
