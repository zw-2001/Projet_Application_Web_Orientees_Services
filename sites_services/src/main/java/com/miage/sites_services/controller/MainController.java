package com.miage.sites_services.controller;

import com.miage.sites_services.entity.Site;
import com.miage.sites_services.entity.Sport;
import com.miage.sites_services.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    private MainService mainService;

    // API pour obtenir les sites utilisés pendant les jeux paralympiques
    @GetMapping("/paralympics")
    public List<Site> getParalympicSites() {
        return mainService.getParalympicSites();
    }

    // API pour obtenir les sites proposant un sport donné
    @GetMapping("/sports/{sportName}")
    public List<Site> getSitesBySport(@PathVariable String sportName) {
        return mainService.getSitesBySport(sportName);
    }

    // API pour obtenir les sports associés à un site donné
    @GetMapping("/sites/{siteName}")
    public List<Sport> getSportsBySite(@PathVariable String siteName) {
        return mainService.getSportsBySite(siteName);
    }
}
