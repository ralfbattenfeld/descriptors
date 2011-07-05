package org.jboss.shrinkwrap.descriptor.api.webcommon30;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:40:43.525+02:00
 */
public enum NullCharType {
   _("");

   private String value;

   NullCharType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }

   public static NullCharType getFromStringValue(String value)
   {
      for (NullCharType type : NullCharType.values())
      {
         if (value != null && type.toString().equals(value))
         {
            return type;
         }
      }
      return null;
   }

}
