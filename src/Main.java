import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int a = scanner.nextInt();
int b = scanner.nextInt();
int c = scanner.nextInt();
if (a + b > c && a + c > b && b + c > a )
{
if (a == b && b == c)
{
System.out.println("equilateral");
}
else if (a == b || a == c || b == c)

{System.out.println("isosceles");
}
else
System.out.println("versatile");
}
else {
System.out.println("invalid");
}
     scanner.close();
    }
}