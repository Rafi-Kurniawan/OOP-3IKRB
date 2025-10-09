class HelloWorld {
    private String name;
    private String nim;

    public HelloWorld(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public void greet() {
        System.out.println("Hello World, I am " + name + "-" + nim);
    }
}

public class HelloOOP {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld("Rafi Kurniawan", "123456789");
        hello.greet();
    }
}
