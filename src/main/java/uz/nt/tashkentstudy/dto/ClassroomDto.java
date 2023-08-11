package uz.nt.tashkentstudy.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomDto {
    private Integer id;
    private String name;
    private Integer capacity;
    private String description;
}
