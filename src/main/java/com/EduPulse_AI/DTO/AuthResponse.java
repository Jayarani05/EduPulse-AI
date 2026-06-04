package com.EduPulse_AI.DTO;

import com.EduPulse_AI.Enums.RoleType;
import lombok.Builder;
import lombok.Getter;


@Getter
@Builder
public class AuthResponse {


    private String accessToken;


    private String refreshToken;


    private RoleType role;


    private String tokenType;

}
