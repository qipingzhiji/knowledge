package com.sccba.knowledge.artity.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Article {
    private Integer id;

    private String title;

    private String comment;

    private String status;
}