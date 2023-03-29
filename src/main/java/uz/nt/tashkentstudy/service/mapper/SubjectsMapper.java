package uz.nt.tashkentstudy.service.mapper;

import org.mapstruct.Mapper;
import uz.nt.tashkentstudy.dto.SubjectsDto;
import uz.nt.tashkentstudy.model.Subjects;

@Mapper(componentModel = "spring")
public abstract class SubjectsMapper implements CommonMapper<Subjects, SubjectsDto> {
    @Override
    public abstract Subjects toEntity(SubjectsDto subjectsDto);

    @Override
    public abstract SubjectsDto toDto(Subjects subjects);
}
