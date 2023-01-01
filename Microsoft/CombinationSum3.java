class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1;i<10;i++)
        {
            recurse(ans,k,n,i,new ArrayList<>());
        }


        return ans;

    }
    public void recurse(List<List<Integer>> ans,int k,int sum,int curr,List<Integer> currList)
    {
        if(curr>9 && sum!=0) return;
        if(sum==0)
        {
            if(k==0) {
                Collections.sort(currList);
                if(!ans.contains(currList))
                {
                    ans.add(new ArrayList<>(currList));
                }

            }
            return;
        }
        currList.add(curr);
        // System.out.println(curr+" "+sum+" "+currList);
        for(int i = curr+1;i<=(curr+sum);i++)
        {
            recurse(ans,k-1,sum-curr,i,currList);
        }
        currList.remove(currList.size()-1);
    }
}