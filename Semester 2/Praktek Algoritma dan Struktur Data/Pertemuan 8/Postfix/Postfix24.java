package Postfix;
public class Postfix24 {
    int n, top;
    char[] stack;
    
    public Postfix24(int total){
        n = total;
        top = -1;
        stack = new char[n];
        push('(');
    }

    public void push(char c){
        top++;
        stack[top] = c;
    }

    public char pop(){
        char item = stack[top];
        top--;
        return item;
    }
 
    public boolean IsOperand(char c){
        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z' ) || (c >= '0' && c <= '9') || c == ' ' || c == '.' ) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsOperator(char c){
        return (c == '^' || c == '%' || c == '/' || c == '*' || c == '-' || c == '+');
    }

    public int derajat(char c){
        switch (c) {
            case '^':
                return 3;
            case '%':
                return 2;
            case '/':
                return 2;
            case '*':
                return 2;
            case '-':
                return 1;
            case '+':
                return 1;
            default:
                return 0;
        }
    }

    public String konversi (String Q){
        StringBuilder p = new StringBuilder();
        char c;
        for (int i = 0; i < n; i++){
            c = Q.charAt(i);
            if (IsOperand(c)){
                p.append(c);
            } 
            if (c == '('){
                push(c);
            } 
            if (c == ')'){
                while (stack[top] != '(') {
                    p.append(pop());
                }
                pop();
            }
            if (IsOperator(c)){
                while (derajat(stack[top]) >= derajat(c)) {
                    p.append(pop());
                }
                push(c);
            }
        }
        return p.toString();
    }
}
