package com.softuai.mevo.infrastructure.mapper;

import com.softuai.mevo.core.entity.User;
import com.softuai.mevo.infrastructure.persistence.entity.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserCoreMapper {

    User toCore(UserEntity entity);

    UserEntity toEntity(User user);

}
