package com.teamaloha.internshipprocessmanagement.dto.company;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyGetResponse {

    private String companyName;

    private String companyMail;

    private String companyTelephone;

    private String faxNumber;

    private String companyAddress;
}