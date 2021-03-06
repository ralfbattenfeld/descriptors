package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainsType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12.ServiceRefHandlerChainTypeImpl;

public class ServiceRefHandlerChainsTypeImplTestCase
{   
   @Test
   public void testHandlerChain() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      ServiceRefHandlerChainsType<TestDescriptorImpl> type = new ServiceRefHandlerChainsTypeImpl<TestDescriptorImpl>(provider, "service-ref_handler-chainsType", provider.getRootNode());
      type.handlerChain().up();
      type.handlerChain().up();
      assertTrue(type.getHandlerChainList().size() == 2);
      type.removeAllHandlerChain();
      assertTrue(type.getHandlerChainList().size() == 0);
   }
}
