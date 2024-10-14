package org.example.api.Dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Data
@Builder
public class BookRequestDto {
    @NotBlank
    @Schema(example = "Вишневый сад")
    @Pattern(regexp = "^[А-Я][а-я]{0,30}$")
    public String bookName;
    @NotBlank
    @Schema(example = "Антон Павлович Чехов")
    @Pattern(regexp = "^[А-Я][а-я]{0,49}$")
    public String authorName;
    @NotEmpty
    @Schema(example = "345")
    @Pattern(regexp = "^(\\d{4})$")
    public Integer numberPage;
    @NotEmpty
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    public LocalDate date;

}
