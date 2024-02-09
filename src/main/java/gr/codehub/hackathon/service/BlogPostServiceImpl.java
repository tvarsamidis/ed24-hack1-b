package gr.codehub.hackathon.service;

import gr.codehub.hackathon.model.BlogPost;
import gr.codehub.hackathon.repository.BlogPostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BlogPostServiceImpl extends BaseServiceImpl<BlogPost> implements BlogPostService {
	private final BlogPostRepository blogPostRepository;

	@Override
	public JpaRepository<BlogPost, Long> getRepository() {
		return blogPostRepository;
	}
}
