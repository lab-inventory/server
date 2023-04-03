package com.inventory.structures;

import java.util.*;

public class GraphStruct {

    private Map<Integer, List<Integer>> graph;

    public GraphStruct() {
        graph = new HashMap<>();
    }

    public void addVertex(int vertex) {
        if (!graph.containsKey(vertex)) {
            graph.put(vertex, new ArrayList<>());
        }
    }

    public void addEdge(int vertex1, int vertex2) {
        if (graph.containsKey(vertex1) && graph.containsKey(vertex2)) {
            graph.get(vertex1).add(vertex2);
            graph.get(vertex2).add(vertex1);
        }
    }

    public List<Integer> getAdjacentVertices(int vertex) {
        return graph.get(vertex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int vertex : graph.keySet()) {
            sb.append(vertex).append(" -> ");
            sb.append(graph.get(vertex)).append("\n");
        }
        return sb.toString();
    }
}

