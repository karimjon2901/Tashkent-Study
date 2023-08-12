package uz.nt.tashkentstudy.service.impl;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import uz.nt.tashkentstudy.dto.ResponseDto;
import uz.nt.tashkentstudy.dto.SubjectsDto;
import uz.nt.tashkentstudy.model.Subjects;
import uz.nt.tashkentstudy.repository.SubjectsRepository;
import uz.nt.tashkentstudy.service.SubjectsService;
import uz.nt.tashkentstudy.service.mapper.SubjectsMapper;

import java.util.List;
import java.util.Optional;

import static uz.nt.tashkentstudy.service.validator.AppStatusMessages.*;
import static uz.nt.tashkentstudy.service.validator.AppStatusCodes.*;

@Service
@RequiredArgsConstructor
public class SubjectsServiceImpl implements SubjectsService {
    private final SubjectsRepository subjectsRepository;
    private final SubjectsMapper subjectsMapper;
    @Override
    public ResponseDto<SubjectsDto> add(SubjectsDto subjectsDto) {
        try {
            Subjects subjects = subjectsMapper.toEntity(subjectsDto);
            subjectsRepository.save(subjects);

            return ResponseDto.<SubjectsDto>builder()
                    .message(OK)
                    .code(OK_CODE)
                    .success(true)
                    .data(subjectsDto)
                    .build();

        }catch (Exception e){
            return ResponseDto.<SubjectsDto>builder()
                    .message(DATABASE_ERROR + " : " + e.getMessage())
                    .code(DATABASE_ERROR_CODE)
                    .build();
        }
    }

    @Override
    public ResponseDto<Page<SubjectsDto>> getAll(Integer size, Integer page) {
        return null;
    }

    @Override
    public ResponseDto<SubjectsDto> getById(Integer id) {
        if (id == null){
            return ResponseDto.<SubjectsDto>builder()
                    .message("Id is null!")
                    .code(VALIDATION_ERROR_CODE)
                    .build();
        }

        try {
            Optional<Subjects> byIdAndIsActiveIsTrue = subjectsRepository.findByIdAndIsActiveIsTrue(id);
            if (byIdAndIsActiveIsTrue.isEmpty()){
                return ResponseDto.<SubjectsDto>builder()
                        .message(NOT_FOUND)
                        .code(NOT_FOUND_ERROR_CODE)
                        .build();
            }

            return ResponseDto.<SubjectsDto>builder()
                    .message(OK)
                    .code(OK_CODE)
                    .success(true)
                    .data(subjectsMapper.toDto(byIdAndIsActiveIsTrue.get()))
                    .build();
        }catch (Exception e){
            return ResponseDto.<SubjectsDto>builder()
                    .code(DATABASE_ERROR_CODE)
                    .message(DATABASE_ERROR + " : " + e.getMessage())
                    .build();
        }
    }

    @Override
    public ResponseDto<SubjectsDto> update(SubjectsDto subjectsDto) {
        return null;
    }

    @Override
    public ResponseDto<Void> delete(Integer id) {
        if(id == null){
            return ResponseDto.<Void>builder()
                    .message("Id is null!")
                    .code(VALIDATION_ERROR_CODE)
                    .build();
        }

        try{
            Optional<Subjects> byIdAndIsActiveIsTrue = subjectsRepository.findByIdAndIsActiveIsTrue(id);
            if (byIdAndIsActiveIsTrue.isEmpty()){
                return ResponseDto.<Void>builder()
                        .message(NOT_FOUND)
                        .code(NOT_FOUND_ERROR_CODE)
                        .build();
            }

            return ResponseDto.<Void>builder()
                    .message(OK)
                    .code(OK_CODE)
                    .success(true)
                    .build();
        }catch (Exception e){
            return ResponseDto.<Void>builder()
                    .message(DATABASE_ERROR + " : " + e.getMessage())
                    .code(DATABASE_ERROR_CODE)
                    .build();
        }
    }
}
