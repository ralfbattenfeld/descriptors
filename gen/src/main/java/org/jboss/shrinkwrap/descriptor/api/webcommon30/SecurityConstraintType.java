package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-19T21:45:00.466-04:00
 */
public interface SecurityConstraintType<T> extends Child<T>
{

   public SecurityConstraintType<T> setDisplayName(String displayName);

   public SecurityConstraintType<T> setDisplayNameList(String... values);

   public SecurityConstraintType<T> removeAllDisplayName();

   public List<String> getDisplayNameList();

   public SecurityConstraintType<T> removeAllWebResourceCollection();

   public WebResourceCollectionType<SecurityConstraintType<T>> webResourceCollection();

   public List<WebResourceCollectionType<SecurityConstraintType<T>>> getWebResourceCollectionList();

   public SecurityConstraintType<T> removeAuthConstraint();

   public AuthConstraintType<SecurityConstraintType<T>> authConstraint();

   public SecurityConstraintType<T> removeUserDataConstraint();

   public UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint();

}
