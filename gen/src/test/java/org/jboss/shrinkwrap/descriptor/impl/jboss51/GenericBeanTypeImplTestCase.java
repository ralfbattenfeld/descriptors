package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.GenericBeanType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jboss51.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.SecurityIdentityTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.MethodAttributesType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.MethodAttributesTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.AnnotationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.IgnoreDependencyType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.IgnoreDependencyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PoolConfigType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.PoolConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.JndiRefType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.JndiRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jboss51.PortComponentType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.PortComponentTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jbosscommon51.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.jbosscommon51.ServiceRefTypeImpl;

public class GenericBeanTypeImplTestCase
{   
   @Test
   public void testEjbName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.setEjbName("test");
      assertEquals(type.getEjbName(), "test");
      type.removeEjbName();
      assertNull(type.getEjbName());
   }

   
   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }

   
   @Test
   public void testSecurityIdentity() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.securityIdentity().up();
      type.removeSecurityIdentity();
      assertNull(provider.getRootNode().getSingle("security-identity"));
   }

   
   @Test
   public void testJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.setJndiName("test");
      assertEquals(type.getJndiName(), "test");
      type.removeJndiName();
      assertNull(type.getJndiName());
   }

   
   @Test
   public void testHomeJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.setHomeJndiName("test");
      assertEquals(type.getHomeJndiName(), "test");
      type.removeHomeJndiName();
      assertNull(type.getHomeJndiName());
   }

   
   @Test
   public void testLocalJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.setLocalJndiName("test");
      assertEquals(type.getLocalJndiName(), "test");
      type.removeLocalJndiName();
      assertNull(type.getLocalJndiName());
   }

   
   @Test
   public void testLocalHomeJndiName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.setLocalHomeJndiName("test");
      assertEquals(type.getLocalHomeJndiName(), "test");
      type.removeLocalHomeJndiName();
      assertNull(type.getLocalHomeJndiName());
   }

   
   @Test
   public void testJndiBindingPolicy() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.setJndiBindingPolicy("test");
      assertEquals(type.getJndiBindingPolicy(), "test");
      type.removeJndiBindingPolicy();
      assertNull(type.getJndiBindingPolicy());
   }

   
   @Test
   public void testSecurityDomain() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.setSecurityDomain("test");
      assertEquals(type.getSecurityDomain(), "test");
      type.removeSecurityDomain();
      assertNull(type.getSecurityDomain());
   }

   
   @Test
   public void testMethodAttributes() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.methodAttributes().up();
      type.removeMethodAttributes();
      assertNull(provider.getRootNode().getSingle("method-attributes"));
   }

   
   @Test
   public void testDepends() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
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
   public void testAnnotation() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
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
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.ignoreDependency().up();
      type.removeIgnoreDependency();
      assertNull(provider.getRootNode().getSingle("ignore-dependency"));
   }

   
   @Test
   public void testAopDomainName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.setAopDomainName("test");
      assertEquals(type.getAopDomainName(), "test");
      type.removeAopDomainName();
      assertNull(type.getAopDomainName());
   }

   
   @Test
   public void testPoolConfig() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.poolConfig().up();
      type.removePoolConfig();
      assertNull(provider.getRootNode().getSingle("pool-config"));
   }

   
   @Test
   public void testJndiRef() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.jndiRef().up();
      type.jndiRef().up();
      assertTrue(type.getJndiRefList().size() == 2);
      type.removeAllJndiRef();
      assertTrue(type.getJndiRefList().size() == 0);
   }

   
   @Test
   public void testPortComponent() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      GenericBeanType<TestDescriptorImpl> type = new GenericBeanTypeImpl<TestDescriptorImpl>(provider, "generic-beanType", provider.getRootNode());
      type.portComponent().up();
      type.removePortComponent();
      assertNull(provider.getRootNode().getSingle("port-component"));
   }
}
