package org.jboss.shrinkwrap.descriptor.api.ejbjar31;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface InterceptorsType<T> extends Child<T>
{
   public InterceptorsType<T> setDescription(String description);

   public String getDescription();

   public InterceptorType<InterceptorsType<T>> setInterceptor(InterceptorType<T> interceptor);

   public InterceptorType<InterceptorsType<T>> getInterceptor();
}
