package org.jboss.shrinkwrap.descriptor.api.application6; 

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
 * The webType defines the web-uri and context-root of
 * a web application module.
 *
 *
 *
 */
public interface WebType<T> extends Child<T>
{

   public WebType<T> setWebUri(String webUri);
   public WebType<T> removeWebUri();

   public String getWebUri();



   public WebType<T> setContextRoot(String contextRoot);
   public WebType<T> removeContextRoot();

   public String getContextRoot();

}
