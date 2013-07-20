/*******************************************************************************
 * Copyright (c) 2010, 2013 Sonatype, Inc.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Stuart McCulloch (Sonatype, Inc.) - initial API and implementation
 *******************************************************************************/
/**
 * Utilities to launch and test Sisu applications. 
 * <p><p>
 * For example test classes that scan, bind, and auto-wire the test classpath:
 * <pre>
 * &#064;Test
 * public class MyJUnit4orTestNGTest extends {@link org.eclipse.sisu.launch.InjectedTest} {
 *   // ...tests...
 * }
 * 
 * public class MyJUnit3TestCase extends {@link org.eclipse.sisu.launch.InjectedTestCase} {
 *   // ...tests...
 * }</pre>
 * 
 * A {@link org.eclipse.sisu.launch.Main} class that launches Sisu applications from the command-line:
 * <p><p>
 * <pre>
 * java -classpath javax.inject.jar:aopalliance.jar:guice-3.0.jar:org.eclipse.sisu.inject.jar:myapp.jar org.eclipse.sisu.launch.Main</pre> 
 * 
 * Extension {@link org.eclipse.sisu.launch.SisuExtensions strategies} for loading Modules, {@link org.eclipse.sisu.space.SpaceVisitor}s, and {@link org.eclipse.sisu.wire.Wiring} from {@code META-INF/services}.
 */
package org.eclipse.sisu.launch;

