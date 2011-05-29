package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface InterceptorBindingType<T> extends Child<T>
{
   public InterceptorBindingType<T> setDescription(String description);

   public String getDescription();

   public InterceptorBindingType<T> setEjbName(String ejbName);

   public String getEjbName();

   public InterceptorBindingType<T> setExcludeDefaultInterceptors(Boolean excludeDefaultInterceptors);

   public Boolean getExcludeDefaultInterceptors();

   public InterceptorBindingType<T> setExcludeClassInterceptors(Boolean excludeClassInterceptors);

   public Boolean getExcludeClassInterceptors();

   public NamedMethodType<InterceptorBindingType<T>> setMethod(NamedMethodType<T> method);

   public NamedMethodType<InterceptorBindingType<T>> getMethod();
}
