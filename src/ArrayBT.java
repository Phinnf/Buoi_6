public class ArrayBT {
    //Bai 1
    static void SumEvenNumberArrays(int[] array)
    {
        int i = 0, sum = 0;
        for (i = 0; i < array.length - 1; i++)
        {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        System.out.println("Output: Sum = "+ sum);
    } 
    //Bai 2
    static void maxInArray(int[] array)
    {
        int max = array[0], i = 1;
        while (i < array.length -1) {
            i++;
        if (array[i] > max) {
            max = array[i];
        }
        }
        System.out.println("Output: Max = " + max);
    }
    //Bai 3
    static void CountOccurrences(int[] array, int elementTofind){
        int i = 0, find = 0;
        for (i = 0; i < array.length - 1; i++)
        {
            if (i / elementTofind == 1) {
            find += 1;
            }
        }
        System.out.printf("Output: Phan tu %d xuat hien %d lan trong mang",elementTofind, find);
    }
}
