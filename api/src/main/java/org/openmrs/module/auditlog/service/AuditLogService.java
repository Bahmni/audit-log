/*
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at https://www.bahmni.org/license/mplv2hd.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */

package org.openmrs.module.auditlog.service;

import java.util.Map;
import org.openmrs.module.auditlog.contract.AuditLogPayload;
import org.openmrs.module.webservices.rest.SimpleObject;

import java.util.ArrayList;
import java.util.Date;

public interface AuditLogService {
    ArrayList<SimpleObject> getLogs(String username, String patientId, Date startDateTime, Integer lastAuditLogId,
                                    Boolean prev, Boolean defaultView);

    void createAuditLog(AuditLogPayload log);
    void createAuditLog(String patientUuid, String eventType, String message, Map<String, String> messageParams, String module);
}
