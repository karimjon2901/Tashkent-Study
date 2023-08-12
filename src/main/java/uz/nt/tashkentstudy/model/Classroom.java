package uz.nt.tashkentstudy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Classroom {
    @Id
    @GeneratedValue(generator = "classroomIdSeq")
    @SequenceGenerator(name = "classroomIdSeq", sequenceName = "classroom_id_seq",allocationSize = 1)
    private Integer id;
    private String name;
    private Integer capacity;
    private String description;
}
