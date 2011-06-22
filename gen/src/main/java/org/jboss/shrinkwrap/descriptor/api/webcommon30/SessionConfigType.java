package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This class is a generated class.
 * Generation date :2011-06-22T14:39:12.971-04:00
 *
 * Original Documentation:
 *
 *
 * The session-configType defines the session parameters
 * for this web application.
 *
 * Used in: web-app
 *
 *
 *
 */
public interface SessionConfigType<T> extends Child<T>
{

   public SessionConfigType<T> setSessionTimeout(Integer sessionTimeout);

   public SessionConfigType<T> removeSessionTimeout();

   public Integer getSessionTimeout();

   public SessionConfigType<T> removeCookieConfig();

   public CookieConfigType<SessionConfigType<T>> cookieConfig();

   public SessionConfigType<T> setTrackingMode(String trackingMode);

   public SessionConfigType<T> removeTrackingMode();

   public String getTrackingMode();

}
