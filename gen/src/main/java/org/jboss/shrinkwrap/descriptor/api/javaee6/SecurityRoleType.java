package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-19T19:10:14.736-04:00
 */
public interface SecurityRoleType<T> extends Child<T>
{

   public SecurityRoleType<T> setDescription(String description);
   public SecurityRoleType<T> setDescriptionList(String ... values);
   public SecurityRoleType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public SecurityRoleType<T> setRoleName(String roleName);
   public SecurityRoleType<T> removeRoleName();

   public String getRoleName();

}
