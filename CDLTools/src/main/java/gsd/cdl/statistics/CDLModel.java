/*
 * Copyright (c) 2010 Thorsten Berger <berger@informatik.uni-leipzig.de>
 *
 * This file is part of CDLTools.
 *
 * CDLTools is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * CDLTools is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with CDLTools.  If not, see <http://www.gnu.org/licenses/>.
 */

package gsd.cdl.statistics;

import java.util.HashSet;
import java.util.Set;

public class CDLModel {

    public String target;
    public int nodes;
    public int none;
    public int bool;
    public int booldata;
    public int data;
    public int packages;
    public int components;
    public int options;
    public int interfaces;

    public Set<String> features = new HashSet<String>();

    public int userChangeable;
    public int derived;
    public int withChangeableDataValue;

    public int mandatory;

    public int nodesWithAIconstraints;
    public int nodesWithReqsConstraints;

    public int dataNodesWhichAreTests;

    public int featuresInCommonWithI386;

}