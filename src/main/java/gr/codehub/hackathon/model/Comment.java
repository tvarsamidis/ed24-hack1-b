package gr.codehub.hackathon.model;

import lombok.Data;

import java.sql.Date;

@Data

public class Comment {

	private String body;

	private Date publishDate;
}
