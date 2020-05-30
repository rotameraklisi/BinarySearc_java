package com.company;

public class Main {


    public static int[] array = new int[]{2, 3, 5, 6, 7, 8};
    static int aranilan = 12;

    public static void main(String[] args) {
        // write your code here
        //binarySearch
        int startPointer = 0;
        int endPointer = array.length - 1;
        System.out.print(Arama(startPointer, endPointer));
    }

    public static int Arama(int startPointer, int endPointer) {
        int index = (startPointer + endPointer) / 2;
        if (array[index] == aranilan)
            return index;
        else if (index == 0|| index == array.length-1 && index != aranilan)
            return -1;
        else {
            if (aranilan < array[index]) {
                //sol
                endPointer = index - 1;
                return Arama(startPointer, endPointer);
            } else //aranilan > array[orta]
            {
                //sağ
                startPointer = index + 1;
               return Arama(startPointer, endPointer);
            }
        }
    }

}
