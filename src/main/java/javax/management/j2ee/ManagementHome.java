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
import javax.management.*;
import javax.ejb.*;

/**
 * The required home interface for the J2EE Management EJB component (MEJB).
 * A J2EE client must be able to create a compliant session object using the
 * specified create() method.
 *
 * @author Hans Hrasna
 */
public interface ManagementHome extends EJBHome {
    /**
     * Creates an MEJB session object which provides access to the J2EE Management Model
     *
     * @return An MEJB session object which implements <CODE>javax.management.j2ee.Management</CODE>
     *
     * @exception CreateExceotion Indicates a failure to create the EJB object
     * @exception RemoteException A communication exception occurred during the execution of a remote method call
     */
    Management create() throws CreateException, RemoteException;
}
