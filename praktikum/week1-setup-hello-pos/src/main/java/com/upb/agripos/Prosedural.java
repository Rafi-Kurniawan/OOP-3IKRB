public class HelloProsedural {
    public static void main(String[] args) {
        String name = "Rafi Kurniawan";
        String nim = "123456789";
        greet(name, nim);
    }

    static void greet(String name, String nim) {
        System.out.println("Hello World, I am " + name + "-" + nim);
    }
}
