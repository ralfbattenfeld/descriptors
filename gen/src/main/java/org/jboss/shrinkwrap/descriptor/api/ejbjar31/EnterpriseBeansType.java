package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-05T13:14:17.666+02:00
 */
public interface EnterpriseBeansType<T> extends Child<T>
{

   public EnterpriseBeansType<T> setSession(SessionBeanType<EnterpriseBeansType<T>> session);
   public SessionBeanType<EnterpriseBeansType<T>> getSession();



   public EnterpriseBeansType<T> setEntity(EntityBeanType<EnterpriseBeansType<T>> entity);
   public EntityBeanType<EnterpriseBeansType<T>> getEntity();



   public EnterpriseBeansType<T> setMessageDriven(MessageDrivenBeanType<EnterpriseBeansType<T>> messageDriven);
   public MessageDrivenBeanType<EnterpriseBeansType<T>> getMessageDriven();

}