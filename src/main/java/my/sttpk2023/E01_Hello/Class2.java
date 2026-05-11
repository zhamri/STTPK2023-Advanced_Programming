package my.sttpk2023.E01_Hello;

class Class2 {
    public static void main(String[] args) {

        Greeting g = () -> {
            System.out.println("Hello Class2");
        };

        g.sayHello();
    }
}
