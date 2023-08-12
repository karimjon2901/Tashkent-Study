package uz.nt.tashkentstudy.service;

import org.springframework.data.domain.Page;
import uz.nt.tashkentstudy.dto.ClassroomDto;
import uz.nt.tashkentstudy.dto.ResponseDto;

public interface ClassroomService {
    ResponseDto<ClassroomDto> add(ClassroomDto classroomDto);
    ResponseDto<Page<ClassroomDto>> getAll(Integer size, Integer page);
    ResponseDto<ClassroomDto> getById(Integer id);
    ResponseDto<ClassroomDto> update(ClassroomDto classroomDto);
    ResponseDto<Void> delete(Integer id);
}