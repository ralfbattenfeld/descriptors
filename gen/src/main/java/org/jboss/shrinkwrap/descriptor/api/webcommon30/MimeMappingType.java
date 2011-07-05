package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

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
 * The mime-mappingType defines a mapping between an extension
 * and a mime type.
 *
 * Used in: web-app
 *
 *
 *
 */
public interface MimeMappingType<T> extends Child<T>
{

   public MimeMappingType<T> setExtension(String extension);
   public MimeMappingType<T> removeExtension();

   public String getExtension();



   public MimeMappingType<T> setMimeType(String mimeType);
   public MimeMappingType<T> removeMimeType();

   public String getMimeType();

}
