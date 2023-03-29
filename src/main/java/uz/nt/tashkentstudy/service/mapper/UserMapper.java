package uz.nt.tashkentstudy.service.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import uz.nt.tashkentstudy.dto.UsersDto;
import uz.nt.tashkentstudy.model.Users;
@Mapper(componentModel = "spring")
public abstract class UserMapper implements CommonMapper<Users, UsersDto> {

    @Mapping(target = "birthDate", dateFormat = "dd.MM.yyyy")
//    @Mapping(target = "password", expression = "java(passwordEncoder.encode(dto.getPassword()))")
//    @Mapping(target = "enabled", expression = "java(true)")
    @Mapping(target = "role", ignore = true)
    public abstract Users toEntity(UsersDto usersDto);


    @Mapping(target = "birthDate", dateFormat = "dd.MM.yyyy")
    public abstract UsersDto toDto(Users user);

}
