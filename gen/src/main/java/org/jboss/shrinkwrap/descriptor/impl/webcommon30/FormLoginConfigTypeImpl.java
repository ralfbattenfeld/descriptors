package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FormLoginConfigType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class is a generated class.
 * Generation date :2011-06-12T08:56:23.309+02:00
 */
public class FormLoginConfigTypeImpl<T> implements Child<T>, FormLoginConfigType<T>
{
   public final static String nodeName = "form-login-config";

   // -------------------------------------------------------------------------------------||
   // Instance Members --------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node node;
   private Node childNode;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String formLoginPage;
   // maxOccurs = -   // isGeneric = true   // isAttribute = false
   private String formErrorPage;

   // -------------------------------------------------------------------------------------||
   // Constructor -------------------------------------------------------------------------||
   // -------------------------------------------------------------------------------------||

   public FormLoginConfigTypeImpl(T t, String descriptorName, Node node)   {
      this.t = t;
      this.node = node;
      this.childNode = node.create(nodeName);
   }

   public FormLoginConfigTypeImpl(T t, String descriptorName, Node node, Node childNode)   {
      this.t = t;
      this.node = node;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public FormLoginConfigType<T> setFormLoginPage(String formLoginPage)   {
      this.formLoginPage = formLoginPage;
      childNode.getOrCreate("form-login-page").text(formLoginPage);
      return this;
   }

   public String getFormLoginPage()
   {
      return childNode.textValue("form-login-page");
   }


   // maxOccurs = -   // isGeneric = true   // isAttribute = false

   public FormLoginConfigType<T> setFormErrorPage(String formErrorPage)   {
      this.formErrorPage = formErrorPage;
      childNode.getOrCreate("form-error-page").text(formErrorPage);
      return this;
   }

   public String getFormErrorPage()
   {
      return childNode.textValue("form-error-page");
   }

}
