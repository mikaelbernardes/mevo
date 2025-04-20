package com.softuai.mevo.infrastructure.mapper;

import com.softuai.mevo.infrastructure.dto.UserDTO;
import com.softuai.mevo.infrastructure.dto.UserResponseDTO;
import com.softuai.mevo.infrastructure.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserDTOMapper {

    UserEntity toEntity(UserDTO dto);

    UserDTO toDto(UserEntity entity);

    UserResponseDTO toResponseDTO(UserEntity entity);

}
