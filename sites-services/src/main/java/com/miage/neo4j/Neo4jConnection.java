package com.miage.neo4j;

import org.neo4j.driver.*;

public class Neo4jConnection {

    private final Driver driver;

    public Neo4jConnection(String uri, String user, String password) {
        driver = GraphDatabase.driver(uri, AuthTokens.basic(user, password));
    }

    public void close() {
        driver.close();
    }

    public Session getSession() {
        return driver.session();
    }

    public static void main(String[] args) {
        Neo4jConnection connection = new Neo4jConnection("bolt://localhost:7687", "neo4j", "microservices");
        try (Session session = connection.getSession()) {
            Result result = session.run("MATCH (n) RETURN count(n) AS nodeCount");
            int nodeCount = result.single().get("nodeCount").asInt();
            System.out.println("Number of nodes in the database: " + nodeCount);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
    }
}

