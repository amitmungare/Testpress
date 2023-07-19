import java.math.BigInteger;

public class LargestValueArrangement {
    public static void main(String[] args) {
        int[] arr = {54, 546, 548, 60};
        String largestValue = largestNumber(arr);
        System.out.println(largestValue);
    }

    public static String largestNumber(int[] arr) {
        String res="";

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                String s1=Integer.toString(arr[i]);
                String s2=Integer.toString(arr[j]);
                if(((s2+s1).compareTo(s1+s2))>0){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
            res+=Integer.toString(arr[i]);
        }

        BigInteger resValue = new BigInteger(res);
        BigInteger zero = BigInteger.valueOf(0);

        return resValue.compareTo(zero)==0 ? "0" : res;
    }
}
