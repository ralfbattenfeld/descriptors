package org.jboss.shrinkwrap.descriptor.api.javaee6; 

/**
 * This class is a generated class.
 * Generation date :2011-06-19T19:10:14.736-04:00
 */
public enum PersistenceContextTypeType
{
   _TRANSACTION("Transaction"),
   _EXTENDED("Extended");

   private String value;

   PersistenceContextTypeType (String value) { this.value = value; }

   public String toString() {return value;}
}

