package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface ServletMappingType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ServletMappingType<T> setServletName(String servletName);

   public String getServletName();


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public ServletMappingType<T> setUrlPattern(String urlPattern);
   public ServletMappingType<T> setUrlPattern(String ... values);

   public List<String> getUrlPatternList();

}
