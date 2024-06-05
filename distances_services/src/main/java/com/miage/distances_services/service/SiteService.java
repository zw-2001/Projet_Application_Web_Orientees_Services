package com.miage.neo4j.service;

import com.miage.neo4j.entity.Site;
import com.miage.neo4j.repository.SiteRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;

@Service
public class SiteService {
    @Autowired
    private SiteRepository siteRepository;

    public List<Site> getAllSites() {
        return siteRepository.findAll();
    }

    public Site getSiteById(String name) {
        Optional<Site> site = siteRepository.findByName(name);
        return site.orElse(null);
    }

    public Site createSite(Site site) {
        return siteRepository.save(site);
    }

    public Site updateSite(String name, Site updatedSite) {
        Optional<Site> existingSite = siteRepository.findByName(name);
        if (existingSite.isPresent()) {
            updatedSite.setName(name);
            return siteRepository.save(updatedSite);
        } else {
            return null;
        }
    }

    public void deleteSite(String name) {
        siteRepository.deleteById(name);
    }
}


