package gr.codehub.hackathon.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@NoArgsConstructor
@SuperBuilder
@Entity
@Table(name = "COMMENTS")
public class Comment extends BaseModel {
	@Column(length = 4096, nullable = false)
	private String body;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date publishDate;
}
