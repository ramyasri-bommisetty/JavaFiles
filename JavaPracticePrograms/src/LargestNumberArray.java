public class LargestNumberArray {
    public static void main(String[] args) {
        int [] a = {1,10,100,200,300,5};
        int max=a[0];

        for (int i=0;i<a.length;i++){
                   if(a[i]>max)
                       max=a[i];

                }
        System.out.println(max);
    }
}
