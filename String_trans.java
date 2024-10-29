import java.util.Scanner;

public class String_trans {
    public static String transformed_String(String str){
        StringBuilder startString = new StringBuilder();
        int n = str.length();


        for(int i = 0; i<n; i++){
            char currentChar = str.charAt(i);
            
            if(currentChar == 'a'){
                startString.append('b');
            }
            else if(currentChar == 'b'){
                startString.append('a');
            }
            else{
                startString.append(currentChar);
            }
        }
        return startString.toString();
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Input your string: "); 
        String input = sc.nextLine();

        System.out.print(transformed_String(input));
        sc.close();
    }
}
