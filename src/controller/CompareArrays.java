package controller;

public class CompareArrays {

    public static<T> boolean compateArrays(T[] arr1, T[] arr2){
        if(arr1.length == arr2.length){
            int count = 0;
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i].getClass().getSimpleName() == arr2[i].getClass().getSimpleName()){
                    if(arr1[i] == arr2[i]){
                        count++;
                    }
                }
            }
            if(count == arr1.length){
                return true;
            }
        }
        return false;
    }
}
