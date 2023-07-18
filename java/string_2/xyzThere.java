package java.string_2;

public class xyzThere {
    public boolean xyzyhere(String str) {
  
        boolean xyzCheck = false;
        
        for (int i = 0; i < str.length()-2; i++)
        {
          if (str.substring(i, i+3).compareTo("xyz") == 0 && i == 0)
          {
            xyzCheck = true;
          }
          if (str.substring(i, i+3).compareTo("xyz") == 0 && str.charAt(i - 1) != '.')
          {
            xyzCheck = true;
          }
        }
      
        return xyzCheck;
      }
}
