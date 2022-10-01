package com.wolfleaning.contentmanager.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@Data
public class ContentDomain {
    private String name;
    private String description;
    private String language;
    private String image;
    private String category;
    private String data;
}
