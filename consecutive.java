public class consecutive {
    public static void main(String[] args) {
        System.out.println(consecutive1(1, 2, 5));
    }
    public static boolean consecutive1(int i, int j, int k){
        if((i + j)/2 == k || (j + k)/2 == i || (i + k)/2 == j){
            return true;
        }
        return false;
    }
}
