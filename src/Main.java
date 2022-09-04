import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        double num = Double.parseDouble(args[0]);
        double i = 2;
        ArrayList<Integer> res = new ArrayList<>();
        do{
            double temp = num/i;
            if ((temp == Math.floor(temp))) {
                res.add((int) i);
                num = temp;
                i=1;
            }
            i++;
        }
        while(num!=1.0);
        System.out.print("The Prime Factorization is: ");
        for(int a: res)
        {
            System.out.print(a+" ");
        }

    }
}
