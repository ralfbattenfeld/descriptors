package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public interface MethodPermissionType<T> extends Child<T>
{

   public MethodPermissionType<T> setDescription(String description);
   public String getDescription();


   public MethodPermissionType<T> setMethod(MethodType<MethodPermissionType<T>> method);
   public MethodType<MethodPermissionType<T>> getMethod();



   public MethodPermissionType<T> setRoleName(String roleName);
   public String getRoleName();


   public MethodPermissionType<T> setUnchecked(Boolean unchecked);
   public Boolean getUnchecked();
}