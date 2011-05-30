package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface AccessTimeoutType<T> extends Child<T>
{
   public AccessTimeoutType<T> setTimeout(Integer timeout);
   public Integer getTimeout();

   public AccessTimeoutType<T> setUnit(TimeUnitTypeType unit);
   public TimeUnitTypeType getUnit();
}
