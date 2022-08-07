public class ThisKeyword {

    void Show() {

        System.out.println(this);

    }

    public static void main(String[] args) {
        ThisKeyword r = new ThisKeyword();
        System.out.println(r);
        r.Show();
    }

}
