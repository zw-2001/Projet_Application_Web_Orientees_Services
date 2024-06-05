package com.miage.neo4j.repository;

import com.miage.neo4j.entity.Event;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import java.util.Optional;

public interface EventRepository extends Neo4jRepository<Event, String> {
    Optional<Event> findById(String event);
    <S extends Event> S save(S event);
    void deleteById(String event);
}


