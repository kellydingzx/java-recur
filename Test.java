import java.util.ArrayList;

public class Test {
    public static void main(String[] argu){
        int[] coins = {100,50,20,10,5,2,1};
        ArrayList<Integer> ans = new ArrayList<>();
        getCoin(coins,82,ans,10);
        System.out.println(ans);
    }

    static int getCoin(int[] coins, int target, ArrayList<Integer> ans, int depth){
        if(target == 0 || depth == 0){
            return 0;
        }
        System.out.println(target);
        depth--;
        for(int i: coins){
            if(target>=i){
                ans.add(i);
                target -= i;
                break;
            }
        }
        getCoin(coins, target, ans,depth);
        return 0;
    }
}