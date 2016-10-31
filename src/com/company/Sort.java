package com.company;

/**
 * Created by Jeremiah on 9/30/16.
 */
public class Sort {

    public int[] selectionSort(int[] list){
        int i,j,minVal,minIndex, temp = 0;

        for(i =0; i < list.length; i++ ){
            minVal = list[i];
            minIndex =i;

            for( j = i; j < list.length; j++){

                if(list[j] < minVal){
                    minVal = list[j];
                    minIndex = j;
                }
                if(minVal < list[i]){
                    temp = list[i];
                    list[i] = list[minIndex];
                    list[minIndex]=temp;
                }

            }

        }
        return list;
    }




    }


}
