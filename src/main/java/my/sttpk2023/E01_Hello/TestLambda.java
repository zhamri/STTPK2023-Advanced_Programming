package my.sttpk2023.E01_Hello;

class TestLambda {
    public static void main(String[] args) {
        Greeting g = ()-> System.out.println("Hello Test Lambda");
        g.sayHello();
    }
}
