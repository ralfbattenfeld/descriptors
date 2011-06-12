package org.jboss.shrinkwrap.descriptor.impl.jsp22; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspConfigType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspPropertyGroupType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.TaglibType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class JspConfigTypeImpl<T> implements Child<T>, JspConfigType<T>
{
   public final static String nodeName = "jsp-config";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private TaglibType<JspConfigType<T>> taglib;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private JspPropertyGroupType<JspConfigType<T>> jspPropertyGroup;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public JspConfigTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public JspConfigTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public JspConfigType<T> setTaglib(TaglibType<JspConfigType<T>> taglib)
   {
      childNode.create("taglib").text(taglib);
      return this;
   }

   public TaglibType<JspConfigType<T>> getTaglib()
   {
      return new TaglibTypeImpl<JspConfigType<T>>(this, "", childNode);
   }

   public List<TaglibType<JspConfigType<T>>> getTaglibList()
   {
      List<TaglibType<JspConfigType<T>>> list = new ArrayList<TaglibType<JspConfigType<T>>>();
      List<Node> nodeList = childNode.get(TaglibTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         TaglibType<JspConfigType<T>>  type = new TaglibTypeImpl<JspConfigType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }



   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public JspConfigType<T> setJspPropertyGroup(JspPropertyGroupType<JspConfigType<T>> jspPropertyGroup)
   {
      childNode.create("jsp-property-group").text(jspPropertyGroup);
      return this;
   }

   public JspPropertyGroupType<JspConfigType<T>> getJspPropertyGroup()
   {
      return new JspPropertyGroupTypeImpl<JspConfigType<T>>(this, "", childNode);
   }

   public List<JspPropertyGroupType<JspConfigType<T>>> getJspPropertyGroupList()
   {
      List<JspPropertyGroupType<JspConfigType<T>>> list = new ArrayList<JspPropertyGroupType<JspConfigType<T>>>();
      List<Node> nodeList = childNode.get(JspPropertyGroupTypeImpl.nodeName);
      for(Node node: nodeList)
      {
         JspPropertyGroupType<JspConfigType<T>>  type = new JspPropertyGroupTypeImpl<JspConfigType<T>>(this, "", childNode, node);
         list.add(type);
      }
      return list;
   }


}
