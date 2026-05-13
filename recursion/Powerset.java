import java.util.ArrayList;
import java.util.List;

class Powerset {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        generate(nums, 0, ans, new ArrayList<>());

        return ans;
    }

    static void generate(int[] arr, int i, List<List<Integer>> res, List<Integer> ls) {
        if (i == arr.length) {
            res.add(new ArrayList<>(ls));
            return;
        }

        generate(arr, i + 1, res, ls);
        ls.add(arr[i]);
        generate(arr, i + 1, res, ls);
        ls.remove(ls.size() - 1);
    }
}