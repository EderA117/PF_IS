package mx.una.aragon.is.comicsapi.mappers;

import mx.una.aragon.is.comicsapi.dtos.ComicUpdateDto;
import mx.una.aragon.is.comicsapi.entities.Comic;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel= "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface ComicMapper {
    void updateComicFromDto(ComicUpdateDto dto, @MappingTarget Comic target);
}
