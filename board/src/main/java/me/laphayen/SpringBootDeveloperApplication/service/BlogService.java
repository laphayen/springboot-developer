package me.laphayen.SpringBootDeveloperApplication.service;

import lombok.RequiredArgsConstructor;
import me.laphayen.SpringBootDeveloperApplication.domain.Article;
import me.laphayen.SpringBootDeveloperApplication.dto.AddArticleRequest;
import me.laphayen.SpringBootDeveloperApplication.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }

    public List<Article> findAll() {
        return blogRepository.findAll();
    }
}
