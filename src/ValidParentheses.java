import java.util.Stack;

class ValidParentheses {

    public boolean isValid(String s) {
        if(s.isEmpty()){
            return true;
        }
        int lengthString = s.length();
        Stack<Character> characterStack = new Stack<>();
        characterStack.push(s.charAt(0));
        for(int i = 1;i<lengthString;i++) {
            Character a = s.charAt(i);
            if(a.equals(']')){
                if(characterStack.empty()){
                    return false;
                }
                Character b = characterStack.pop();
                if(!b.equals('[')){
                    return false;
                }
            }
            else if(a.equals(')')){
                if(characterStack.empty()){
                    return false;
                }
                Character b = characterStack.pop();
                if(!b.equals('(')){
                    return false;
                }
            }
            else if(a.equals('}')){
                if(characterStack.empty()){
                    return false;
                }
                Character b = characterStack.pop();
                if(!b.equals('{')){
                    return false;
                }
            }
            else
                characterStack.push(a);

        }
        return characterStack.empty();
    }
}