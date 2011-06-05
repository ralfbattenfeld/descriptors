package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:52:46.95+02:00
 */
public interface ServletMappingType<T> extends Child<T>
{

   public ServletMappingType<T> setServletName(String servletName);
   public String getServletName();


   public ServletMappingType<T> setUrlPattern(String urlPattern);
   public String getUrlPattern();
}