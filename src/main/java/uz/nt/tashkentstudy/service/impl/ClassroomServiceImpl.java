package uz.nt.tashkentstudy.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import uz.nt.tashkentstudy.dto.ClassroomDto;
import uz.nt.tashkentstudy.dto.ResponseDto;
import uz.nt.tashkentstudy.repository.ClassroomRepository;
import uz.nt.tashkentstudy.service.ClassroomService;
import uz.nt.tashkentstudy.service.mapper.ClassroomMapper;

@Service
@RequiredArgsConstructor
public class ClassroomServiceImpl implements ClassroomService {
    private  final ClassroomRepository classroomRepository;
    private final ClassroomMapper classroomMapper;
    @Override
    public ResponseDto<ClassroomDto> add(ClassroomDto classroomDto) {
        return null;
    }

    @Override
    public ResponseDto<Page<ClassroomDto>> getAll(Integer size, Integer page) {
        return null;
    }

    @Override
    public ResponseDto<ClassroomDto> getById(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<ClassroomDto> update(ClassroomDto classroomDto) {
        return null;
    }

    @Override
    public ResponseDto<Void> delete(Integer id) {
        return null;
    }
}
