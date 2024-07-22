/*******************************************************************************
 * Copyright (c) 2011, 2020 Eurotech and/or its affiliates and others
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *  Eurotech
 *******************************************************************************/
package org.eclipse.kura.linux.net.dhcp;

public enum DhcpClientTool {
    NONE("none"),
    DHCLIENT("dhclient"),
    UDHCPC("udhcpc");

    private String toolName;

    private DhcpClientTool(String toolName) {
        this.toolName = toolName;
    }

    public String getValue() {
        return this.toolName;
    }
}
