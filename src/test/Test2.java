package test;

public class Test2 {
    public static void main(String[] args) {
        int[] lotto = new int[6];

        for(int i = 0; i < lotto.length; i++){
            lotto[i] = (int)(Math.random()*45)+1;
        }

        for(int i = 0; i < lotto.length; i++){
            for(int j = 0; j < i; j++){
                if(lotto[i]==lotto[j]){
                    i--;
                }
            }
        }
        System.out.print("로또의 숫자는 : ");

        for (int i = 0; i < lotto.length; i++){
            System.out.print(lotto[i] + " ");
        }
    }
}
