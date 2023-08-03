package arrayFindNumber;
//1 уровень сложности: №1
// Дан массив размера  n-1, содержащий только различные целые числа в диапазоне от 1 до n .
// Найдите недостающий элемент.
// input:
//
// arr[] = {1,2,3,5}
// out: 4
//
// arr[] = {6,1,2,8,3,4,7,10,5}
// out: 9

public class ArrayFindNumber {
    public int findNumber(int[] arrayNumbers) {

        int generalArray = arrayNumbers.length;
        int factArray = generalArray + 1;
        int rezalt = 0;
        int realsum = factArray * (factArray + 1) / 2;

        for (int num : arrayNumbers) {
            rezalt += num;
        }
        return realsum - rezalt;
    }

}