package uz.nt.tashkentstudy.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import uz.nt.tashkentstudy.dto.GroupsDto;
import uz.nt.tashkentstudy.dto.ResponseDto;
import uz.nt.tashkentstudy.model.Groups;
import uz.nt.tashkentstudy.repository.GroupsRepository;
import uz.nt.tashkentstudy.service.GroupsService;
import uz.nt.tashkentstudy.service.mapper.GroupsMapper;

import java.util.List;
import java.util.Optional;


import static uz.nt.tashkentstudy.service.validator.AppStatusCodes.*;
import static uz.nt.tashkentstudy.service.validator.AppStatusMessages.*;

@Service
@RequiredArgsConstructor
public class GroupsServiceImpl implements GroupsService {
    private final GroupsRepository groupsRepository;
    private final GroupsMapper groupsMapper;

    @Override
    public ResponseDto<List<GroupsDto>> getAllGroups() {
        List<Groups> groupsList = groupsRepository.findAll();
        if (groupsList.isEmpty()) {
            return ResponseDto.<List<GroupsDto>>builder()
                    .code(NOT_FOUND_ERROR_CODE)
                    .message(NOT_FOUND)
                    .build();
        }
        return ResponseDto.<List<GroupsDto>>builder()
                .message(OK)
                .code(OK_CODE)
                .success(true)
                .data(groupsList.stream().map(groupsMapper::toDto).toList())
                .build();
    }

    @Override
    public ResponseDto<GroupsDto> AddGroup(GroupsDto groupsDto) {
        Groups groups = groupsMapper.toEntity(groupsDto);
        groupsRepository.save(groups);

        return ResponseDto.<GroupsDto>builder()
                .success(true)
                .data(groupsMapper.toDto(groups))
                .message("OK")
                .build();
    }
    @Override
    public ResponseDto<GroupsDto> getById(Integer id) {
        Optional<Groups> optional = groupsRepository.findById(id);

        if (optional.isEmpty()) {
            return ResponseDto.<GroupsDto>builder()
                    .message(NOT_FOUND)
                    .code(NOT_FOUND_ERROR_CODE)
                    .build();
        }

        return ResponseDto.<GroupsDto>builder()
                .code(OK_CODE)
                .message(OK)
                .success(true)
                .data((GroupsDto) optional.stream().map(groupsMapper::toDto))
                .build();
    }

    @Override
    public ResponseDto<GroupsDto> updateGroup(GroupsDto groupsDto) {
        return null;
    }
}
