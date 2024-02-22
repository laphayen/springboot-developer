package me.laphayen.SpringBootDeveloperApplication.controller;

import lombok.RequiredArgsConstructor;
import me.laphayen.SpringBootDeveloperApplication.domain.Article;
import me.laphayen.SpringBootDeveloperApplication.dto.AddArticleRequest;
import me.laphayen.SpringBootDeveloperApplication.service.BlogService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.yaml.snakeyaml.util.ArrayUtils;

@RequiredArgsConstructor
@RestController
public class BlogApiController {

    private final BlogService blogService;

    @PostMapping("/api/articles")
    public ResponseEntity<Article> addArticle(@RequestBody AddArticleRequest request) {
        Article savedArticle = blogService.save(request);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savedArticle);
    }
}
