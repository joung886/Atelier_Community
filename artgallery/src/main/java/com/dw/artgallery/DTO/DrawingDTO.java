package com.dw.artgallery.DTO;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DrawingDTO {
    private String imgUrl;
    private String title;
    private LocalDate completionDate;
}
