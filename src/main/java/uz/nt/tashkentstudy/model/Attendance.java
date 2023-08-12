package uz.nt.tashkentstudy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Attendance {
    @Id
    @GeneratedValue(generator = "attendanceIdSeq")
    @SequenceGenerator(name = "attendanceIdSeq", sequenceName = "attendance_id_seq", allocationSize = 1)
    private Integer id;
    @ManyToOne
    private Users user;
    @ManyToOne
    private Session session;
    private Boolean isAbsent = true;
}