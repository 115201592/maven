package org.apache.maven.utils;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import org.apiguardian.api.API;

import static org.apache.maven.utils.Precondition.isEmpty;
import static org.apiguardian.api.API.Status.INTERNAL;

/**
 * @author Karl Heinz Marbaise
 */
@API( status = INTERNAL, since = "3.7.0" )
public final class StringUtils
{
    public static final String EMPTY = "";
    public static final int INDEX_NOT_FOUND = -1;
    private StringUtils()
    {
        // intentionally empty.
    }

    /**
     * @param str The string.
     * @param separator The separator.
     * @return The substring.
     */
    public static String substringAfterLast( final String str, final String separator )
    {
        if ( isEmpty( str ) )
        {
            return str;
        }
        if ( isEmpty( separator ) )
        {
            return EMPTY;
        }
        final int pos = str.lastIndexOf( separator );
        if ( pos == INDEX_NOT_FOUND || pos == str.length() - separator.length() )
        {
            return EMPTY;
        }
        return str.substring( pos + separator.length() );
    }


}
