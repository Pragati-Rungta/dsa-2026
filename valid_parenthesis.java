/*Problem: Valid Parentheses (LeetCode 20)

Approach:
- Use a Stack data structure to keep track of opening brackets.
- Traverse the string character by character.
- If the character is an opening bracket '(', '{', '[', push it into the stack.
- If it is a closing bracket ')', '}', ']', check the top of the stack.
- If the stack is empty or the brackets do not match, return false.
- Otherwise pop the element from the stack.

- After processing the entire string, 
  if the stack is empty then the parentheses are valid.

Time Complexity: O(n)
Space Complexity: O(n)*/

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {

            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } 
            else {
                if(stack.isEmpty()) return false;

                char top = stack.pop();

                if(c == ')' && top != '(') return false;
                if(c == '}' && top != '{') return false;
                if(c == ']' && top != '[') return false;
            }
        }

        return stack.isEmpty();
    }
}
        
    
