package com.kodilla.good.patterns.challenges;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreRunner {

    public static void main(String[] args) {

        Map<String, List<String>> movies = new MovieStore().getMovies();

        String moviesLine = movies.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.joining("!"));

        System.out.println(moviesLine);
    }
}
