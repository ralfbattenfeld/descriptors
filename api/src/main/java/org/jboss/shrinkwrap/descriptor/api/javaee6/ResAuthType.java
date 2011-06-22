package org.jboss.shrinkwrap.descriptor.api.javaee6;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T12:04:36.305-04:00
 *
 * Original Documentation:
 *
 *
 * The res-authType specifies whether the Deployment Component
 * code signs on programmatically to the resource manager, or
 * whether the Container will sign on to the resource manager
 * on behalf of the Deployment Component. In the latter case,
 * the Container uses information that is supplied by the
 * Deployer.
 *
 * The value must be one of the two following:
 *
 * Application
 * Container
 *
 *
 *
 */
public enum ResAuthType {
   _APPLICATION("Application"), _CONTAINER("Container");

   private String value;

   ResAuthType(String value)
   {
      this.value = value;
   }

   public String toString()
   {
      return value;
   }
}