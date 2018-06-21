package com.crossover.techtrial.repository;

import com.crossover.techtrial.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public class ArticleRepositoryImpl implements ArticleRepository{


    @Override
    public List<Article> findTop10ByTitleContainingIgnoreCase(String title) {
        return null;
    }

    @Override
    public Iterable<Article> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Article> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Article> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Article> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Article> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Article> findAll() {
        return null;
    }

    @Override
    public Iterable<Article> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Article entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Article> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
