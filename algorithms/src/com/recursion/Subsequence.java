public class Subsequence {

    private static void subsequence(int indx, int[] arr, List<Integer> out) {
        if(indx >= arr.length) {
            System.out.println(out);
            return;
        }
        out.add(arr[indx]);
        subsequence(indx+1, arr, out);
        out.remove(Integer.valueOf(arr[indx]));
        subsequence(indx+1, arr, out);
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> out = new ArrayList<>();
        subsequence(0, arr, out);
    }
}

/*
Output
[3, 1, 2]
[3, 1]
[3, 2]
[3]
[1, 2]
[1]
[2]
[]
*/
