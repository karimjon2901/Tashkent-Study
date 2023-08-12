package uz.nt.tashkentstudy.service.mapper;

import org.mapstruct.Mapper;
import uz.nt.tashkentstudy.dto.SessionDto;
import uz.nt.tashkentstudy.model.Session;

@Mapper(componentModel = "spring")
public abstract class SessionMapper implements CommonMapper<Session, SessionDto>{
    @Override
    public abstract Session toEntity(SessionDto sessionDto);

    @Override
    public abstract SessionDto toDto(Session session);
}
