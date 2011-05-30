package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-30T06:59:44.76+02:00
 */
public interface WebCommonAttributes<T> extends Child<T>
{
   public T setVersion(WebAppVersionType version);
   public WebAppVersionType getVersion();

   public T setMetadataComplete(Boolean metadataComplete);
   public Boolean getMetadataComplete();
}