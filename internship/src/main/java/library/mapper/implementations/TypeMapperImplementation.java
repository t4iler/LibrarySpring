package library.mapper.implementations;

import library.entity.Type;
import library.mapper.TypeMapper;
import library.models.response.TypeResponse;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TypeMapperImplementation implements TypeMapper {
    @Override
    public List<TypeResponse> toDtoS(List<Type> all) {
        List<TypeResponse> typeResponses = new ArrayList<>();
        for (Type type: all){
            typeResponses.add(toDto(type));
        }
        return typeResponses;
    }

    private TypeResponse toDto(Type type) {
        TypeResponse typeResponse = new TypeResponse();
        typeResponse.setId(type.getId());
        typeResponse.setName(type.getName());
        return typeResponse;
    }
}