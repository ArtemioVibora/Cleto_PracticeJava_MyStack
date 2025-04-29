import java.io.*; //Just in case

public class PushPopPeek
{
    public static void main(String args[])
    {
       int[] arr = {1, 2, 3};
       System.out.println("Original Array");
       display(arr);
       //display(arr);
       //arr = reverse(arr);
       //display(arr);
       //System.out.println(pop(arr));
       //arr = push(arr, 2);
       //System.out.println();
       //display(arr);
       //System.out.println();
       //arr = reverse(arr);
       //display(arr);
       //System.out.println();
       //arr = push(arr, 3);
       //display(arr);
       System.out.println("Popped last element of the array");
       arr = popArr(arr);
       System.out.println("Popped array");
       display(arr);
       System.out.println("Popped last element of the array");
       arr = popArr(arr);
       display(arr);
       System.out.println("Push variable"); 
       arr = push(arr, 51);
       display(arr);
       arr = push(arr, 6);
       display(arr);
       arr = popArr(arr);
       display(arr);
         
    }

    public static void display (int[] arr)
    {

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] +"\t");

        }
        System.out.println();
    }

    public static int[] reverse(int[] arr)
    {
        int[] newArr = new int[arr.length];
        int tracker = 0;
        for (int i = arr.length - 1; i > - 1; i--)
        {
            newArr[tracker] = arr[i];
            tracker++;
        }

        return newArr;

    }

    public static int pop(int[] arr)
    {
        int[] containerArray = reverse(arr);

        return containerArray[0];
    }

    public static int[] popArr(int[] arr)
    {
        System.out.println(pop(arr));
        int[] containerArray = new int[arr.length - 1];
        int[] newArr = new int[containerArray.length];
        containerArray = reverse(arr);
        for (int i = 1; i < arr.length - 1; i++)
        {
            containerArray[i - 1] = arr[i];
        }

        containerArray = reverse(containerArray);

        for (int j = 0; j < containerArray.length - 1; j++)
        {
            newArr[j] = containerArray[j];

        }

        return newArr;
        

    }

    public static int[] push(int[] arr, int n)
    {
        int tracker = 0;
        int newArr[] = new int[arr.length + 1];

        for (int i = 1; i < newArr.length; i++)
        {
            newArr[i] = arr[tracker];
            tracker++;
        }
        newArr[0] = n; 

        return newArr;

    }

}
