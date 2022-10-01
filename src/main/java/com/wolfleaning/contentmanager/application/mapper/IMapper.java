package com.wolfleaning.contentmanager.application.mapper;

import br.com.wolfleaning.contentmanager.presentation.representation.CursoRepresentation;
import com.wolfleaning.contentmanager.domain.entity.ContentDomain;
import org.mapstruct.Mapping;

@org.mapstruct.Mapper(componentModel = "spring")
public interface IMapper {

    @Mapping(target = "name", source = "nome")
    ContentDomain toDomain(CursoRepresentation source);
}
