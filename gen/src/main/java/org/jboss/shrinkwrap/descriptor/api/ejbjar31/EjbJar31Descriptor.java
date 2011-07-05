package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.*;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.*;
import org.jboss.shrinkwrap.descriptor.api.jsp22.*;
import org.jboss.shrinkwrap.descriptor.api.application6.*;
import org.jboss.shrinkwrap.descriptor.api.webapp30.*;
import org.jboss.shrinkwrap.descriptor.api.persistence20.*;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.*;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.*;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 */
public interface EjbJar31Descriptor extends Descriptor, DescriptorNamespace<EjbJar31Descriptor>
{

   public EjbJar31Descriptor setDescription(String description);
   public EjbJar31Descriptor setDescriptionList(String ... values);
   public EjbJar31Descriptor removeAllDescription();

   public List<String> getDescriptionList();


   public EjbJar31Descriptor setDisplayName(String displayName);
   public EjbJar31Descriptor setDisplayNameList(String ... values);
   public EjbJar31Descriptor removeAllDisplayName();

   public List<String> getDisplayNameList();


   public EjbJar31Descriptor removeAllIcon();

   public IconType<EjbJar31Descriptor> icon();
   public List<IconType<EjbJar31Descriptor>> getIconList();



   public EjbJar31Descriptor setModuleName(String moduleName);
   public EjbJar31Descriptor removeModuleName();

   public String getModuleName();


   public EjbJar31Descriptor removeEnterpriseBeans();

   public EnterpriseBeansType<EjbJar31Descriptor> enterpriseBeans();



   public EjbJar31Descriptor removeInterceptors();

   public InterceptorsType<EjbJar31Descriptor> interceptors();



   public EjbJar31Descriptor removeRelationships();

   public RelationshipsType<EjbJar31Descriptor> relationships();



   public EjbJar31Descriptor removeAssemblyDescriptor();

   public AssemblyDescriptorType<EjbJar31Descriptor> assemblyDescriptor();



   public EjbJar31Descriptor setEjbClientJar(String ejbClientJar);
   public EjbJar31Descriptor removeEjbClientJar();

   public String getEjbClientJar();


   public EjbJar31Descriptor setVersion(String version);
   public EjbJar31Descriptor removeVersion();

   public String getVersion();


   public EjbJar31Descriptor setMetadataComplete(Boolean metadataComplete);
   public EjbJar31Descriptor removeMetadataComplete();

   public Boolean isMetadataComplete();

}
