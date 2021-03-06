package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ConsumerBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.GenericBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ServiceBeanType;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SessionBeanType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-07-09T17:18:33.236+02:00
 *
 * Original Documentation:
 * The enterprise-beans element contains additional information about the
 * beans. These informations, such as jndi names, resource managers and container
 * configurations, are specific to jboss and not described in ejb-jar.xml. jboss will provide a
 * standard behaviour if no enterprise-beans element is found, see container-configurations,
 * jndi-name and resource-managers for defaults. Used in: jboss
 *
 */
public class EnterpriseBeansTypeImpl<T> implements Child<T>, EnterpriseBeansType<T>
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

   public EnterpriseBeansTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public EnterpriseBeansTypeImpl(T t, String nodeName, Node node, Node childNode)
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
   // Element type : session
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnterpriseBeansType<T> removeAllSession()
   {
      childNode.remove("session");
      return this;
   }

   public SessionBeanType<EnterpriseBeansType<T>> session()
   {
      return new SessionBeanTypeImpl<EnterpriseBeansType<T>>(this, "session", childNode);
   }

   public List<SessionBeanType<EnterpriseBeansType<T>>> getSessionList()
   {
      List<SessionBeanType<EnterpriseBeansType<T>>> list = new ArrayList<SessionBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("session");
      for (Node node : nodeList)
      {
         SessionBeanType<EnterpriseBeansType<T>> type = new SessionBeanTypeImpl<EnterpriseBeansType<T>>(this,
               "session", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : message-driven
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnterpriseBeansType<T> removeAllMessageDriven()
   {
      childNode.remove("message-driven");
      return this;
   }

   public MessageDrivenBeanType<EnterpriseBeansType<T>> messageDriven()
   {
      return new MessageDrivenBeanTypeImpl<EnterpriseBeansType<T>>(this, "message-driven", childNode);
   }

   public List<MessageDrivenBeanType<EnterpriseBeansType<T>>> getMessageDrivenList()
   {
      List<MessageDrivenBeanType<EnterpriseBeansType<T>>> list = new ArrayList<MessageDrivenBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("message-driven");
      for (Node node : nodeList)
      {
         MessageDrivenBeanType<EnterpriseBeansType<T>> type = new MessageDrivenBeanTypeImpl<EnterpriseBeansType<T>>(
               this, "message-driven", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : service
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnterpriseBeansType<T> removeAllService()
   {
      childNode.remove("service");
      return this;
   }

   public ServiceBeanType<EnterpriseBeansType<T>> service()
   {
      return new ServiceBeanTypeImpl<EnterpriseBeansType<T>>(this, "service", childNode);
   }

   public List<ServiceBeanType<EnterpriseBeansType<T>>> getServiceList()
   {
      List<ServiceBeanType<EnterpriseBeansType<T>>> list = new ArrayList<ServiceBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("service");
      for (Node node : nodeList)
      {
         ServiceBeanType<EnterpriseBeansType<T>> type = new ServiceBeanTypeImpl<EnterpriseBeansType<T>>(this,
               "service", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : consumer
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnterpriseBeansType<T> removeAllConsumer()
   {
      childNode.remove("consumer");
      return this;
   }

   public ConsumerBeanType<EnterpriseBeansType<T>> consumer()
   {
      return new ConsumerBeanTypeImpl<EnterpriseBeansType<T>>(this, "consumer", childNode);
   }

   public List<ConsumerBeanType<EnterpriseBeansType<T>>> getConsumerList()
   {
      List<ConsumerBeanType<EnterpriseBeansType<T>>> list = new ArrayList<ConsumerBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("consumer");
      for (Node node : nodeList)
      {
         ConsumerBeanType<EnterpriseBeansType<T>> type = new ConsumerBeanTypeImpl<EnterpriseBeansType<T>>(this,
               "consumer", childNode, node);
         list.add(type);
      }
      return list;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : ejb
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||
   public EnterpriseBeansType<T> removeAllEjb()
   {
      childNode.remove("ejb");
      return this;
   }

   public GenericBeanType<EnterpriseBeansType<T>> ejb()
   {
      return new GenericBeanTypeImpl<EnterpriseBeansType<T>>(this, "ejb", childNode);
   }

   public List<GenericBeanType<EnterpriseBeansType<T>>> getEjbList()
   {
      List<GenericBeanType<EnterpriseBeansType<T>>> list = new ArrayList<GenericBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("ejb");
      for (Node node : nodeList)
      {
         GenericBeanType<EnterpriseBeansType<T>> type = new GenericBeanTypeImpl<EnterpriseBeansType<T>>(this, "ejb",
               childNode, node);
         list.add(type);
      }
      return list;
   }

}
