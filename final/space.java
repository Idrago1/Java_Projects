public class space{
    private int stop;
    private String temp = "";
    private String add = "";
    
    public String space(String thing){
        for(int i = 0; i< thing.length()-1; i++){
            if (thing.substring(i,i+1).equals(" ")){
                add = "%20";
                
            }else{
                add = thing.substring(i,i+1);
            }
            temp+=add;
        }
        return temp;
        
        
    }
    
    public String translation(String thing ){
        if (thing.equals("Error in Making Get Request")){
            return "Used too much times ";
        }
        
        for(int i = thing.indexOf("translated"); i< thing.indexOf("text")-1; i++){
            if (thing.substring(i,i+1).equals("!")){
                break;
                
            }else{
                if (thing.substring(i,i+1).equals('"')||thing.substring(i,i+1).equals(':')){
                    add = "";
                }else{
                    add = thing.substring(i,i+1);
                }
                
            
            }
            temp+=add;
        }
        return temp;
    }
    
    
}
