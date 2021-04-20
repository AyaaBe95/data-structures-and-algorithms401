package stack.and.queue;

import java.util.HashMap;

public class MultiBracketValidation {


    public static boolean multiBracketValidation(String input){
        stack OpenBracket = new stack();
        HashMap<String, String> multiBracket = new HashMap<String,String>();
        multiBracket.put("}", "{");
        multiBracket.put("]", "[");
        multiBracket.put(")", "(");
        for (int i = 0; i < input.length(); i++) {
            String chara = Character.toString(input.charAt(i));
            String item = multiBracket.get(chara);
            if(item != null){
                if(OpenBracket.isEmpty() || !item.equals(OpenBracket.pop())){ return false;}
            }else if (chara.equals("(") || chara.equals("{") || chara.equals("[") ){
                OpenBracket.push(chara);
            }
        }
        return OpenBracket.isEmpty();
    }
}
