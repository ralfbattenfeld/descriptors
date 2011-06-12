package org.jboss.shrinkwrap.descriptor.api.application6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public interface ModuleType<T> extends Child<T>
{
   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ModuleType<T> setAltDd(String altDd);

   public String getAltDd();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ModuleType<T> setConnector(String connector);

   public String getConnector();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ModuleType<T> setEjb(String ejb);

   public String getEjb();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ModuleType<T> setJava(String java);

   public String getJava();


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

// otherwise;
   public ModuleType<T> setWeb(WebType<ModuleType<T>> web);

   public WebType<ModuleType<T>> getWeb();


}
