package org.jboss.shrinkwrap.descriptor.impl.javaeewebservices13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservices13.WebserviceDescriptionType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservices13.WebservicesType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public class WebservicesTypeImpl<T> implements Child<T>, WebservicesType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private WebserviceDescriptionType<WebservicesType<T>> webserviceDescription;

   private String description;
   private String displayName;
   private IconType<WebservicesType<T>> icon;


   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WebservicesTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("");   }


   public T up()
   {
      return t;
   }



   public WebservicesType<T> setDescription(String description)
   {
      this.description = description;
      childNode.getOrCreate("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }


   public WebservicesType<T> setDisplayName(String displayName)
   {
      this.displayName = displayName;
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   public String getDisplayName()
   {
      return displayName;
   }


   public WebservicesType<T> setIcon(IconType<WebservicesType<T>> icon)
   {
      this.icon = icon;
      childNode.getOrCreate("icon").text(icon);
      return this;
   }

   public IconType<WebservicesType<T>> getIcon()
   {
      if( icon == null)
      {
          icon = new IconTypeImpl<WebservicesType<T>>(this, "", childNode);
      }
      return icon;
   }



   public WebservicesType<T> setWebserviceDescription(WebserviceDescriptionType<WebservicesType<T>> webserviceDescription)
   {
      this.webserviceDescription = webserviceDescription;
      childNode.getOrCreate("webservice-description").text(webserviceDescription);
      return this;
   }

   public WebserviceDescriptionType<WebservicesType<T>> getWebserviceDescription()
   {
      if( webserviceDescription == null)
      {
          webserviceDescription = new WebserviceDescriptionTypeImpl<WebservicesType<T>>(this, "", childNode);
      }
      return webserviceDescription;
   }


}