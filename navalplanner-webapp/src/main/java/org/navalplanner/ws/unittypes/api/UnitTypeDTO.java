/*
 * This file is part of NavalPlan
 *
 * Copyright (C) 2009 Fundación para o Fomento da Calidade Industrial e
 *                    Desenvolvemento Tecnolóxico de Galicia
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

package org.navalplanner.ws.unittypes.api;

import javax.xml.bind.annotation.XmlAttribute;

import org.navalplanner.ws.common.api.IntegrationEntityDTO;

/**
 * DTO for <code>UnitType</code> entity.
 * @author Susana Montes Pedreira <smontes@wirelessgalicia.com>
 */
public class UnitTypeDTO extends IntegrationEntityDTO {

    public final static String ENTITY_TYPE = "unit type";

    @XmlAttribute
    public String measure;

    public UnitTypeDTO() {
    }

    public UnitTypeDTO(String code, String measure) {
        super(code);
        this.measure = measure;
    }

    /**
     * This constructor automatically generates a unique code. It is intended to
     * facilitate the implementation of test cases that add new instances (such
     * instances will have a unique code).
     */
    public UnitTypeDTO(String measure) {
        this(generateCode(), measure);
    }

    @Override
    public String getEntityType() {
        return ENTITY_TYPE;
    }

}