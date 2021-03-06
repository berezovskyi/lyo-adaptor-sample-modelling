/*******************************************************************************
 * Copyright (c) 2011, 2012 IBM Corporation and others.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *  
 *  The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *  and the Eclipse Distribution License is available at
 *  http://www.eclipse.org/org/documents/edl-v10.php.
 *  
 *  Contributors:
 *  
 *	   Sam Padgett	       - initial API and implementation
 *     Michael Fiedler     - adapted for OSLC4J
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *     Matthieu Helleboid   - Support for multiple Service Providers.
 *     Anass Radouani       - Support for multiple Service Providers.
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/

package com.sample.testing;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.ServletContextEvent;
import java.util.List;

import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import com.sample.testing.servlet.ServiceProviderCatalogSingleton;
import com.sample.testing.ServiceProviderInfo;
import com.sample.testing.resources.Person;
import com.sample.testing.resources.Requirement;
import com.sample.testing.resources.TestCase;
import com.sample.testing.resources.TestScript;


// Start of user code imports
// End of user code

// Start of user code pre_class_code
// End of user code

public class TestingToolManager {

    // Start of user code class_attributes
    // End of user code
    
    
    // Start of user code class_methods
    // End of user code

    public static void contextInitializeServletListener(final ServletContextEvent servletContextEvent)
    {
        
        // Start of user code contextInitializeServletListener
        // TODO Implement code to establish connection to data backbone etc ...
        // End of user code
    }

    public static void contextDestroyServletListener(ServletContextEvent servletContextEvent) 
    {
        
        // Start of user code contextDestroyed
        // TODO Implement code to shutdown connections to data backbone etc...
        // End of user code
    }

    public static ServiceProviderInfo[] getServiceProviderInfos(HttpServletRequest httpServletRequest)
    {
        ServiceProviderInfo[] serviceProviderInfos = {};
        
        // Start of user code "ServiceProviderInfo[] getServiceProviderInfos(...)"
        // TODO Implement code to return the set of ServiceProviders
        // End of user code
        return serviceProviderInfos;
    }

    public static TestCase createTestCase(HttpServletRequest httpServletRequest, final TestCase aResource, final String serviceProviderId)
    {
        TestCase newResource = null;
        
        // Start of user code createTestCase
        // TODO Implement code to create a resource
        // End of user code
        return newResource;
    }


    public static TestCase getTestCase(HttpServletRequest httpServletRequest, final String serviceProviderId, final String testCaseId)
    {
        TestCase aResource = null;
        
        // Start of user code getTestCase
        // TODO Implement code to return a resource
        // End of user code
        return aResource;
    }




    public static String getETagFromTestCase(final TestCase aResource)
    {
        String eTag = null;
        // Start of user code getETagFromTestCase
        // TODO Implement code to return an ETag for a particular resource
        // End of user code
        return eTag;
    }

}
