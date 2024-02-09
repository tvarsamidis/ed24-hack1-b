package gr.codehub.hackathon.model;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class Author {

	private String firstname;

	private String lastname;

	private String email;

	//private Set<Activity> activities = new HashSet<>();
}
