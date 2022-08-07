
public class ThisKeyword2 {
    int a;// this is instance variable

    ThisKeyword2(int a) { // this is local variable

        this.a = a;

    }

    void Show() {

        System.out.println(a);
    }

    public static void main(String[] args) {

        ThisKeyword2 r = new ThisKeyword2(100);
        r.Show();
    }

}
