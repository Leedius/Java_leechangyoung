package test;

public class Test3 {
    public static void main(String[] args) {
        int[] arr = {5, 11, 200, 40, 30};
        int max;
        int min;

        max = arr[0];
        min = arr[0];
        for(int result : arr){
            if(result > max){
                max = result;
            }
            if(result < min){
                min = result;
            }
        }
        System.out.println("배열의 가장 큰 값 : " + max + ", 가장 작은 값 : " + min);
    }
}
