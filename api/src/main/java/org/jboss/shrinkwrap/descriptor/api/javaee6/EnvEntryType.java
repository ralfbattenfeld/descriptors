package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface EnvEntryType<T> extends Child<T>, ResourceGroup<T>
{
   public EnvEntryType<T> setDescription(String description);
   public String getDescription();

   public EnvEntryType<T> setEnvEntryName(String envEntryName);
   public String getEnvEntryName();

   public EnvEntryType<T> setEnvEntryType(String envEntryType);
   public String getEnvEntryType();

   public EnvEntryType<T> setEnvEntryValue(String envEntryValue);
   public String getEnvEntryValue();
}
