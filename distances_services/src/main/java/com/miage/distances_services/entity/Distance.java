package com.miage.distances_services.entity;

import org.springframework.data.neo4j.core.schema.RelationshipProperties;
import org.springframework.data.neo4j.core.schema.TargetNode;

@RelationshipProperties
public class Distance {
    @TargetNode
    private Site targetSite;
    private int distance;
    private int carTime;
    private int publicTransportTime;
}

