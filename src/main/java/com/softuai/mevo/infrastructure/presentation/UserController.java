package com.softuai.mevo.infrastructure.presentation;

import com.softuai.mevo.core.entity.User;
import com.softuai.mevo.core.usecase.user.*;
import com.softuai.mevo.infrastructure.dto.UserDTO;
import com.softuai.mevo.infrastructure.dto.UserResponseDTO;
import com.softuai.mevo.infrastructure.mapper.UserCoreMapper;
import com.softuai.mevo.infrastructure.mapper.UserDTOMapper;
import com.softuai.mevo.infrastructure.persistence.entity.UserEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserDTOMapper userDTOMapper;
    private final UserCoreMapper userCoreMapper;
    private final AuthenticationUserUseCase authenticationUserUseCase;
    private final ChangeEmailUseCase changeEmailUseCase;
    private final ChangePasswordUseCase changePasswordUseCase;
    private final CreateUserUseCase createUserUseCase;
    private final DeleteUserUseCase deleteUserUseCase;
    private final LogoutUserUseCase logoutUserUseCase;
    private final PatchUserUseCase patchUserUseCase;
    private final ReadUserUseCase readUserUseCase;
    private final RequestPasswordResetUseCase requestPasswordResetUseCase;
    private final ResendVerificationEmailUseCase resendVerificationEmailUseCase;
    private final ResetPasswordUseCase resetPasswordUseCase;
    private final UpdateUserUseCase updateUserUseCase;
    private final VerifyEmailUseCase verifyEmailUseCase;

    public UserController(
            UserDTOMapper userDTOMapper,
            UserCoreMapper userCoreMapper,
            AuthenticationUserUseCase authenticationUserUseCase,
            ChangeEmailUseCase changeEmailUseCase,
            ChangePasswordUseCase changePasswordUseCase,
            CreateUserUseCase createUserUseCase,
            DeleteUserUseCase deleteUserUseCase,
            LogoutUserUseCase logoutUserUseCase,
            PatchUserUseCase patchUserUseCase,
            ReadUserUseCase readUserUseCase,
            RequestPasswordResetUseCase requestPasswordResetUseCase,
            ResendVerificationEmailUseCase resendVerificationEmailUseCase,
            ResetPasswordUseCase resetPasswordUseCase,
            UpdateUserUseCase updateUserUseCase,
            VerifyEmailUseCase verifyEmailUseCase
    ) {
        this.userDTOMapper = userDTOMapper;
        this.userCoreMapper = userCoreMapper;
        this.authenticationUserUseCase = authenticationUserUseCase;
        this.changeEmailUseCase = changeEmailUseCase;
        this.changePasswordUseCase = changePasswordUseCase;
        this.createUserUseCase = createUserUseCase;
        this.deleteUserUseCase = deleteUserUseCase;
        this.logoutUserUseCase = logoutUserUseCase;
        this.patchUserUseCase = patchUserUseCase;
        this.readUserUseCase = readUserUseCase;
        this.requestPasswordResetUseCase = requestPasswordResetUseCase;
        this.resendVerificationEmailUseCase = resendVerificationEmailUseCase;
        this.resetPasswordUseCase = resetPasswordUseCase;
        this.updateUserUseCase = updateUserUseCase;
        this.verifyEmailUseCase = verifyEmailUseCase;
    }


    @PostMapping
    public ResponseEntity<UserResponseDTO> createUser(@RequestBody UserDTO requestBody) {
        UserEntity requestEntity = userDTOMapper.toEntity(requestBody);
        User responseCore = createUserUseCase.execute(userCoreMapper.toCore(requestEntity));
        UserEntity responseEntity = userCoreMapper.toEntity(responseCore);
        return ResponseEntity.ok(userDTOMapper.toResponseDTO(responseEntity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> readUser(@PathVariable Long id) {
        User responseCore = readUserUseCase.execute(id);
        return ResponseEntity.ok(userCoreMapper.toResponseDTO(responseCore));
    }

}
