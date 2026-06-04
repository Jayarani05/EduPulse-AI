package com.EduPulse_AI.DTO;




import com.EduPulse_AI.Enums.RoleType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RegisterRequest {


    @NotBlank(
            message = "Name is required"
    )
    private String name;


    @Email(
            message = "Invalid email format"
    )
    @NotBlank(
            message = "Email is required"
    )
    private String email;


    @NotBlank(
            message = "Password is required"
    )
    private String password;


    @NotNull(
            message = "Role is required"
    )
    private RoleType role;

}