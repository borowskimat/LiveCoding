package org.live.coding;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 2};
        int val = 4;

        Arrays.stream(nums).filter(value -> value != val).count()
    }
}