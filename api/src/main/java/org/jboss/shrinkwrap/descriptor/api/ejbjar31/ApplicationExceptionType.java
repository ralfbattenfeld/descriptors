package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T22:53:10.827+02:00
 */
public interface ApplicationExceptionType<T> extends Child<T>
{
   public ApplicationExceptionType<T> setExceptionClass(String exceptionClass);
   public String getExceptionClass();

   public ApplicationExceptionType<T> setRollback(Boolean rollback);
   public Boolean getRollback();

   public ApplicationExceptionType<T> setInherited(Boolean inherited);
   public Boolean getInherited();
}
