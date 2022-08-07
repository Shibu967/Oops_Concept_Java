public class StaticBlock {

    public static void main(String[] args) {
        StaticBlock r = new StaticBlock();

    }

    StaticBlock() {
        System.out.println("vipul");// constructor
    }

    {
        System.out.println("I love you");// instance block
    }

    static {

        System.out.println("Shibu said");// static block

    }

}
