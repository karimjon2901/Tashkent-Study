package uz.nt.tashkentstudy.service.mapper;

import org.mapstruct.Mapper;
import uz.nt.tashkentstudy.dto.AttendanceDto;
import uz.nt.tashkentstudy.model.Attendance;
@Mapper(componentModel = "spring")
public abstract class AttendanceMapper implements CommonMapper<Attendance, AttendanceDto>{
    @Override
    public abstract Attendance toEntity(AttendanceDto attendanceDto);

    @Override
    public abstract AttendanceDto toDto(Attendance attendance);
}
