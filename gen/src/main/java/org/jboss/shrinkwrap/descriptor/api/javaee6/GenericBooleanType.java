package org.jboss.shrinkwrap.descriptor.api.javaee6; 

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public enum GenericBooleanType
{
   _TRUE("true"),
   _FALSE("false"),
   _YES("yes"),
   _NO("no");

   private String value;

   GenericBooleanType (String value) { this.value = value; }

   public String toString() {return value;}
}

