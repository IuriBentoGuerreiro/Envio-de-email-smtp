package com.ms.email.dtos;

import com.ms.email.enums.StatusEmail;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EmailDto {

    private long emailId;
    @NotBlank
    private String ownerRef;
    @NotBlank
    @Email
    private String emailfrom;

    @Email
    private String emailto;
    @NotBlank
    private String subject;
    @NotBlank
    private String text;
}
