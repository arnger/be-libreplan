/*
 * This file is part of NavalPlan
 *
 * Copyright (C) 2009-2010 Fundación para o Fomento da Calidade Industrial e
 *                         Desenvolvemento Tecnolóxico de Galicia
 * Copyright (C) 2010-2011 Igalia, S.L.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.navalplanner.web.orders;

import java.util.List;

import org.navalplanner.business.orders.entities.OrderElement;
import org.navalplanner.business.reports.dtos.WorkReportLineDTO;
import org.navalplanner.business.workingday.EffortDuration;

/**
 * @author Susana Montes Pedreira <smontes@wirelessgalicia.com>
 */
public interface IAssignedHoursToOrderElementModel{
    public List<WorkReportLineDTO> getWorkReportLines();

    public EffortDuration getTotalAssignedEffort();

    public EffortDuration getAssignedDirectEffortChildren();
    public void initOrderElement(OrderElement orderElement);

    public EffortDuration getEstimatedEffort();
    public int getProgressWork();

    public EffortDuration getAssignedDirectEffort();
}
