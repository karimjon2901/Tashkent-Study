package uz.nt.tashkentstudy.service;

import org.springframework.data.domain.Page;
import uz.nt.tashkentstudy.dto.ResponseDto;
import uz.nt.tashkentstudy.dto.SessionDto;

public interface SessionService {
    ResponseDto<SessionDto> add(SessionDto sessionDto);
    ResponseDto<Page<SessionDto>> getAll(Integer size, Integer page);
    ResponseDto<SessionDto> getById(Integer id);
    ResponseDto<SessionDto> update (SessionDto sessionDto);
    ResponseDto<Void> delete(Integer id);
}
