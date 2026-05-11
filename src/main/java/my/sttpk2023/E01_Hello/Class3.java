package my.sttpk2023.E01_Hello;

class Class3 implements Greeting{
    @Override
    public void sayHello() {
        System.out.println("Hello Class3");
    }

    public static void main(String[] args) {
        new Class3().sayHello();
    }
}
