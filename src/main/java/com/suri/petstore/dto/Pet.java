package com.suri.petstore.dto;

import com.suri.petstore.domain.Category;
import com.suri.petstore.domain.Status;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Pet {
    private Long id;
    private String name;
    private Status status;
    private Category category;
    private List<String> photoUrls;
    private List<Tag> tags;
}