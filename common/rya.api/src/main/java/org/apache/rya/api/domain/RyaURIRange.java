package org.apache.rya.api.domain;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */



/**
 * Date: 7/17/12
 * Time: 9:59 AM
 */
public class RyaURIRange extends RyaURI implements RyaRange {
    public static final RyaURI LAST_URI = new RyaURI(((char) 255) + ":#" + ((char) 255));

    private RyaURI start;
    private RyaURI stop;

    public RyaURIRange() {
        super();
    }

    public RyaURIRange(RyaURI start, RyaURI stop) {
        this.start = start;
        this.stop = stop;
    }

    public RyaURI getStart() {
        return start;
    }

    public void setStart(RyaURI start) {
        this.start = start;
    }

    public RyaURI getStop() {
        return stop;
    }

    public void setStop(RyaURI stop) {
        this.stop = stop;
    }

    @Override
    public String getData() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RyaURIRange");
        sb.append("{start=").append(start);
        sb.append(", stop=").append(stop);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        RyaURIRange that = (RyaURIRange) o;

        if (start != null ? !start.equals(that.start) : that.start != null) return false;
        if (stop != null ? !stop.equals(that.stop) : that.stop != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (start != null ? start.hashCode() : 0);
        result = 31 * result + (stop != null ? stop.hashCode() : 0);
        return result;
    }
}
