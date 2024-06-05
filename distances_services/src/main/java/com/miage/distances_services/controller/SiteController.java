package com.miage.neo4j.controller;

import com.miage.neo4j.entity.Site;
import com.miage.neo4j.service.SiteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/sites")
public class SiteController {
    @Autowired
    private SiteService siteService;

    @GetMapping
    public List<Site> getAllSites() {
        return siteService.getAllSites();
    }

    @GetMapping("/{name}")
    public Site getSiteById(@PathVariable String name) {
        return siteService.getSiteById(name);
    }

    @PostMapping
    public Site createSite(@RequestBody Site site) {
        return siteService.createSite(site);
    }

    @PutMapping("/{name}")
    public Site updateSite(@PathVariable String name, @RequestBody Site site) {
        site.setName(name);
        return siteService.updateSite(site.getName(), site);
    }

    @DeleteMapping("/{name}")
    public void deleteSite(@PathVariable String name) {
        siteService.deleteSite(name);
    }
}
