/*******************************************************************************
 * Copyright (c) 2008, 2017 Obeo.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Obeo - initial API and implementation
 *******************************************************************************/
package org.obeonetwork.dsl.migration.tests;

import org.junit.Test;

public class EnvironmentMigrationTests extends MigrationTests {

	@Test
	public void testField2Literal() {
		testMigration("field2literal");
	}

	@Override
	protected String getRootFolder() {
		return "models/environment";
	}

	@Override
	protected String getModelFileExtension() {
		return "environment";
	}
	
}
