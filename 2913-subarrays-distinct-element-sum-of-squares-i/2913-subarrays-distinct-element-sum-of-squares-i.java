class Solution {
    public int sumCounts(List<Integer> nums) {
        int s= 0;
        for(int i=0;i<nums.size();i++){
            HashMap<Integer , Integer> m1 = new HashMap<>();
            for(int j=i;j<nums.size();j++){
                m1.put(nums.get(j), m1.getOrDefault(nums.get(j), 0) +1);
                s = s+m1.size()*m1.size();
            }
        }
        return s;
    }
}