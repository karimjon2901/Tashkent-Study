package uz.nt.tashkentstudy.service.mapper;

import org.mapstruct.Mapper;
import uz.nt.tashkentstudy.dto.GroupsDto;
import uz.nt.tashkentstudy.model.Groups;

@Mapper(componentModel = "spring")
public abstract class GroupsMapper implements CommonMapper<Groups, GroupsDto>{
    @Override
    public abstract Groups toEntity(GroupsDto groupsDto);

    @Override
    public abstract GroupsDto toDto(Groups groups);

}
