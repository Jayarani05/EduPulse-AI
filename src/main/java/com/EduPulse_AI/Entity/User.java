package com.EduPulse_AI.Entity;

import com.EduPulse_AI.Enums.AccountStatus;
import com.EduPulse_AI.Enums.AuthProvider;
import com.EduPulse_AI.Enums.RoleType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;




@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;


    @Column(
            nullable = false
    )
    private String name;


    @Column(
            nullable = false,
            unique = true
    )
    private String email;


    private String password;


    private LocalDateTime createdAt;


    private LocalDateTime updatedAt;


    @PrePersist
    public void onCreate(){

        createdAt = LocalDateTime.now();

        updatedAt = LocalDateTime.now();

        status = AccountStatus.PENDING;

        emailVerified = false;

    }


    @PreUpdate
    public void onUpdate(){

        updatedAt = LocalDateTime.now();

    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RoleType role;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private AuthProvider provider;


    @Enumerated(EnumType.STRING)
    private AccountStatus status;


    private String providerId;


    private String profileImage;


    private boolean emailVerified;

}