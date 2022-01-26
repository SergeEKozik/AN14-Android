package VNazarov.Lab02;
public class TaskA2 {
    public static void main(String[] args) {

        String a = "a", b = "b", c = "c", d = "d", e = "e";
        // abcde bcdea bdbda cdeae

        String s1 = a + b + c + d + e;
        String s2 = b + c + d + e + a;
        String s3 = b + d + b + d + a;
        String s4 = c + d + e + a + e;

        System.out.println("My favourite poem is: " + s1 + " " + s2 + " " + s3 + " " + s4);
    }
}
