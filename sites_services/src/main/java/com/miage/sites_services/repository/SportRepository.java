package com.miage.sites_services.repository;

import com.miage.sites_services.entity.Site;
import com.miage.sites_services.entity.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SportRepository extends JpaRepository<Sport, Long> {
    Sport findByNomSport(String nomSport);

    List<Sport> findBySitesContaining(Site site);
}
