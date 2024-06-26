package com.miage.distances_services.repository;

import com.miage.distances_services.entity.Site;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import java.util.Optional;

public interface SiteRepository extends Neo4jRepository<Site, String> {
    Optional<Site> findByName(String name);
    <S extends Site> S save(S site);
    void deleteById(String name);
}


