package org.jboss.shrinkwrap.descriptor.impl.jboss51; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ResourceManagersType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jboss51.ResourceManagerType;
import org.jboss.shrinkwrap.descriptor.impl.jboss51.ResourceManagerTypeImpl;

public class ResourceManagersTypeImplTestCase
{   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceManagersType<TestDescriptorImpl> type = new ResourceManagersTypeImpl<TestDescriptorImpl>(provider, "resource-managersType", provider.getRootNode());
      type.setDescription("value1");
      type.setDescription("value2");
      type.setDescriptionList("value3", "value4");
      assertTrue(type.getDescriptionList().size() == 4);
      assertEquals(type.getDescriptionList().get(0), "value1");
      assertEquals(type.getDescriptionList().get(1), "value2");
      assertEquals(type.getDescriptionList().get(2), "value3");
      assertEquals(type.getDescriptionList().get(3), "value4");
      type.removeAllDescription();
      assertTrue(type.getDescriptionList().size() == 0);
   }

   
   @Test
   public void testResourceManager() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ResourceManagersType<TestDescriptorImpl> type = new ResourceManagersTypeImpl<TestDescriptorImpl>(provider, "resource-managersType", provider.getRootNode());
      type.resourceManager().up();
      type.resourceManager().up();
      assertTrue(type.getResourceManagerList().size() == 2);
      type.removeAllResourceManager();
      assertTrue(type.getResourceManagerList().size() == 0);
   }
}
