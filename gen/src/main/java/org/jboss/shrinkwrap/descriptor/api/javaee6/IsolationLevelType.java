package org.jboss.shrinkwrap.descriptor.api.javaee6; 

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public enum IsolationLevelType
{
   _TRANSACTION_READ_UNCOMMITTED("TRANSACTION_READ_UNCOMMITTED"),
   _TRANSACTION_READ_COMMITTED("TRANSACTION_READ_COMMITTED"),
   _TRANSACTION_REPEATABLE_READ("TRANSACTION_REPEATABLE_READ"),
   _TRANSACTION_SERIALIZABLE("TRANSACTION_SERIALIZABLE");

   private String value;

   IsolationLevelType (String value) { this.value = value; }

   public String toString() {return value;}
}
