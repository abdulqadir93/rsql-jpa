/*
 * Copyright (c) 2011 Jakub Jirutka <jakub@jirutka.cz>
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE.  See the  GNU Lesser General Public License for
 * more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cz.jirutka.rsql.hibernate;

/**
 * Indicate that number of JOINs limit was exceeded.
 *
 * @author Jakub Jirutka <jakub@jirutka.cz>
 */
public class AssociationsLimitException extends RuntimeException {
   
    /**
     * Construct a <tt>AssociationsLimitException</tt> with specified joins limit.
     * 
     * @param joinsLimit 
     */
    public AssociationsLimitException(int joinsLimit) {
        super("Joins limit (" + joinsLimit + ") exceeded");
    }
}