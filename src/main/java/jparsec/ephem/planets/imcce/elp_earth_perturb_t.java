/*
 * This file is part of JPARSEC library.
 * 
 * (C) Copyright 2006-2015 by T. Alonso Albi - OAN (Spain).
 *  
 * Project Info:  http://conga.oan.es/~alonso/jparsec/jparsec.html
 * 
 * JPARSEC library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * JPARSEC library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package jparsec.ephem.planets.imcce;

// One ELP2000 term

/**
 * All the static data of the ELP2000 theory (part 1), in a
 * separate file for managability. The whole theory is applied. This is part 1
 * (from 2) of the data.
 * <p>
 * Library users can ignore this class.
 * <p>
 * <I><B>Reference</B></I>
 * <p>
 * ELP 2000-85: a semi-analytical lunar ephemeris adequate for historical times.
 * Chapront-Touze M., Chapront J. Astron. and Astrophys. 190, 342 (1988).
 *
 * @author T. Alonso Albi - OAN (Spain)
 * @since version 1.0
 */

final class elp_earth_perturb_t {
    static final Elp2000Set2 Lon[] = {
            new Elp2000Set2(new int[] { 1, -2, 0, 0, -1 }, new double[] { 180.00000, 0.00003, 0.040 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 0, 1 }, new double[] { 180.00000, 0.00002, 0.487 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 1, -1 }, new double[] { 180.00000, 0.00002, 0.087 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -2, -1 }, new double[] { 180.00000, 0.00001, 0.038 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -1, -1 }, new double[] { 180.00000, 0.00021, 0.075 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -1, 1 }, new double[] { 180.00000, 0.00002, 0.074 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 0, -1 }, new double[] { 180.00000, 0.00300, 18.613 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 0, 1 }, new double[] { 180.00000, 0.00015, 0.037 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 1, -1 }, new double[] { 180.00000, 0.00021, 0.076 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 1, 1 }, new double[] { 180.00000, 0.00002, 0.025 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 2, -1 }, new double[] { 180.00000, 0.00002, 0.038 }),
            new Elp2000Set2(new int[] { 1, 2, 0, -1, -1 }, new double[] { 180.00000, 0.00003, 0.088 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 0, -1 }, new double[] { 180.00000, 0.00004, 0.041 }),
            new Elp2000Set2(new int[] { 2, 0, 0, 0, -2 }, new double[] { 0.00000, 0.00004, 9.307 })
    };

    static final Elp2000Set2 Lat[] = {
            new Elp2000Set2(new int[] { 1, -2, 0, 0, 0 }, new double[] { 180.00000, 0.00012, 0.088 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 1, 0 }, new double[] { 180.00000, 0.00003, 0.530 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -1, -2 }, new double[] { 180.00000, 0.00001, 0.037 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -1, 0 }, new double[] { 180.00000, 0.00019, 8.847 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 0, -2 }, new double[] { 180.00000, 0.00014, 0.074 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 0, 0 }, new double[] { 0.00000, 0.00342, 0.075 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 1, 0 }, new double[] { 0.00000, 0.00018, 0.038 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 2, 0 }, new double[] { 0.00000, 0.00001, 0.025 }),
            new Elp2000Set2(new int[] { 1, 2, 0, -1, 0 }, new double[] { 0.00000, 0.00004, 0.040 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 0, 0 }, new double[] { 0.00000, 0.00002, 0.026 }),
            new Elp2000Set2(new int[] { 2, 0, 0, 0, -1 }, new double[] { 180.00000, 0.00009, 0.075 })
    };

    static final Elp2000Set2 Rad[] = {
            new Elp2000Set2(new int[] { 0, 0, 0, 0, 0 }, new double[] { 270.00000, 0.00004, 99999.999 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 0, -1 }, new double[] { 270.00000, 0.00004, 0.040 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 1, -1 }, new double[] { 270.00000, 0.00002, 0.087 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -1, -1 }, new double[] { 270.00000, 0.00019, 0.075 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -1, 1 }, new double[] { 90.00000, 0.00003, 0.074 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 1, -1 }, new double[] { 90.00000, 0.00019, 0.076 }),
            new Elp2000Set2(new int[] { 1, 2, 0, -1, -1 }, new double[] { 90.00000, 0.00002, 0.088 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 0, -1 }, new double[] { 90.00000, 0.00004, 0.041 })
    };
}
