package test;

import javax.lang.model.util.ElementScanner6;

public class MemberTest {
    public static void main(String[] args) {
        //Member클래스에 대한 member1객체 생성
        Member member1 = new Member();

        member1.setInfo("자바", "java", "abcd1234", 20);


        //생성한 객체의 모든 정보를 출력
        member1.showInfo();

        System.out.println();

        //isLogin("java", "abcd1234") 실행 시 결과로 '로그인 가능'이 출력되게 하세요
        if(member1.isLogin("java", "abcd1234")){
            System.out.println("로그인 가능");
        }
        else {
            System.out.println("로그인 불가능");
        }

        System.out.println();

        //isLogin("java", "abcd") 실행 시 결과로 '로그인 불가능'이 출력되게 하세요
        if(member1.isLogin("java", "abcd")){
            System.out.println("로그인 가능");
        }
        else {
            System.out.println("로그인 불가능");
        }

    }
}
