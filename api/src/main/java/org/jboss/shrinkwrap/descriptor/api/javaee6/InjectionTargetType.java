package org.jboss.shrinkwrap.descriptor.api.javaee6;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-13T14:03:48.938+02:00
 */
public interface InjectionTargetType<T> extends Child<T>
{

   public InjectionTargetType<T> setInjectionTargetClass(String injectionTargetClass);

   public InjectionTargetType<T> removeInjectionTargetClass();

   public String getInjectionTargetClass();

   public InjectionTargetType<T> setInjectionTargetName(String injectionTargetName);

   public InjectionTargetType<T> removeInjectionTargetName();

   public String getInjectionTargetName();

}
