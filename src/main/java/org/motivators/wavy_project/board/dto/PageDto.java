package org.motivators.wavy_project.board.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageDto {
    private int page;
    private int size;
    private String keyword;
    private String type;
}