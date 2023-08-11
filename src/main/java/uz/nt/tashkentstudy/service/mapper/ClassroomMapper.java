package uz.nt.tashkentstudy.service.mapper;

import org.mapstruct.Mapper;
import uz.nt.tashkentstudy.dto.ClassroomDto;
import uz.nt.tashkentstudy.model.Classroom;

@Mapper(componentModel = "spring")
public abstract class ClassroomMapper implements CommonMapper<Classroom, ClassroomDto>{
    @Override
    public abstract Classroom toEntity(ClassroomDto classroomDto);

    @Override
    public abstract ClassroomDto toDto(Classroom classroom);
}