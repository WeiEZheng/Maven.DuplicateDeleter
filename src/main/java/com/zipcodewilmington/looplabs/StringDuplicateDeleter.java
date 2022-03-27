package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String [] newArr = new String[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (checkOccurrence(array[i])<maxNumberOfDuplications) {
                newArr[count]=array[i];
                count++;
            }
        }
        String[] result = new String[count];
        System.arraycopy(newArr,0,result,0,count);
        return result;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        String [] newArr = new String[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (checkOccurrence(array[i])!= exactNumberOfDuplications) {
                newArr[count]=array[i];
                count++;
            }
        }
        String[] result = new String[count];
        System.arraycopy(newArr,0,result,0,count);
        return result;
    }
}
