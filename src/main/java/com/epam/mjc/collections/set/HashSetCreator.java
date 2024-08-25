package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> resultSet = new HashSet<>();
        for (Integer x : sourceList) {
            if (x % 2 == 0) {  // x is even
                while (x % 2 == 0) {
                    resultSet.add(x);
                    x /= 2;
                }
                resultSet.add(x);  // Add the final odd number
            } else {  // x is odd
                resultSet.add(x);
                resultSet.add(2 * x);
            }
        }
        return resultSet;
    }
}
