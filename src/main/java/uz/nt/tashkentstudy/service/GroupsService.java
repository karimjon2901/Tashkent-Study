package uz.nt.tashkentstudy.service;

import uz.nt.tashkentstudy.dto.GroupsDto;
import uz.nt.tashkentstudy.dto.ResponseDto;

import java.util.List;

public interface GroupsService {
    ResponseDto<List<GroupsDto>> getAllGroups();
    ResponseDto<GroupsDto> AddGroup(GroupsDto groupsDto);
    ResponseDto<GroupsDto> getById(Integer id);
    ResponseDto<GroupsDto> updateGroup(GroupsDto groupsDto);
}
