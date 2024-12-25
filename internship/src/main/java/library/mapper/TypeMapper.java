package library.mapper;

import library.entity.Type;
import library.models.response.TypeResponse;

import java.util.List;

public interface TypeMapper {
    List<TypeResponse> toDtoS(List<Type> all);
}