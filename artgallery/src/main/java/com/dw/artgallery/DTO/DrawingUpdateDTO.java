package com.dw.artgallery.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DrawingUpdateDTO {
    private String title;
    private String description;
    private Boolean isComplete;
    private String imgUrl;
}
