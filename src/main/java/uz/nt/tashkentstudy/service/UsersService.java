package uz.nt.tashkentstudy.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.nt.tashkentstudy.dto.ResponseDto;
import uz.nt.tashkentstudy.dto.UsersDto;
import uz.nt.tashkentstudy.model.Users;
import uz.nt.tashkentstudy.repository.UsersRepository;
import uz.nt.tashkentstudy.service.mapper.UserMapper;

import java.util.List;
import java.util.Optional;

import static uz.nt.tashkentstudy.service.validator.AppStatusCodes.*;
import static uz.nt.tashkentstudy.service.validator.AppStatusMessages.*;


@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;
    private final UserMapper userMapper;
    public ResponseDto<List<UsersDto>> getAll() {
        List<Users> usersList = usersRepository.findAll();
        if (usersList.isEmpty()){
            return ResponseDto.<List<UsersDto>>builder()
                    .code(NOT_FOUND_ERROR_CODE)
                    .message(NOT_FOUND)
                    .build();
        }
        return ResponseDto.<List<UsersDto>>builder()
                .data(usersList.stream().map(userMapper::toDto).toList())
                .success(true)
                .message(OK)
                .code(OK_CODE)
                .build();
    }

    public ResponseDto<UsersDto> addUser(UsersDto usersDto) {
        Users users = userMapper.toEntity(usersDto);
        usersRepository.save(users);

        return ResponseDto.<UsersDto>builder()
                .success(true)
                .data(userMapper.toDto(users))
                .message("OK")
                .build();
    }

    public ResponseDto<UsersDto> getById(Integer id) {
        Optional<Users> optional = usersRepository.findById(id);

        if (optional.isEmpty()){
            return ResponseDto.<UsersDto>builder()
                    .message(NOT_FOUND)
                    .code(NOT_FOUND_ERROR_CODE)
                    .build();
        }

        return ResponseDto.<UsersDto>builder()
                .data((UsersDto) optional.stream().map(userMapper::toDto))
                .code(OK_CODE)
                .message(OK)
                .success(true)
                .build();
    }


    public ResponseDto<UsersDto> updateUser(UsersDto usersDto) {
        if (usersDto.getId() == null){
            return ResponseDto.<UsersDto>builder()
                    .message("UserID is null")
                    .code(VALIDATION_ERROR_CODE)
                    .data(usersDto)
                    .build();
        }

        Optional<Users> userOptional = usersRepository.findById(usersDto.getId());

        if (userOptional.isEmpty()){
            return ResponseDto.<UsersDto>builder()
                    .message("User with ID " + usersDto.getId() + " is not found")
                    .code(DATABASE_ERROR_CODE)
                    .data(usersDto)
                    .build();
        }
        Users user = userOptional.get();
        if (usersDto.getGender() != null){
            user.setGender(usersDto.getGender());
        }
        if (usersDto.getEmail() != null){
            user.setEmail(usersDto.getEmail());
        }
        if (usersDto.getFirstName() != null){
            user.setFirstName(usersDto.getFirstName());
        }
        if (usersDto.getMiddleName() != null){
            user.setMiddleName(usersDto.getMiddleName());
        }
        if (usersDto.getPhoneNumber() != null){
            user.setPhoneNumber(usersDto.getPhoneNumber());
        }
        if (usersDto.getLastName() != null){
            user.setLastName(usersDto.getLastName());
        }
        try {
            usersRepository.save(user);

            return ResponseDto.<UsersDto>builder()
                    .data(userMapper.toDto(user))
                    .success(true)
                    .message("OK")
                    .build();
        }catch (Exception e){
            return ResponseDto.<UsersDto>builder()
                    .data(userMapper.toDto(user))
                    .code(1)
                    .message("Error while saving user: " + e.getMessage())
                    .build();
        }
    }
}
