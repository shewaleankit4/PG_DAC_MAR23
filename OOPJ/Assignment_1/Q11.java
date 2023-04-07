public class Q11 {
    public static void main(String[] args) {
        //cmd line argument's char at index 0
        if(Character.isLetterOrDigit(args[0].charAt(0))){
            //codePointAt(char [], index)
            
            System.out.println("digits Code point is "+Character.codePointAt(args[0], 0));
        }
        else if(Character.isAlphabetic(args[0].charAt(0))){
            String  c =args[0];
            if(Character.isLowerCase(args[0].charAt(0))){
                Character.toUpperCase(args[0].charAt(0));
                System.out.println("character "+Character.toUpperCase(args[0].charAt(0))+" codePoint is "+(Character.codePointAt(args[0],0)-32));
            }
            else{

            }
            
        }
    }
}
