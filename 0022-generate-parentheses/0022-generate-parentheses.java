class Solution {
    List<String> ans = new ArrayList<>();
    void func(String s , int n , int a, int b){
            if(s.length() == 2*n){
                ans.add(s);
                return;
            }
            if(a>n || b>n){
                return;
            }
            if(a<b){
                return;
            }
            if(a<n){
            func(s + "(", n, a + 1, b);
            }
            if(b<a){
            func(s + ")", n, a, b + 1);
             }
    }
    public List<String> generateParenthesis(int n) {
     func("" , n , 0, 0);
     return ans;
    }  
}