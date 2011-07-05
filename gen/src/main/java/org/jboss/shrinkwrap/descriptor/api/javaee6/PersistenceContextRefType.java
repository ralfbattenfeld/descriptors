package org.jboss.shrinkwrap.descriptor.api.javaee6; 

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
/**
 * This class is a generated class.
 * Generation date :2011-07-05T19:45:07.621+02:00
 *
 * Original Documentation:
 *
 * [
 * The persistence-context-ref element contains a declaration
 * of Deployment Component's reference to a persistence context
 * associated within a Deployment Component's
 * environment. It consists of:
 *
 * - an optional description
 * - the persistence context reference name
 * - an optional persistence unit name. If not specified,
 * the default persistence unit is assumed.
 * - an optional specification as to whether
 * the persistence context type is Transaction or
 * Extended. If not specified, Transaction is assumed.
 * - an optional list of persistence properties
 * - optional injection targets
 *
 * Examples:
 *
 * <persistence-context-ref>
 * <persistence-context-ref-name>myPersistenceContext
 * </persistence-context-ref-name>
 * </persistence-context-ref>
 *
 * <persistence-context-ref>
 * <persistence-context-ref-name>myPersistenceContext
 * </persistence-context-ref-name>
 * <persistence-unit-name>PersistenceUnit1
 * </persistence-unit-name>
 * <persistence-context-type>Extended</persistence-context-type>
 * </persistence-context-ref>
 *
 *
 *
 *
 */
public interface PersistenceContextRefType<T> extends Child<T>
{

   public PersistenceContextRefType<T> setMappedName(String mappedName);
   public PersistenceContextRefType<T> removeMappedName();

   public String getMappedName();


   public PersistenceContextRefType<T> removeAllInjectionTarget();

   public InjectionTargetType<PersistenceContextRefType<T>> injectionTarget();
   public List<InjectionTargetType<PersistenceContextRefType<T>>> getInjectionTargetList();



   public PersistenceContextRefType<T> setDescription(String description);
   public PersistenceContextRefType<T> setDescriptionList(String ... values);
   public PersistenceContextRefType<T> removeAllDescription();

   public List<String> getDescriptionList();



   public PersistenceContextRefType<T> setPersistenceContextRefName(String persistenceContextRefName);
   public PersistenceContextRefType<T> removePersistenceContextRefName();

   public String getPersistenceContextRefName();



   public PersistenceContextRefType<T> setPersistenceUnitName(String persistenceUnitName);
   public PersistenceContextRefType<T> removePersistenceUnitName();

   public String getPersistenceUnitName();



   public PersistenceContextRefType<T> setPersistenceContextType(PersistenceContextTypeType persistenceContextType);
   public PersistenceContextRefType<T> setPersistenceContextType(String persistenceContextType);

   public PersistenceContextTypeType getPersistenceContextType();
   public String  getPersistenceContextTypeAsString();



   public PersistenceContextRefType<T> removeAllPersistenceProperty();

   public PropertyType<PersistenceContextRefType<T>> persistenceProperty();
   public List<PropertyType<PersistenceContextRefType<T>>> getPersistencePropertyList();


}
