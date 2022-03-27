package com.zipcodewilmington.looplabs;

import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer [] newArr = new Integer[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (checkOccurrence(array[i])<maxNumberOfDuplications) {
                newArr[count]=array[i];
                count++;
            }
        }
        Integer[] result = new Integer[count];
        System.arraycopy(newArr,0,result,0,count);
        return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        Integer [] newArr = new Integer[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (checkOccurrence(array[i]) != exactNumberOfDuplications) {
                newArr[count]=array[i];
                count++;
            }
        }
        Integer[] result = new Integer[count];
        System.arraycopy(newArr,0,result,0,count);
        return result;
    }
}
