package me.laphayen.SpringBootDeveloperApplication.repository;

import me.laphayen.SpringBootDeveloperApplication.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}
