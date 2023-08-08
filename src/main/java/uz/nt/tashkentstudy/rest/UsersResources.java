package uz.nt.tashkentstudy.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import uz.nt.tashkentstudy.dto.ResponseDto;
import uz.nt.tashkentstudy.dto.UsersDto;
import uz.nt.tashkentstudy.service.impl.UsersServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UsersResources {
    private final UsersServiceImpl usersService;

    @GetMapping
    public ResponseDto<List<UsersDto>> getAll(){
        return usersService.getAll();
    }
    @PostMapping
    public ResponseDto<UsersDto> addUser(@RequestBody UsersDto usersDto){
        return usersService.addUser(usersDto);
    }
    @GetMapping("by-id")
    public ResponseDto<UsersDto> getById(@RequestParam Integer id){
        return usersService.getById(id);
    }

    @PatchMapping
    public ResponseDto<UsersDto> updateUser(@RequestBody UsersDto usersDto){
        return usersService.updateUser(usersDto);
    }


}
