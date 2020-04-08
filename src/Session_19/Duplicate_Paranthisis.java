import java.util.Stack; 
import java.util.Scanner;
  

class GFG { 
  
    static boolean findDuplicateparenthesis(String s) { 
        Stack<Character> Stack = new Stack<>(); 
  
        char[] str = s.toCharArray(); 
        for (char ch : str) { 
            if (ch == ')') { 
                char top = Stack.peek(); 
                Stack.pop(); 
  
                int elementsInside = 0; 
                while (top != '(') { 
                    elementsInside++; 
                    top = Stack.peek(); 
                    Stack.pop(); 
                } 
                if (elementsInside < 1) { 
                    return true; 
                } 
            }   
            else { 
                Stack.push(ch); 
            } 
        } 
  
        return false; 
    } 
  
public static void main(String[] args) { 
  
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] str = new String[t];
        
        for(int i =0; i<t; i++){
                 str[i] = sc.nextLine();
        }

        for(int i =0; i<t; i++){
        
        if (findDuplicateparenthesis(str[i])) { 
            System.out.println("Duplicate Found "); 
        } else { 
            System.out.println("No Duplicates Found "); 
        } 
    }
    } 
} 