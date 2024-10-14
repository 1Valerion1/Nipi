package org.example.api.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Data
@Builder
public class BookResponseDto {
    @NotBlank
    @Schema(example = "Антон Павлович Чехов")
    @Pattern(regexp = "^[А-Я][а-я]{0,49}$")
    public String authorName;
    @NotEmpty
    @Schema(example = "345")
    @Pattern(regexp = "^(\\d{4})$")
    public Integer number;
}
