package gr.codehub.hackathon.service;


import gr.codehub.hackathon.model.Author;
import gr.codehub.hackathon.model.Content;

import java.math.BigDecimal;

public interface AuthorService extends BaseService<Author, Long> {
	///Author getAuthor(Long id);

	void assign(Author author, Content content, BigDecimal cost);
}
