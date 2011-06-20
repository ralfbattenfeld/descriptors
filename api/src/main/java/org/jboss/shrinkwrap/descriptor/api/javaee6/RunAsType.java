package org.jboss.shrinkwrap.descriptor.api.javaee6;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-19T21:45:00.466-04:00
 */
public interface RunAsType<T> extends Child<T>
{

   public RunAsType<T> setDescription(String description);

   public RunAsType<T> setDescriptionList(String... values);

   public RunAsType<T> removeAllDescription();

   public List<String> getDescriptionList();

   public RunAsType<T> setRoleName(String roleName);

   public RunAsType<T> removeRoleName();

   public String getRoleName();

}
