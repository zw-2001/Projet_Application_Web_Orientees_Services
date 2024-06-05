package com.miage.sites_services.entity;

import lombok.Data;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "sites")
public class Site {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom_site", nullable = false)
    private String nomSite;

    @Column(name = "is_olympic", nullable = false)
    private boolean isOlympic;

    @Column(name = "is_paralympic", nullable = false)
    private boolean isParalympic;

    @ManyToMany
    @JoinTable(
            name = "site_sports",
            joinColumns = @JoinColumn(name = "site_id"),
            inverseJoinColumns = @JoinColumn(name = "sport_id")
    )
    private Set<Sport> sports = new HashSet<>();
}
