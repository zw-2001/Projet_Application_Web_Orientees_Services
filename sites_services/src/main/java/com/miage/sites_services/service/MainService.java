package com.miage.sites_services.service;

import com.miage.sites_services.entity.Site;
import com.miage.sites_services.entity.Sport;
import com.miage.sites_services.repository.SiteRepository;
import com.miage.sites_services.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {

    @Autowired
    private SiteRepository siteRepository;

    @Autowired
    private SportRepository sportRepository;

    // Méthode pour obtenir les sites utilisés pendant les jeux paralympiques
    public List<Site> getParalympicSites() {
        return siteRepository.findByIsParalympicTrue();
    }

    // Méthode pour obtenir les sites proposant un sport donné
    public List<Site> getSitesBySport(String sportName) {
        Sport sport = sportRepository.findByNomSport(sportName);
        return sport != null ? siteRepository.findBySportsContaining(sport) : List.of();
    }

    // Méthode pour obtenir les sports associés à un site donné
    public List<Sport> getSportsBySite(String siteName) {
        Site site = siteRepository.findByNomSite(siteName);
        return site != null ? sportRepository.findBySitesContaining(site) : List.of();
    }
}
