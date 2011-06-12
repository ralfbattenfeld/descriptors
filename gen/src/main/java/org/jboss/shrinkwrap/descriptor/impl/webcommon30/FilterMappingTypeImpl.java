package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class FilterMappingTypeImpl<T> implements Child<T>, FilterMappingType<T>
{
   public final static String nodeName = "filter-mapping";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String filterName;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String dispatcher;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String urlPattern;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String servletName;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public FilterMappingTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public FilterMappingTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public FilterMappingType<T> setFilterName(String filterName)   {
      this.filterName = filterName;
      childNode.getOrCreate("filter-name").text(filterName);
      return this;
   }

   public String getFilterName()
   {
      return childNode.textValue("filter-name");
   }


   // maxOccurs = -5   // isGeneric = true   // isAttribute = false

   public FilterMappingType<T> setDispatcher(String dispatcher)   {
      this.dispatcher = dispatcher;
      childNode.getOrCreate("dispatcher").text(dispatcher);
      return this;
   }

   public String getDispatcher()
   {
      return childNode.textValue("dispatcher");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public FilterMappingType<T> setUrlPattern(String urlPattern)   {
      this.urlPattern = urlPattern;
      childNode.getOrCreate("url-pattern").text(urlPattern);
      return this;
   }

   public String getUrlPattern()
   {
      return childNode.textValue("url-pattern");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public FilterMappingType<T> setServletName(String servletName)   {
      this.servletName = servletName;
      childNode.getOrCreate("servlet-name").text(servletName);
      return this;
   }

   public String getServletName()
   {
      return childNode.textValue("servlet-name");
   }

}
