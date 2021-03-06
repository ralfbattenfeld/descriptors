package org.jboss.shrinkwrap.descriptor.impl.ejbjar30;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EjbJarType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * The ejb-jarType defines the root element of the EJB
 * deployment descriptor. It contains
 *
 * - an optional description of the ejb-jar file
 * - an optional display name
 * - an optional icon that contains a small and a large
 * icon file name
 * - structural information about all included
 * enterprise beans that is not specified through
 * annotations
 * - structural information about interceptor classes
 * - a descriptor for container managed relationships,
 * if any.
 * - an optional application-assembly descriptor
 * - an optional name of an ejb-client-jar file for the
 * ejb-jar.
 *
 *
 *
 */
public class EjbJarTypeImpl<T> implements Child<T>, EjbJarType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node node;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public EjbJarTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public EjbJarTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbJarType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public EjbJarType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public EjbJarType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : display-name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbJarType<T> setDisplayName(String displayName)
   {
      childNode.create("display-name").text(displayName);
      return this;
   }

   public EjbJarType<T> setDisplayNameList(String... values)
   {
      for (String name : values)
      {
         setDisplayName(name);
      }
      return this;
   }

   public EjbJarType<T> removeAllDisplayName()
   {
      childNode.remove("display-name");
      return this;
   }

   public List<String> getDisplayNameList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : icon
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbJarType<T> removeAllIcon()
   {
      childNode.remove("icon");
      return this;
   }

   public IconType<EjbJarType<T>> icon()
   {
      return new IconTypeImpl<EjbJarType<T>>(this, "icon", childNode);
   }

   public List<IconType<EjbJarType<T>>> getIconList()
   {
      List<IconType<EjbJarType<T>>> list = new ArrayList<IconType<EjbJarType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for (Node node : nodeList)
      {
         IconType<EjbJarType<T>> type = new IconTypeImpl<EjbJarType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : enterprise-beans
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbJarType<T> removeEnterpriseBeans()
   {
      childNode.remove("enterprise-beans");
      return this;
   }

   public EnterpriseBeansType<EjbJarType<T>> enterpriseBeans()
   {
      Node node = childNode.getOrCreate("enterprise-beans");
      EnterpriseBeansType<EjbJarType<T>> enterpriseBeans = new EnterpriseBeansTypeImpl<EjbJarType<T>>(this,
            "enterprise-beans", childNode, node);
      return enterpriseBeans;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : interceptors
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbJarType<T> removeInterceptors()
   {
      childNode.remove("interceptors");
      return this;
   }

   public InterceptorsType<EjbJarType<T>> interceptors()
   {
      Node node = childNode.getOrCreate("interceptors");
      InterceptorsType<EjbJarType<T>> interceptors = new InterceptorsTypeImpl<EjbJarType<T>>(this, "interceptors",
            childNode, node);
      return interceptors;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : relationships
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbJarType<T> removeRelationships()
   {
      childNode.remove("relationships");
      return this;
   }

   public RelationshipsType<EjbJarType<T>> relationships()
   {
      Node node = childNode.getOrCreate("relationships");
      RelationshipsType<EjbJarType<T>> relationships = new RelationshipsTypeImpl<EjbJarType<T>>(this, "relationships",
            childNode, node);
      return relationships;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : assembly-descriptor
   // isComplexType: true   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbJarType<T> removeAssemblyDescriptor()
   {
      childNode.remove("assembly-descriptor");
      return this;
   }

   public AssemblyDescriptorType<EjbJarType<T>> assemblyDescriptor()
   {
      Node node = childNode.getOrCreate("assembly-descriptor");
      AssemblyDescriptorType<EjbJarType<T>> assemblyDescriptor = new AssemblyDescriptorTypeImpl<EjbJarType<T>>(this,
            "assembly-descriptor", childNode, node);
      return assemblyDescriptor;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb-client-jar
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EjbJarType<T> setEjbClientJar(String ejbClientJar)
   {
      childNode.getOrCreate("ejb-client-jar").text(ejbClientJar);
      return this;
   }

   public EjbJarType<T> removeEjbClientJar()
   {
      childNode.remove("ejb-client-jar");
      return this;
   }

   public String getEjbClientJar()
   {
      return childNode.textValue("ejb-client-jar");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : version
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public EjbJarType<T> setVersion(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   public EjbJarType<T> removeVersion()
   {
      childNode.attributes().remove("version");
      return this;
   }

   public String getVersion()
   {
      return childNode.attributes().get("version");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : metadata-complete
   // isComplexType: false   maxOccurs: -   isAttribute: true
   // -------------------------------------------------------------------------------------||
   public EjbJarType<T> setMetadataComplete(Boolean metadataComplete)
   {
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   public EjbJarType<T> removeMetadataComplete()
   {
      childNode.attributes().remove("metadata-complete");
      return this;
   }

   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(childNode.attribute("metadata-complete"));
   }

}
