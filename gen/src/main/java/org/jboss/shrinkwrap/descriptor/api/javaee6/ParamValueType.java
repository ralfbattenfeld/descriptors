package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
/**
 * This class is a generated class.
 * Generation date :2011-06-27T15:30:58.763-04:00
 *
 * Original Documentation:
 *
 *
 * This type is a general type that can be used to declare
 * parameter/value lists.
 *
 *
 *
 */
public interface ParamValueType<T> extends Child<T>
{

   public ParamValueType<T> setDescription(String description);
   public ParamValueType<T> setDescriptionList(String ... values);
   public ParamValueType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public ParamValueType<T> setParamName(String paramName);
   public ParamValueType<T> removeParamName();

   public String getParamName();



   public ParamValueType<T> setParamValue(String paramValue);
   public ParamValueType<T> removeParamValue();

   public String getParamValue();

}
