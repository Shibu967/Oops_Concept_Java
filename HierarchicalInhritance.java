class A {

    void input() {
        System.out.println("Enter Your Name: ");
    }
}

class B extends A {
    void Show() {
        System.out.println("My name is shibu kumari");
    }

}

class C extends A {
    void Disp() {

        System.out.println("My name is shibu kumari");
    }
}

public class HierarchicalInhritance {
    public static void main(String[] args) {
        B r = new B();
        C r2 = new C();

        r.input();
        r.Show();
        r2.input();
        r2.Disp();

    }

}
