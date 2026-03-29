/*
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at https://www.bahmni.org/license/mplv2hd.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */

package org.openmrs.module.auditlog.dao;


import org.openmrs.module.auditlog.model.AuditLog;

import java.util.Date;
import java.util.List;

public interface AuditLogDao {
    List<AuditLog> getLogs(String username, String patientId, Date startDateTime, Integer lastAuditLogId, Boolean prev, Boolean defaultView);
    void saveAuditLog(AuditLog auditLog);
}
