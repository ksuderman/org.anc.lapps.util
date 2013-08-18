package org.anc.lapps.util;

import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * @author Keith Suderman
 */
public class LappsUtilsTest
{
   private String[] array = { "one", "two", "three" };

   public LappsUtilsTest()
   {

   }

   @Test
   public void testMakeListFromArray()
   {
      String string = LappsUtils.makeStringList(array);
      assertTrue("Invalid string returned: " + string, "one\ntwo\nthree".equals(string));
   }

   @Test
   public void testMakeListFromList()
   {
      List<String> list = Arrays.asList(array);
      String string = LappsUtils.makeStringList(list);
      assertTrue("Invalid string returned: " + string, "one\ntwo\nthree".equals(string));
   }

   @Test
   public void testRoundTripFromArray()
   {
      String string = LappsUtils.makeStringList(array);
      List<String> result = LappsUtils.parseStringList(string);
      assertTrue("Invalid sizes.", result.size() == array.length);
      for (int i = 0; i < result.size(); ++i)
      {
         assertTrue(result.get(i).equals(array[i]));
      }
   }

   @Test
   public void testRoundTripFromList()
   {
      List<String> list = Arrays.asList(array);
      String string = LappsUtils.makeStringList(list);
      List<String> result = LappsUtils.parseStringList(string);
      assertTrue("Invalid sizes.", list.size() == result.size());
      for (int i = 0; i < list.size(); ++i)
      {
         assertTrue(list.get(i).equals(result.get(i)));
      }
   }
}
