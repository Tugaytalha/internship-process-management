package com.teamaloha.internshipprocessmanagement.dto.holiday;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HolidayAddRequest {
    @NotBlank
    String date;

    @NotBlank
    String name;

    @NotBlank
    String description;
}