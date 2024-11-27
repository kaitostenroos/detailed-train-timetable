package com.kaitostenroos.detailedtraintimetable.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface HistoryRepository extends JpaRepository<History, Long> {
    List<History> findAll();
}
