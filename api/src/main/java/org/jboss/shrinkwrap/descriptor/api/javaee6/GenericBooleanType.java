package org.jboss.shrinkwrap.descriptor.api.javaee6;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T12:04:36.305-04:00
 *
 * Original Documentation:
 *
 *
 * This type defines four different values which can designate
 * boolean values. This includes values yes and no which are
 * not designated by xsd:boolean
 *
 *
 *
 */
public enum GenericBooleanType {
   _TRUE("true"), _FALSE("false"), _YES("yes"), _NO("no");

   private String value;

   GenericBooleanType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}