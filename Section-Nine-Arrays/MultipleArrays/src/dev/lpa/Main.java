package dev.lpa;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[][] array2 = new int[4][4];
        System.out.println(Arrays.toString(array2));
        System.out.println("array2.length = " + array2.length);
        for (int[] outer : array2) {
            System.out.println(Arrays.toString(outer));
        }

        for (int i = 0; i < array2.length; i++) {
            var innerArray = array2[i];
            for (int j = 0; j < innerArray.length; j++) {
                array2[i][j] = (i * 10) + (j + 1);
            }
        }

//        for (var outer : array2) {
//            for (var inner : outer) {
//                System.out.print(inner + ",");
//            }
//            System.out.println();
//        }

        System.out.println(Arrays.deepToString(array2));

        array2[1] = new int[]{10, 20, 30};
        System.out.println(Arrays.deepToString(array2));

        Object[] anyArray = new Object[3];
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[]{"A", "B", "C"};
        anyArray[1] = new String[][]{
                {"1", "2", "3"},
                {"4", "5", "6", "7"},
                {"8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2];
        System.out.println(Arrays.deepToString(anyArray));

        for (Object element : anyArray) {
            System.out.println();
            System.out.println("Element type = " + element.getClass().getSimpleName());
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element));
        }
    }

}
