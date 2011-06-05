package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public interface QueryMethodType<T> extends Child<T>
{

   public QueryMethodType<T> setMethodName(String methodName);
   public String getMethodName();


   public QueryMethodType<T> setMethodParams(MethodParamsType<QueryMethodType<T>> methodParams);
   public MethodParamsType<QueryMethodType<T>> getMethodParams();

}
