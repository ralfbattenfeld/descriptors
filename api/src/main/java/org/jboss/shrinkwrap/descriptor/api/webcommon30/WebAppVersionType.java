package org.jboss.shrinkwrap.descriptor.api.webcommon30;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T12:04:36.305-04:00
 *
 * Original Documentation:
 *
 *
 * This type contains the recognized versions of
 * web-application supported. It is used to designate the
 * version of the web application.
 *
 *
 *
 */
public enum WebAppVersionType {
   _3_0("3.0");

   private String value;

   WebAppVersionType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}