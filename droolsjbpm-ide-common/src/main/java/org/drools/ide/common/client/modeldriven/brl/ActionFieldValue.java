/*
 * Copyright 2010 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.ide.common.client.modeldriven.brl;

import org.drools.ide.common.client.modeldriven.FieldNature;

/**
 * Holds field and value for "action" parts of the rule.
 */
public class ActionFieldValue
    implements
    PortableObject,
    FieldNature {

    public String field;
    public String value;
    public long   nature;
    /**
     * This is the datatype archectype (eg String, Numeric etc).
     */
    public String type;

    public ActionFieldValue(final String field,
                            final String value,
                            final String type) {
        this.field = field;
        this.value = value;
        this.type = type;
    }

    public ActionFieldValue() {
    }

    /*
     * (non-Javadoc)
     * @see org.drools.ide.common.client.modeldriven.brl.FieldNature#isFormula()
     */
    public boolean isFormula() {
        return this.value != null && this.value.trim().startsWith( "=" );
    }

    /*
     * (non-Javadoc)
     * @see org.drools.ide.common.client.modeldriven.brl.FieldNature#getField()
     */
    public String getField() {
        return field;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.drools.ide.common.client.modeldriven.brl.FieldNature#setField(java
     * .lang.String)
     */
    public void setField(String field) {
        this.field = field;
    }

    /*
     * (non-Javadoc)
     * @see org.drools.ide.common.client.modeldriven.brl.FieldNature#getValue()
     */
    public String getValue() {
        return value;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.drools.ide.common.client.modeldriven.brl.FieldNature#setValue(java
     * .lang.String)
     */
    public void setValue(String value) {
        this.value = value;
    }

    /*
     * (non-Javadoc)
     * @see org.drools.ide.common.client.modeldriven.brl.FieldNature#getNature()
     */
    public long getNature() {
        return nature;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.drools.ide.common.client.modeldriven.brl.FieldNature#setNature(long)
     */
    public void setNature(long nature) {
        this.nature = nature;
    }

    /*
     * (non-Javadoc)
     * @see org.drools.ide.common.client.modeldriven.brl.FieldNature#getType()
     */
    public String getType() {
        return type;
    }

    /*
     * (non-Javadoc)
     * @see
     * org.drools.ide.common.client.modeldriven.brl.FieldNature#setType(java
     * .lang.String)
     */
    public void setType(String type) {
        this.type = type;
    }

}
