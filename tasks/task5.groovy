def isIp(String string)  {        
         string = string.trim()
         String[] parts = string.split("\\.");
         if (parts.length != 4) return false;
         for (int i = 0; i < 4; ++i)
         {
             int p = Integer.parseInt(parts[i]);
             if (p > 255 || p < 0) return false;
         }
         return true;
     }
return this   
