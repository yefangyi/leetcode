package com.yfy.Array.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> sets = new HashSet<>();
        for(int i : nums) {
            sets.add(i);
        }
        return !(sets.size() == nums.length);
    }

}
