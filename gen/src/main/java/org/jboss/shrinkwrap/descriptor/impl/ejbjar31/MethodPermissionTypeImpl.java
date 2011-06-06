package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodPermissionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-06T19:59:35.573+02:00
 */
public class MethodPermissionTypeImpl<T> implements Child<T>, MethodPermissionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   private String description;
   private MethodType<MethodPermissionType<T>> method;
   private String roleName;
   private Boolean unchecked;



   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public MethodPermissionTypeImpl(T t, String descriptorName, Node node)
   {
      this.t = t;
      this.node = node;
      this.childNode = node.create("method-permission");   }


   public T up()
   {
      return t;
   }



   public MethodPermissionType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   public String getDescription()
   {
      return description;
   }



   public MethodPermissionType<T> setMethod(MethodType<MethodPermissionType<T>> method)
   {
      childNode.create("method").text(method);
      return this;
   }

   public MethodType<MethodPermissionType<T>> getMethod()
   {
      if( method == null)
      {
          method = new MethodTypeImpl<MethodPermissionType<T>>(this, "", childNode);
      }
      return method;
   }




   public MethodPermissionType<T> setRoleName(String roleName)
   {
      childNode.create("role-name").text(roleName);
      return this;
   }

   public String getRoleName()
   {
      return roleName;
   }



   public MethodPermissionType<T> setUnchecked(Boolean unchecked)
   {
      this.unchecked = unchecked;
      childNode.getOrCreate("unchecked").text(unchecked);
      return this;
   }

   public Boolean getUnchecked()
   {
      return unchecked;
   }

}
