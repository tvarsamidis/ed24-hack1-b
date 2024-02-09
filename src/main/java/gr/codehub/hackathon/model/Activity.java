package gr.codehub.hackathon.model;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class Activity {

    private Author author;


    private Content content;


    private BigDecimal fee;

}
