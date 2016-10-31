package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] list = {3, 5, 6, 2, 43};

        Sort sort = new Sort();
        sort.selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
}




