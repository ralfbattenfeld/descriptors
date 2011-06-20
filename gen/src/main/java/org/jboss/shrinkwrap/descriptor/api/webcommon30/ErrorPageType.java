package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-19T21:45:00.466-04:00
 */
public interface ErrorPageType<T> extends Child<T>
{

   public ErrorPageType<T> setLocation(String location);

   public ErrorPageType<T> removeLocation();

   public String getLocation();

   public ErrorPageType<T> setErrorCode(Integer errorCode);

   public ErrorPageType<T> removeErrorCode();

   public Integer getErrorCode();

   public ErrorPageType<T> setExceptionType(String exceptionType);

   public ErrorPageType<T> removeExceptionType();

   public String getExceptionType();

}
