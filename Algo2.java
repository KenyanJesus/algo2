import java.util.*;

public class Algo2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<Integer>();

        while(s.hasNextInt()){
            A.add(s.nextInt());
            //System.out.println(A);
        }
        Collections.sort(A);

        for(int i=0;i<(A.size()/2); i++){
            int k = 0;
            for (int j=0;j<=i;j++){
 //               System.out.println(A.get(j));
                k = k + A.get(j) + A.get(A.size() - j - 1);
            }
            System.out.println(k);
        }

    }

}
