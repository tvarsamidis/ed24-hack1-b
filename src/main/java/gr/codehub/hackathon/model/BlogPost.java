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

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@SuperBuilder
@Entity()
@Table(name = "BLOGPOSTS")
public class BlogPost extends Content {
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date publishedAt;

	@Column(length = 50, nullable = false)
	private String site;

	@ToString.Exclude
	@EqualsAndHashCode.Exclude
	@OneToMany(orphanRemoval = true)
	@JoinColumn(name = "BLOGPOST_ID")
	private Set<Comment> comments = new HashSet<>();
}
