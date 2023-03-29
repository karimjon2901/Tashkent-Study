package uz.nt.tashkentstudy.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.nt.tashkentstudy.dto.GroupsDto;
import uz.nt.tashkentstudy.dto.ResponseDto;
import uz.nt.tashkentstudy.service.GroupsService;

import java.util.List;

@RestController
@RequestMapping("/group")
@RequiredArgsConstructor
public class GroupsResources {
    private final GroupsService groupsService;

    @GetMapping
    public ResponseDto<List<GroupsDto>> getAllGroups(){
        return groupsService.getAllGroups();
    }
    @PostMapping
    public ResponseDto<GroupsDto> addGroup(@RequestBody GroupsDto groupsDto){
        return groupsService.AddGroup(groupsDto);
    }

    @GetMapping("by-id")
    public ResponseDto<GroupsDto> getById(@RequestParam Integer id){
        return groupsService.getById(id);
    }

    @PatchMapping
    public ResponseDto<GroupsDto> updateGroup(@RequestBody GroupsDto groupsDto){
        return groupsService.updateGroup(groupsDto);
    }
}
