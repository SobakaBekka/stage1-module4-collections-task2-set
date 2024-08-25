package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> resultSet = new HashSet<>();

        // Elements that are in both firstSet and secondSet but not in thirdSet
        for (String element : firstSet) {
            if (secondSet.contains(element) && !thirdSet.contains(element)) {
                resultSet.add(element);
            }
        }

        // Elements that are only in thirdSet (not in firstSet and secondSet)
        for (String element : thirdSet) {
            if (!firstSet.contains(element) && !secondSet.contains(element)) {
                resultSet.add(element);
            }
        }

        return resultSet;
    }
}
