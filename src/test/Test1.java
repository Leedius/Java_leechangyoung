package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int index;
        int[] arr;

        System.out.print("입력받을 정수의 개수 : ");
        index = sc.nextInt();

        arr = new int[index];

        for(int i = 0; i < index; i++){
            System.out.print(i+1 + "번째 정수를 입력하세요 : ");
            arr[i] = sc.nextInt();
        }


        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++) {
                index = 0;
                if(arr[i]<arr[j]){
                    index = arr[i];
                    arr[i] = arr[j];
                    arr[j] = index;
                }
            }
        }
        for(int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i] + ">");
        }
        System.out.println(arr[arr.length-1]);
    }

}

