package uz.nt.tashkentstudy.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import uz.nt.tashkentstudy.dto.ResponseDto;
import uz.nt.tashkentstudy.dto.SessionDto;
import uz.nt.tashkentstudy.repository.SessionRepository;
import uz.nt.tashkentstudy.service.SessionService;
import uz.nt.tashkentstudy.service.mapper.SessionMapper;

@Service
@RequiredArgsConstructor
public class SessionServiceImpl implements SessionService {
    private final SessionRepository sessionRepository;
    private final SessionMapper sessionMapper;
    @Override
    public ResponseDto<SessionDto> add(SessionDto sessionDto) {
        return null;
    }

    @Override
    public ResponseDto<Page<SessionDto>> getAll(Integer size, Integer page) {
        return null;
    }

    @Override
    public ResponseDto<SessionDto> getById(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<SessionDto> update(SessionDto sessionDto) {
        return null;
    }

    @Override
    public ResponseDto<Void> delete(Integer id) {
        return null;
    }
}
