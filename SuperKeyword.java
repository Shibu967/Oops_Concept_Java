class A {
    int a = 10;

}

class B extends A {

    int a = 30;

    void Show() {// for variable excess

        System.out.println(a);
    }

}

public class SuperKeyword {
    public static void main(String[] args) {
        B r = new B();
        r.Show();
    }

}
