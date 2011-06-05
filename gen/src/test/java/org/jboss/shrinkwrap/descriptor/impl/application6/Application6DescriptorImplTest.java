package org.jboss.shrinkwrap.descriptor.impl.application6;

import static org.jboss.shrinkwrap.descriptor.impl.spec.AssertXPath.assertXPath;
import junit.framework.Assert;

import org.jboss.shrinkwrap.descriptor.api.Descriptors;
import org.jboss.shrinkwrap.descriptor.api.application6.Application6Descriptor;
import org.junit.Test;

public class Application6DescriptorImplTest
{
   private String applicationName = "appName";

   private String description = "description";

   private String moduleName = "test.jar";

   private String contextRoot = "/";

   @Test
   public void shouldCreateDefaultName() throws Exception
   {
      Assert.assertEquals("application.xml", create().getDescriptorName());
   }

   @Test
   public void shouldBeAbleToSetName() throws Exception
   {
      Assert.assertEquals("test.xml", Descriptors.create(Application6Descriptor.class, "test.xml").getDescriptorName());
   }

   @Test
   public void shouldBeAbleToSetApplicationName() throws Exception
   {
      String desc = create().setApplicationName(applicationName).exportAsString();

      assertXPath(desc, "/application/application-name", applicationName);
   }


   // -------------------------------------------------------------------------------------||
   // Tests from the existing application dd unit test ------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   @Test
   public void shouldBeAbleToAddDescription() throws Exception
   {
      String desc = create()
                     .setDescription(moduleName)
                     .exportAsString();
      
      assertXPath(desc, "/application/description", moduleName);
   }

   @Test
   public void shouldBeAbleToAddDisplayName() throws Exception
   {
      String desc = create()
                     .setDisplayName(moduleName)
                     .exportAsString();
      
      assertXPath(desc, "/application/display-name", moduleName);
   }

   @Test
   public void shouldBeAbleToAddLibraryDirectory() throws Exception
   {
      String desc = create()
                     .setLibraryDirectory(moduleName)
                     .exportAsString();
      
      assertXPath(desc, "/application/library-directory", moduleName);
   }

   @Test
   public void shouldBeAbleToAddAEJBModule() throws Exception
   {
      String desc = create()
                     .getModule().setEjb(moduleName).up()
                     .exportAsString();
      
      assertXPath(desc, "/application/module/ejb", moduleName);
   }
   
   @Test
   public void shouldBeAbleToAddAConnectorModule() throws Exception
   {
      String desc = create()
                     .getModule().setConnector(moduleName).up()
                     .exportAsString();
      
      assertXPath(desc, "/application/module/connector", moduleName);
   }
   
   @Test
   public void shouldBeAbleToAddAJavaModule() throws Exception
   {
      String desc = create()
                     .getModule().setJava(moduleName).up()
                     .exportAsString();
      
      assertXPath(desc, "/application/module/java", moduleName);
   }
   
   @Test
   public void shouldBeAbleToAddAWebModule() throws Exception
   {
      String desc = create()
                     .getModule()
                        .getWeb()
                           .setWebUri(moduleName)
                           .setContextRoot(contextRoot).up().up()
                     .exportAsString();

      assertXPath(desc, "/application/module/web/web-uri", moduleName);
      assertXPath(desc, "/application/module/web/context-root", contextRoot);
   }

   @Test
   public void shouldBeAbleToAddASecurityRole() throws Exception
   {
      String desc = create()
                     .getSecurityRole().setRoleName(moduleName).up()
                     .exportAsString();

      assertXPath(desc, "/application/security-role/role-name", moduleName);
   }

   @Test
   public void shouldBeAbleToAddASecurityRoleWithDescription() throws Exception
   {
      String desc = create()
                     .getSecurityRole().setRoleName(moduleName).setDescription(description).up()
                     .exportAsString();

      assertXPath(desc, "/application/security-role/role-name", moduleName);
      assertXPath(desc, "/application/security-role/description", description);
   }

   // -------------------------------------------------------------------------------------||
   // Helper Methods ----------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||
   
   private Application6Descriptor<Application6DescriptorImpl> create()
   {
      return Descriptors.create(Application6Descriptor.class);
   }

}