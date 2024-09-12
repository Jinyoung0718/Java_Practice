package chap_09.coffee;

import chap_09.user.User;
// 원하는 형태의 객체만 받도록 하는 클래스
public class CoffeeByUser<T extends User> {

    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + user.name);
        user.addPoint();
    }
}
