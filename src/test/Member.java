package test;

import java.security.cert.TrustAnchor;
import java.sql.SQLOutput;

public class Member {
    private String name;
    private String id;
    private String pw;
    private int age;

    public Member(){

    }

    public Member(String name, String id, String pw, int age){
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }

    public void setInfo(String name, String id, String pw, int age){
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.age = age;
    }

    public void showInfo(){
        System.out.println("이름 : " + name
                + ", 아이디 : " + id
                + ", 비밀번호 : " + pw
                + ", 나이 : " + age);
    }

    public boolean isLogin(String id, String pw){
        if(this.id.equals(id) && this.pw.equals(pw)){
            return true;
        }
        else {
            return false;
        }
    }
}
