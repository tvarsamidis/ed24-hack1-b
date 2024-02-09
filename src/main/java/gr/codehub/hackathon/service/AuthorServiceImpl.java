package gr.codehub.hackathon.service;

import gr.codehub.hackathon.model.Activity;
import gr.codehub.hackathon.model.Author;
import gr.codehub.hackathon.model.Content;
import gr.codehub.hackathon.repository.ActivityRepository;
import gr.codehub.hackathon.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl extends BaseServiceImpl<Author> implements AuthorService {
	private final AuthorRepository authorRepository;
	private final ActivityRepository activityRepository;

	@Override
	public JpaRepository<Author, Long> getRepository() {
		return authorRepository;
	}

	@Override
	public void assign(final Author author, final Content content, final BigDecimal cost) {
		Activity newActivity = new Activity(content, author, cost);
		activityRepository.save(newActivity);
	}
}
