/*******************************************************************************
 * Copyright (c) 2011 cnfree.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *  cnfree  - initial API and implementation
 *******************************************************************************/
package org.sf.feeling.swt.win32.extension.jna.exception;

/**
 * NativeException : this exception is thrown if something goes wrong in the
 * native side.
 */
public class NativeException extends Exception
{

	private static final long serialVersionUID = -386641562909984650L;

	public NativeException( String message )
	{
		super( message );
	}
}
