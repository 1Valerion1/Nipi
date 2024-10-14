package org.example.core.service;

import org.example.api.Dto.BookRequestDto;
import org.example.api.Dto.BookResponseDto;
import org.example.api.Dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    public UserDto createUser(UserDto userDto) {

        return userDto;
    }

    public BookResponseDto createBook(BookRequestDto bookRequestDto) {

        BookResponseDto bookResponse = BookResponseDto.builder()
                .authorName(bookRequestDto.authorName)
                .number(12)
                .build();

        return bookResponse;
    }


    public String deleteVowels(String str) {
        String[] vowels = {"a", "e", "y", "i", "у", "o", "ё", "q", "u", "и", "й", "о", "а"};
        str = str.toLowerCase();
        for (int i = 0; i < vowels.length; i++) {
            if (str.contains(vowels[i]))
                str = str.replace(vowels[i], "");
        }
        return str;
    }

}
