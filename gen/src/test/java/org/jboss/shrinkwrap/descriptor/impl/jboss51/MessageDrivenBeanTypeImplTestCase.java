package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MessageDrivenBeanType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.ActivationConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.SecurityIdentityTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.MethodAttributesTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.SecurityIdentityTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.AnnotationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.IgnoreDependencyType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.IgnoreDependencyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.PoolConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JndiRefType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.JndiRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;

public class MessageDrivenBeanTypeImplTestCase
{   
   @Test
   public void testEjbName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setEjbName("test");
      assertEquals(type.getEjbName(), "test");
      type.removeEjbName();
      assertNull(type.getEjbName());
   }

   
   @Test
   public void testActivationConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.activationConfig().up();
      type.removeActivationConfig();
      assertNull(provider.getRootNode().getSingle("activation-config"));
   }

   
   @Test
   public void testDestinationJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setDestinationJndiName("test");
      assertEquals(type.getDestinationJndiName(), "test");
      type.removeDestinationJndiName();
      assertNull(type.getDestinationJndiName());
   }

   
   @Test
   public void testMdbUser() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setMdbUser("test");
      assertEquals(type.getMdbUser(), "test");
      type.removeMdbUser();
      assertNull(type.getMdbUser());
   }

   
   @Test
   public void testMdbPasswd() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setMdbPasswd("test");
      assertEquals(type.getMdbPasswd(), "test");
      type.removeMdbPasswd();
      assertNull(type.getMdbPasswd());
   }

   
   @Test
   public void testMdbClientId() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setMdbClientId("test");
      assertEquals(type.getMdbClientId(), "test");
      type.removeMdbClientId();
      assertNull(type.getMdbClientId());
   }

   
   @Test
   public void testMdbSubscriptionId() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setMdbSubscriptionId("test");
      assertEquals(type.getMdbSubscriptionId(), "test");
      type.removeMdbSubscriptionId();
      assertNull(type.getMdbSubscriptionId());
   }

   
   @Test
   public void testResourceAdapterName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setResourceAdapterName("test");
      assertEquals(type.getResourceAdapterName(), "test");
      type.removeResourceAdapterName();
      assertNull(type.getResourceAdapterName());
   }

   
   @Test
   public void testEjbRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.ejbRef().up();
      type.ejbRef().up();
      assertTrue(type.getEjbRefList().size() == 2);
      type.removeAllEjbRef();
      assertTrue(type.getEjbRefList().size() == 0);
   }

   
   @Test
   public void testEjbLocalRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.ejbLocalRef().up();
      type.ejbLocalRef().up();
      assertTrue(type.getEjbLocalRefList().size() == 2);
      type.removeAllEjbLocalRef();
      assertTrue(type.getEjbLocalRefList().size() == 0);
   }

   
   @Test
   public void testServiceRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.serviceRef().up();
      type.serviceRef().up();
      assertTrue(type.getServiceRefList().size() == 2);
      type.removeAllServiceRef();
      assertTrue(type.getServiceRefList().size() == 0);
   }

   
   @Test
   public void testResourceRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.resourceRef().up();
      type.resourceRef().up();
      assertTrue(type.getResourceRefList().size() == 2);
      type.removeAllResourceRef();
      assertTrue(type.getResourceRefList().size() == 0);
   }

   
   @Test
   public void testResourceEnvRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.resourceEnvRef().up();
      type.resourceEnvRef().up();
      assertTrue(type.getResourceEnvRefList().size() == 2);
      type.removeAllResourceEnvRef();
      assertTrue(type.getResourceEnvRefList().size() == 0);
   }

   
   @Test
   public void testMessageDestinationRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.messageDestinationRef().up();
      type.messageDestinationRef().up();
      assertTrue(type.getMessageDestinationRefList().size() == 2);
      type.removeAllMessageDestinationRef();
      assertTrue(type.getMessageDestinationRefList().size() == 0);
   }

   
   @Test
   public void testSecurityIdentity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.securityIdentity().up();
      type.removeSecurityIdentity();
      assertNull(provider.getRootNode().getSingle("security-identity"));
   }

   
   @Test
   public void testSecurityDomain() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setSecurityDomain("test");
      assertEquals(type.getSecurityDomain(), "test");
      type.removeSecurityDomain();
      assertNull(type.getSecurityDomain());
   }

   
   @Test
   public void testMethodAttributes() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.methodAttributes().up();
      type.removeMethodAttributes();
      assertNull(provider.getRootNode().getSingle("method-attributes"));
   }

   
   @Test
   public void testDepends() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setDepends("value1");
      type.setDepends("value2");
      type.setDependsList("value3", "value4");
      assertTrue(type.getDependsList().size() == 4);
      assertEquals(type.getDependsList().get(0), "value1");
      assertEquals(type.getDependsList().get(1), "value2");
      assertEquals(type.getDependsList().get(2), "value3");
      assertEquals(type.getDependsList().get(3), "value4");
      type.removeAllDepends();
      assertTrue(type.getDependsList().size() == 0);
   }

   
   @Test
   public void testEjbTimeoutIdentity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.ejbTimeoutIdentity().up();
      type.removeEjbTimeoutIdentity();
      assertNull(provider.getRootNode().getSingle("ejb-timeout-identity"));
   }

   
   @Test
   public void testAnnotation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.annotation().up();
      type.annotation().up();
      assertTrue(type.getAnnotationList().size() == 2);
      type.removeAllAnnotation();
      assertTrue(type.getAnnotationList().size() == 0);
   }

   
   @Test
   public void testIgnoreDependency() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.ignoreDependency().up();
      type.removeIgnoreDependency();
      assertNull(provider.getRootNode().getSingle("ignore-dependency"));
   }

   
   @Test
   public void testAopDomainName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setAopDomainName("test");
      assertEquals(type.getAopDomainName(), "test");
      type.removeAopDomainName();
      assertNull(type.getAopDomainName());
   }

   
   @Test
   public void testPoolConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.poolConfig().up();
      type.removePoolConfig();
      assertNull(provider.getRootNode().getSingle("pool-config"));
   }

   
   @Test
   public void testJndiRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.jndiRef().up();
      type.jndiRef().up();
      assertTrue(type.getJndiRefList().size() == 2);
      type.removeAllJndiRef();
      assertTrue(type.getJndiRefList().size() == 0);
   }

   
   @Test
   public void testCreateDestination() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      MessageDrivenBeanType<TestDescriptorImpl> type = new MessageDrivenBeanTypeImpl<TestDescriptorImpl>(provider, "message-driven-beanType", provider.getRootNode());
      type.setCreateDestination(true);
      assertTrue(type.isCreateDestination());
   }
}
