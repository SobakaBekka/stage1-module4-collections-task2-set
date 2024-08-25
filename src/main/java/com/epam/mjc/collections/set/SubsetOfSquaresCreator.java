package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.NavigableSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> squaresSet = new TreeSet<>();
        for (Integer x : sourceList) {
            squaresSet.add(x * x);
        }
        // Получаем подмножество в заданных границах
        NavigableSet<Integer> subset = squaresSet.subSet(lowerBound, true, upperBound, true);
        return subset;
    }
}
