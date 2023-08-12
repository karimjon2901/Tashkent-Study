package uz.nt.tashkentstudy.service;

import org.springframework.data.domain.Page;
import uz.nt.tashkentstudy.dto.AttendanceDto;
import uz.nt.tashkentstudy.dto.ResponseDto;

public interface AttendanceService {
    ResponseDto<AttendanceDto> add(AttendanceDto attendanceDto);
    ResponseDto<Page<AttendanceDto>> getAll(Integer size, Integer page);
    ResponseDto<AttendanceDto> getById(Integer id);
    ResponseDto<AttendanceDto> update(AttendanceDto attendanceDto);
    ResponseDto<Void> delete(Integer id);
}
