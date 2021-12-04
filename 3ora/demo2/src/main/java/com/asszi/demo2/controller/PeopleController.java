package com.asszi.demo2.controller;

import com.asszi.demo2.service.PeopleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PeopleController {
    private final PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @PostMapping(path = "/people", consumes = "application/json")
    void savePeople(@Valid @RequestBody PeopleDto peopleDto) {
        this.peopleService.savePeople(
                peopleDto.toPeople(peopleDto)
        );

        System.out.println(peopleDto);
    }
}
