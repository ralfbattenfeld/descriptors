package org.jboss.shrinkwrap.descriptor.api.javaee6;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T12:04:36.305-04:00
 *
 * Original Documentation:
 *
 *
 * The ejb-ref-typeType contains the expected type of the
 * referenced enterprise bean.
 *
 * The ejb-ref-type designates a value
 * that must be one of the following:
 *
 * Entity
 * Session
 *
 *
 *
 */
public enum EjbRefTypeType {
   _ENTITY("Entity"), _SESSION("Session");

   private String value;

   EjbRefTypeType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}