package com.miage.distances_services.repository;

import com.miage.distances_services.entity.Event;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import java.util.Optional;

public interface EventRepository extends Neo4jRepository<Event, String> {
    Optional<Event> findById(String event);
    <S extends Event> S save(S event);
    void deleteById(String event);
}


