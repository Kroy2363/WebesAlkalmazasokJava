package com.asszi.demo2.controller;

import com.asszi.demo2.service.People;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class PeopleDto {
    private Long id;
    @NotBlank
    @Size(min = 3)
    private String name;
    @NotNull
    @Min(1)
    private Integer age;

    public People toPeople(PeopleDto peopleDto) {
        People people = new People();

        people.setId(peopleDto.getId());
        people.setAge(peopleDto.getAge());
        people.setName(peopleDto.getName());

        return people;
    }
}
