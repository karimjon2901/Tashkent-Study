package uz.nt.tashkentstudy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Subjects {
    @Id
    @GeneratedValue(generator = "subjectIdSeq")
    @SequenceGenerator(name = "subjectIdSeq", sequenceName = "subject_id_seq", allocationSize = 1)
    private Integer id;
    private String name;
    private String description;
    private Double price;
}
