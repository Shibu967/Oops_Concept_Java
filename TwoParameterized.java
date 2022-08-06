
class A {
    int x, y;

    A(int a, int b)// parameterized
    {
        x = a;
        y = b;
    }

    A(int a, String b)// parameterized
    {
        System.out.println(a + " " + b);
    }

    void Disp() {
        System.out.println(x + " " + y);
    }

}

public class TwoParameterized {
    public static void main(String[] args) {
        A r = new A(100, 300);
        A ref = new A(10, "shibu");
        r.Disp();
    }

}
