package my.sttpk2023.E01_Hello;

class Class1 {
    public static void main(String[] args) {

        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Class1");
            }
        };

        g.sayHello();
    }
}
