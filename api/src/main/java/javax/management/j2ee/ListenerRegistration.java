/*
 * Copyright (c) 1997, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package javax.management.j2ee;

import java.rmi.RemoteException;
import javax.management.NotificationListener;
import javax.management.NotificationFilter;
import javax.management.ObjectName;
import javax.management.InstanceNotFoundException;
import javax.management.ListenerNotFoundException;

/**
 * ListenerRegistration defines the methods which clients of the MEJB
 * use to add and remove event listeners. 
 *
 * @author Hans Hrasna
 */
public interface ListenerRegistration extends java.io.Serializable {

     /**
     * Add a listener to a registered managed object.
     *
     * @param name The name of the managed object on which the listener should be added.
     * @param listener The listener object which will handle the notifications emitted by the registered managed object.
     * @param filter The filter object. If filter is null, no filtering will be performed before handling notifications.
     * @param handback The context to be sent to the listener when a notification is emitted.
     *
     * @exception InstanceNotFoundException The managed object name provided does not match any of the registered managed objects.
     * @exception RemoteException A communication exception occurred during the execution of a remote method call
     * 
     *
     */
    void addNotificationListener(ObjectName name, NotificationListener listener, NotificationFilter filter, Object handback)
        throws InstanceNotFoundException, RemoteException;



    /**
     * Remove a listener from a registered managed object.
     *
     * @param name The name of the managed object on which the listener should be removed.
     * @param listener The listener object which will handle the notifications emitted by the registered managed object.
     * This method will remove all the information related to this listener.
     *
     * @exception InstanceNotFoundException The managed object name provided does not match any of the registered managed objects.
     * @exception ListenerNotFoundException The listener is not registered in the managed object.
     * @exception RemoteException A communication exception occurred during the execution of a remote method call
     * 
     * 
     */
    void removeNotificationListener(ObjectName name, NotificationListener listener)
        throws InstanceNotFoundException, ListenerNotFoundException, RemoteException;
}
