package org.anc.lapps.util;

import java.util.*;

/**
 * @author Keith Suderman
 */
public class LappsUtils
{
   public LappsUtils()
   {

   }

   public static String makeStringList(List<String> strings)
   {
      StringBuilder builder = new StringBuilder();
      Iterator<String> it = strings.iterator();
      if (it.hasNext())
      {
         builder.append(it.next());
      }
      while (it.hasNext())
      {
         builder.append("\n");
         builder.append(it.next());
      }
      return builder.toString();
   }

   public static String makeStringList(String[] strings)
   {
      StringBuilder builder = new StringBuilder();
      int i = 0;
      if (i < strings.length)
      {
         builder.append(strings[i]);
         ++i;
      }
      while (i < strings.length)
      {
         builder.append("\n");
         builder.append(strings[i]);
         ++i;
      }
      return builder.toString();
   }

   public static List<String> parseStringList(String input)
   {
      return Arrays.asList(input.split("\n"));
   }
}
