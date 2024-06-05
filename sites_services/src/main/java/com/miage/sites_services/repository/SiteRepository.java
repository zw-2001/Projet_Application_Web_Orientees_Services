package com.miage.sites_services.repository;

import com.miage.sites_services.entity.Site;
import com.miage.sites_services.entity.Sport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SiteRepository extends JpaRepository<Site, Long> {
    List<Site> findByIsParalympicTrue();

    List<Site> findBySportsContaining(Sport sport);

    Site findByNomSite(String siteName);
}
