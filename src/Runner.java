public class Runner {

    public static void main(String[] args) {

System.out.println(factorials(5));



    }
    public static int  factorials(int fact)
    {
        int num = 1;
        for(int i=fact;i>=1;i--){
            num=num*i;
        }
        return num;
    }



}
