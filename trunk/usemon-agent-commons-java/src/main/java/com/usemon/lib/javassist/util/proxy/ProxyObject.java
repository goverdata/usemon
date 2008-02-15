/*
 * Javassist, a Java-bytecode translator toolkit.
 * Copyright (C) 1999-2007 Shigeru Chiba. All Rights Reserved.
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License.  Alternatively, the contents of this file may be used under
 * the terms of the GNU Lesser General Public License Version 2.1 or later.
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 */
package com.usemon.lib.javassist.util.proxy;

/**
 * The interface implemented by proxy classes.
 *
 * @see ProxyFactory
 */
public interface ProxyObject {
    /**
     * Sets a handler.  It can be used for changing handlers
     * during runtime.
     */
    void setHandler(MethodHandler mi);
}
