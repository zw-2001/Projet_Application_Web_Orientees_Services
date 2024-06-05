package com.miage.sites_services.entity;

import lombok.Data;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@Table(name = "sports")
public class Sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom_sport", nullable = false)
    private String nomSport;

    @ManyToMany(mappedBy = "sports")
    private Set<Site> sites = new HashSet<>();
}
