package uz.nt.tashkentstudy.service;

import org.springframework.data.domain.Page;
import uz.nt.tashkentstudy.dto.ResponseDto;
import uz.nt.tashkentstudy.dto.SubjectsDto;

public interface SubjectsService {
    ResponseDto<SubjectsDto> add(SubjectsDto subjectsDto);
    ResponseDto<Page<SubjectsDto>> getAll(Integer size, Integer page);
    ResponseDto<SubjectsDto> getById(Integer id);
    ResponseDto<SubjectsDto> update(SubjectsDto subjectsDto);
    ResponseDto<Void> delete(Integer id);
}
