import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOfException {



    public static void createRandom(int[] randomArray)
    {
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++)
        {
             randomArray[i] = random.nextInt(0, 100);
        }
    }

    public static void arrayOutput(int[] randomArray)
    {
        for (int i = 0; i < randomArray.length; i++)
        {
            System.out.println(randomArray[i] + " ");
        }
    }

    public static void elementSearchByIndex(int[] randomArray, int index)
    {
        try
        {
            System.out.printf("Phần tử tại vị trí %d là : %d", index, randomArray[index]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Chỉ số phần tử không hợp lệ");
        }

    }
    public static void indexInput(int[] randomArray)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vị trí phần tử cần tìm : ");
        int index = input.nextInt();
        elementSearchByIndex(randomArray,index);
    }


    public static void main(String[] args)
    {
        int[] randomArray = new int[100];
        createRandom(randomArray);
        arrayOutput(randomArray);
        indexInput(randomArray);
    }
}
