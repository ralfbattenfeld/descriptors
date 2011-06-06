package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public interface StatefulTimeoutType<T> extends Child<T>
{

   public StatefulTimeoutType<T> setTimeout(Integer timeout);
   public Integer getTimeout();


   public StatefulTimeoutType<T> setUnit(String unit);
   public String getUnit();
}
