public class ThisKeyword4 {

    ThisKeyword4() {// defut constructor

        this(10);

    }

    ThisKeyword4(int a) {// ParameterizedConstructor

        System.out.println(a);

    }

    public static void main(String[] args) {
        ThisKeyword4 r = new ThisKeyword4();
    }

}
