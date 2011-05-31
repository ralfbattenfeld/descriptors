package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
        

/**
 * This class is a generated class.
 * Generation date :2011-05-31T22:53:10.827+02:00
 */
public interface MessageDestinationType<T> extends Child<T>
{
   public MessageDestinationType<T> setDescription(String description);
   public String getDescription();

   public MessageDestinationType<T> setDisplayName(String displayName);
   public String getDisplayName();

   public MessageDestinationType<T> setIcon(IconType<MessageDestinationType<T>> icon);
   public IconType<MessageDestinationType<T>> getIcon();

   public MessageDestinationType<T> setMessageDestinationName(String messageDestinationName);
   public String getMessageDestinationName();

   public MessageDestinationType<T> setMappedName(String mappedName);
   public String getMappedName();

   public MessageDestinationType<T> setLookupName(String lookupName);
   public String getLookupName();
}
