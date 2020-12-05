public class QuestionTwo {
    public static void main(String[] args){
        int[] array = {2, -8, 3, -2, 4, -10};
        maxSubArrSum(array);
    }
    public static void maxSubArrSum(int[] a){
        int currentMax = Integer.MIN_VALUE, lastMax = 0, begin = 0, finish = 0, currentbegin = 0;

        for (int i = 0; i < a.length; i++) {
            lastMax += a[i];
            if (currentMax < lastMax) {
                currentMax = lastMax;
                begin = currentbegin;
                finish = i;
            }
            if (lastMax < 0) {
                lastMax = 0;
                currentbegin = i + 1;
            }
        }

        System.out.println("Max output = " + currentMax);
        System.out.print("Subarray: ");
        for (int i = begin; i < finish + 1; i++){
            System.out.print(a[i] + "   ");
        }
    }
}
