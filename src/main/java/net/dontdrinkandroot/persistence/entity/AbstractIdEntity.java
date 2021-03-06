/*
 * Copyright (C) 2012-2016 Philip Washington Sorst <philip@sorst.net>
 * and individual contributors as indicated
 * by the @authors tag.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.dontdrinkandroot.persistence.entity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * {@link AbstractEntity} that has a primary key which needs to be assigned manually.
 *
 * @param <K> Type of the primary key.
 * @author Philip Washington Sorst <philip@sorst.net>
 */
@MappedSuperclass
public abstract class AbstractIdEntity<K extends Serializable> extends AbstractEntity<K>
{
    @Id
    private K id;

    protected AbstractIdEntity()
    {
    }

    public AbstractIdEntity(final K id)
    {
        this.id = id;
    }

    @Override
    public K getId()
    {
        return this.id;
    }
}
