package gr.codehub.hackathon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Data

public class BlogPost extends Content {

	private Date publishedAt;

	private String site;

	private Set<Comment> comments = new HashSet<>();
}
