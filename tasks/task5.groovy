def isIp(String str)
{
         String[] parts = str.split("\\.");
         if (parts.length != 4) return false;
         for (int i = 0; i < 4; ++i)
         {
             int p = Integer.parseInt(parts[i]);
             if (p > 255 || p < 0) return false;
         }
         return true;
      {
        return false;
    }
}
}
return this
