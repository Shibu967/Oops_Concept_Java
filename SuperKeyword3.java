
class A {
    A() {

        System.out.println("Hello Shibu");
    }

}

class B extends A {

    B() {// super() reserve

        // means itself java compiler written super keyeword

        System.out.println("Hello vipul ");
    }

}

public class SuperKeyword3 {
    public static void main(String[] args) {
        B r = new B();

    }
}
