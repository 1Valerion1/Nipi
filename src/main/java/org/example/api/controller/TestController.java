package org.example.api.controller;

import org.example.api.Dto.BookRequestDto;
import org.example.api.Dto.BookResponseDto;
import org.example.api.Dto.UserDto;
import org.example.core.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api/v1")
public class TestController {
    private final TestService testService;

    @Autowired
    public TestController(TestService testService) {
        this.testService = testService;
    }


    @GetMapping("/get")
    @ResponseBody
    public String get(@RequestParam("str") String sm) {

        return testService.deleteVowels(sm);
    }

    @PostMapping("/books")
    @ResponseBody
    public BookResponseDto createBook(@RequestBody BookRequestDto bookRequestDto) {

        return testService.createBook(bookRequestDto);
    }

    @PostMapping("/user")
    @ResponseBody
    public UserDto createUser(@RequestBody UserDto userDto) {

        return testService.createUser(userDto);
    }
}
