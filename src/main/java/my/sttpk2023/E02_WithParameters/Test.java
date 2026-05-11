package my.sttpk2023.E02_WithParameters;

class Test {
    public static void main(String[] args) {
        Sum s = (x, y)-> System.out.println("Total: " + (x + y));
        s.add(10,15);
    }
}
