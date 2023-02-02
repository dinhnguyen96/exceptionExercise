public class NumberFormatException
{
    public static void plus(int a, int b)
    {
        int plus = a + b;
        System.out.println(a + "+" + b + "=" + plus);
    }

    public static void difference(int a, int b)
    {
        int diffrence = a - b;
        System.out.println(a + "-" + b + "=" + diffrence);
    }
    public static void volume(int a, int b)
    {
        int volumn = a * b;
        System.out.println(a + "*" + b + "=" + volumn);
    }
    public static void divide(int a, int b)
    {
        try
        {
            double divide = a / b;
            System.out.println(a +"/"+b+ "="+ divide);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Không hợp lệ vì không thể chia cho 0");
        }
    }
    public static void main(String[] args)
    {
        int a = 5, b =3;
        plus(a, b);
        difference(a, b);
        volume(a, b);
        divide(a,b);

    }
}
