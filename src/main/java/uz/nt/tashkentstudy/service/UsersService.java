package uz.nt.tashkentstudy.service;

import uz.nt.tashkentstudy.dto.ResponseDto;
import uz.nt.tashkentstudy.dto.UsersDto;

import java.util.List;

public interface UsersService {
    ResponseDto<List<UsersDto>> getAll();
    ResponseDto<UsersDto> addUser(UsersDto usersDto);
    ResponseDto<UsersDto> getById(Integer id);
    ResponseDto<UsersDto> updateUser(UsersDto usersDto);
}
