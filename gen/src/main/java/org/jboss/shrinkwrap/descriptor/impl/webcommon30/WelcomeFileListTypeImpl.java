package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class WelcomeFileListTypeImpl<T> implements Child<T>, WelcomeFileListType<T>
{
   public final static String nodeName = "welcome-file-list";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String welcomeFile;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public WelcomeFileListTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public WelcomeFileListTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -unbounded   // isGeneric = true   // isAttribute = false

   public WelcomeFileListType<T> setWelcomeFile(String welcomeFile)
   {
      childNode.create("welcome-file").text(welcomeFile);
      return this;
   }

   public WelcomeFileListType<T> setWelcomeFile(String ... values)
   {
      for(String name: values)
      {
         setWelcomeFile(welcomeFile);
      }
         return this;
   }

   public List<String> getWelcomeFileList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("welcome-file");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

}
