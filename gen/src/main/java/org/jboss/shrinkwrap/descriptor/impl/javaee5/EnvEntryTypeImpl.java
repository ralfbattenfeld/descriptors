package org.jboss.shrinkwrap.descriptor.impl.javaee5;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EnvEntryTypeValuesType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 *
 *
 * The env-entryType is used to declare an application's
 * environment entry. The declaration consists of an optional
 * description, the name of the environment entry, a type
 * (optional if the value is injected, otherwise required), and
 * an optional value.
 *
 * It also includes optional elements to define injection of
 * the named resource into fields or JavaBeans properties.
 *
 * If a value is not specified and injection is requested,
 * no injection will occur and no entry of the specified name
 * will be created. This allows an initial value to be
 * specified in the source code without being incorrectly
 * changed when no override has been specified.
 *
 * If a value is not specified and no injection is requested,
 * a value must be supplied during deployment.
 *
 * This type is used by env-entry elements.
 *
 *
 *
 */
public class EnvEntryTypeImpl<T> implements Child<T>, EnvEntryType<T>
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

   public EnvEntryTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public EnvEntryTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnvEntryType<T> setMappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   public EnvEntryType<T> removeMappedName()
   {
      childNode.remove("mapped-name");
      return this;
   }

   public String getMappedName()
   {
      return childNode.textValue("mapped-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnvEntryType<T> removeAllInjectionTarget()
   {
      childNode.remove("injection-target");
      return this;
   }

   public InjectionTargetType<EnvEntryType<T>> injectionTarget()
   {
      return new InjectionTargetTypeImpl<EnvEntryType<T>>(this, "injection-target", childNode);
   }

   public List<InjectionTargetType<EnvEntryType<T>>> getInjectionTargetList()
   {
      List<InjectionTargetType<EnvEntryType<T>>> list = new ArrayList<InjectionTargetType<EnvEntryType<T>>>();
      List<Node> nodeList = childNode.get("injection-target");
      for (Node node : nodeList)
      {
         InjectionTargetType<EnvEntryType<T>> type = new InjectionTargetTypeImpl<EnvEntryType<T>>(this,
               "injection-target", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnvEntryType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public EnvEntryType<T> setDescriptionList(String... values)
   {
      for (String name : values)
      {
         setDescription(name);
      }
      return this;
   }

   public EnvEntryType<T> removeAllDescription()
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
   // Element type : env-entry-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnvEntryType<T> setEnvEntryName(String envEntryName)
   {
      childNode.getOrCreate("env-entry-name").text(envEntryName);
      return this;
   }

   public EnvEntryType<T> removeEnvEntryName()
   {
      childNode.remove("env-entry-name");
      return this;
   }

   public String getEnvEntryName()
   {
      return childNode.textValue("env-entry-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnvEntryType<T> setEnvEntryType(EnvEntryTypeValuesType envEntryType)
   {
      childNode.getOrCreate("env-entry-type").text(envEntryType);
      return this;
   }

   public EnvEntryType<T> setEnvEntryType(String envEntryType)
   {
      childNode.getOrCreate("env-entry-type").text(envEntryType);
      return this;
   }

   public EnvEntryTypeValuesType getEnvEntryType()
   {
      return EnvEntryTypeValuesType.getFromStringValue(childNode.textValue("env-entry-type"));
   }

   public String getEnvEntryTypeAsString()
   {
      return childNode.textValue("env-entry-type");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : env-entry-value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnvEntryType<T> setEnvEntryValue(String envEntryValue)
   {
      childNode.getOrCreate("env-entry-value").text(envEntryValue);
      return this;
   }

   public EnvEntryType<T> removeEnvEntryValue()
   {
      childNode.remove("env-entry-value");
      return this;
   }

   public String getEnvEntryValue()
   {
      return childNode.textValue("env-entry-value");
   }

}
