package org.jboss.shrinkwrap.descriptor.api.jsp22; 

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
 *
 * The jsp-configType is used to provide global configuration
 * information for the JSP files in a web application. It has
 * two subelements, taglib and jsp-property-group.
 *
 *
 *
 */
public interface JspConfigType<T> extends Child<T>
{

   public JspConfigType<T> removeAllTaglib();

   public TaglibType<JspConfigType<T>> taglib();
   public List<TaglibType<JspConfigType<T>>> getTaglibList();




   public JspConfigType<T> removeAllJspPropertyGroup();

   public JspPropertyGroupType<JspConfigType<T>> jspPropertyGroup();
   public List<JspPropertyGroupType<JspConfigType<T>>> getJspPropertyGroupList();


}
