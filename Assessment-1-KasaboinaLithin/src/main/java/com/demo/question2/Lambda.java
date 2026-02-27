package com.demo.question2;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Lambda {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,12,15,16,90,56,45);

        nums.stream().filter(n->n%2==0).forEach(System.out::println);

        int sum = nums.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(sum);


        List<Integer> sortedDesc = nums.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());

        System.out.println(sortedDesc);


    }
}
