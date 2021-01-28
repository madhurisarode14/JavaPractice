package InterviewPrograms;

public class SwapNumbers {
    int a=10;
    int b=20;

    public static void main(String[] args) {
        SwapNumbers swapNumbers = new SwapNumbers();


        swapNumbers.swapWithoutTemp();



    }

    public void swapWithoutTemp(){

        onlyPrint("before swapping ");
        a = a + b;//10+20 =30
        b = a -b;//30-20=10
        a = a-b;//30-10 =20
        onlyPrint("after swapping ");


    }
    public void swapWithTemp(){
        // logic 1
        onlyPrint("before swapping ");

        int  temp=a;
        a = b;
        b = temp;
        onlyPrint("after swapping ");


    }

    private void onlyPrint(String s) {
        System.out.println(s + a + " " + b);
        System.out.println("Finish");

    }
}
