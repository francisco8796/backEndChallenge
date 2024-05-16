package com.example.backEnd_Challenge.entites;



import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Movies {
    private String id;
    private String title;
    private Date date;
    private int rank;
    private double revenue;

}
