package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface WebResourceCollectionType<T> extends Child<T>
{
   public WebResourceCollectionType<T> setWebResourceName(String webResourceName);
   public String getWebResourceName();

   public WebResourceCollectionType<T> setDescription(String description);
   public String getDescription();

   public WebResourceCollectionType<T> setUrlPattern(String urlPattern);
   public String getUrlPattern();
}
