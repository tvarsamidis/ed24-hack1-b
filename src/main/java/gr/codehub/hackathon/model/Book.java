package gr.codehub.hackathon.model;


import lombok.Data;

import java.math.BigDecimal;

@Data
public class Book extends Content {

	private String summary;

	private String isbn;

	private Integer publicationYear;

	private String publisher;

	private Integer pages;

	private BigDecimal cost;
}

