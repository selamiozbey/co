package com.crossover.techtrial.repository;

import com.crossover.techtrial.model.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Repository
@Transactional
public class CommentRepositoryImpl implements CommentRepository {
    @Override
    public <S extends Comment> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Comment> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Comment> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Comment> findAll() {
        return null;
    }

    @Override
    public Iterable<Comment> findAllById(Iterable<Long> longs) {
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
    public void delete(Comment entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Comment> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Comment> findByArticleIdOrderByDate(Long articleId) {
        return null;
    }

    @Override
    public Iterable<Comment> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Comment> findAll(Pageable pageable) {
        return null;
    }
}
