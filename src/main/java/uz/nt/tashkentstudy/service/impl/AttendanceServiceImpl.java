package uz.nt.tashkentstudy.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import uz.nt.tashkentstudy.dto.AttendanceDto;
import uz.nt.tashkentstudy.dto.ResponseDto;
import uz.nt.tashkentstudy.repository.AttendanceRepository;
import uz.nt.tashkentstudy.service.AttendanceService;
import uz.nt.tashkentstudy.service.mapper.AttendanceMapper;

@Service
@RequiredArgsConstructor
public class AttendanceServiceImpl implements AttendanceService {
    private final AttendanceRepository attendanceRepository;
    private final AttendanceMapper attendanceMapper;
    @Override
    public ResponseDto<AttendanceDto> add(AttendanceDto attendanceDto) {
        return null;
    }

    @Override
    public ResponseDto<Page<AttendanceDto>> getAll(Integer size, Integer page) {
        return null;
    }

    @Override
    public ResponseDto<AttendanceDto> getById(Integer id) {
        return null;
    }

    @Override
    public ResponseDto<AttendanceDto> update(AttendanceDto attendanceDto) {
        return null;
    }

    @Override
    public ResponseDto<Void> delete(Integer id) {
        return null;
    }
}
