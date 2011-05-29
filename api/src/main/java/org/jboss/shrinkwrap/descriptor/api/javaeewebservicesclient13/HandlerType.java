package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DescriptionGroup;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;

/**
 * This class is a generated class.
 * Generation date :2011-05-29T14:51:23.661+02:00
 */
public interface HandlerType<T> extends Child<T>, DescriptionGroup<T>

{
   public HandlerType<T> setHandlerName(String handlerName);

   public String getHandlerName();

   public HandlerType<T> setHandlerClass(String handlerClass);

   public String getHandlerClass();

   public ParamValueType<HandlerType<T>> setInitParam(ParamValueType<T> initParam);

   public ParamValueType<HandlerType<T>> getInitParam();

   public HandlerType<T> setSoapHeader(String soapHeader);

   public String getSoapHeader();

   public HandlerType<T> setSoapRole(String soapRole);

   public String getSoapRole();

   public HandlerType<T> setPortName(String portName);

   public String getPortName();
}
