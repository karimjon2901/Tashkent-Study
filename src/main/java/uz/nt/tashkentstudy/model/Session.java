package uz.nt.tashkentstudy.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Session {
    @Id
    @GeneratedValue(generator = "sessionIdSeq")
    @SequenceGenerator(name = "sessionIdSeq", sequenceName = "session_id_seq", allocationSize = 1)
    private Integer id;
    private Date date;
    private Time time;
    @ManyToOne
    private Groups group;
    @ManyToOne
    private Classroom classroom;
}
