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
 * All the static data of the ELP2000 theory (part 1), in a separate file for manageability.
 * The whole theory is applied. This is part 1 (from 2) of the data.
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

final class elp_plan_perturb2_lat_t {
    static final Elp2000Set3 Lat_t[] = {
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, new double[] { 0.00000, 0.00007, 0.075 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1 }, new double[] { 0.00000, 0.00008, 5.997 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 }, new double[] { 0.00000, 0.00008, 0.037 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -1 }, new double[] { 0.00000, 0.00005, 0.076 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1 }, new double[] { 0.00000, 0.00003, 0.025 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, -4, -1 }, new double[] { 0.00000, 0.00002, 0.015 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, -3, -1 }, new double[] { 0.00000, 0.00019, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, -3, 1 }, new double[] { 0.00000, 0.00006, 0.039 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, -2, -1 }, new double[] { 0.00000, 0.00200, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, -2, 1 }, new double[] { 0.00000, 0.00076, 0.083 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -3 }, new double[] { 180.00000, 0.00002, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1 }, new double[] { 0.00000, 0.01696, 0.039 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 1 }, new double[] { 0.00000, 0.01419, 0.857 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 3 }, new double[] { 0.00000, 0.00002, 0.036 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1 }, new double[] { 0.00000, 0.01215, 0.081 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 }, new double[] { 0.00000, 0.01623, 0.069 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 3 }, new double[] { 180.00000, 0.00003, 0.024 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, -3 }, new double[] { 0.00000, 0.00002, 0.038 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, -1 }, new double[] { 0.00000, 0.01279, 1.200 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1 }, new double[] { 0.00000, 0.01338, 0.036 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 3 }, new double[] { 180.00000, 0.00002, 0.018 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, -1 }, new double[] { 0.00000, 0.00079, 0.071 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 1 }, new double[] { 0.00000, 0.00161, 0.024 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, -1 }, new double[] { 0.00000, 0.00006, 0.037 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 1 }, new double[] { 0.00000, 0.00016, 0.018 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 4, 1 }, new double[] { 0.00000, 0.00001, 0.015 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 2, -2, -1 }, new double[] { 0.00000, 0.00008, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 2, -2, 1 }, new double[] { 0.00000, 0.00003, 0.090 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 2, -1, -1 }, new double[] { 0.00000, 0.00057, 0.041 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 2, -1, 1 }, new double[] { 0.00000, 0.00048, 0.462 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, -1 }, new double[] { 0.00000, 0.00009, 0.088 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 1 }, new double[] { 0.00000, 0.00029, 0.065 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, -1 }, new double[] { 0.00000, 0.00031, 0.545 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 1 }, new double[] { 0.00000, 0.00028, 0.035 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, -1 }, new double[] { 0.00000, 0.00001, 0.066 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 1 }, new double[] { 0.00000, 0.00003, 0.024 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 3, -1, -1 }, new double[] { 0.00000, 0.00002, 0.042 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 3, -1, 1 }, new double[] { 0.00000, 0.00001, 0.316 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, -1 }, new double[] { 180.00000, 0.00001, 0.327 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, -2, 0, 1 }, new double[] { 180.00000, 0.00001, 0.042 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, -1, -1, -1 }, new double[] { 180.00000, 0.00003, 0.065 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, -1 }, new double[] { 0.00000, 0.00003, 0.487 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1 }, new double[] { 0.00000, 0.00005, 0.040 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, -1, 1, -1 }, new double[] { 0.00000, 0.00005, 0.089 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, -1, 1, 1 }, new double[] { 0.00000, 0.00002, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, -2, -1 }, new double[] { 180.00000, 0.00004, 0.038 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, -2, 1 }, new double[] { 180.00000, 0.00004, 3.575 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, -1, -1 }, new double[] { 180.00000, 0.00002, 0.075 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, -1, 1 }, new double[] { 0.00000, 0.00014, 0.074 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, -1 }, new double[] { 180.00000, 0.00202, 18.600 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1 }, new double[] { 180.00000, 0.00202, 0.037 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -1 }, new double[] { 180.00000, 0.00009, 0.076 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1 }, new double[] { 180.00000, 0.00026, 0.025 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 1 }, new double[] { 180.00000, 0.00003, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 2, 0, 1 }, new double[] { 0.00000, 0.00001, 0.036 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -4, 0, -1 }, new double[] { 180.00000, 0.00001, 0.137 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -3, -1, -1 }, new double[] { 180.00000, 0.00007, 0.202 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -3, -1, 1 }, new double[] { 180.00000, 0.00008, 0.046 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -3, 0, -1 }, new double[] { 180.00000, 0.00028, 0.120 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -3, 0, 1 }, new double[] { 180.00000, 0.00012, 0.028 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -3, 1, -1 }, new double[] { 180.00000, 0.00002, 0.046 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -3, 1, 1 }, new double[] { 180.00000, 0.00002, 0.021 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -2, -2, -1 }, new double[] { 180.00000, 0.00011, 0.058 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -2, -1, -1 }, new double[] { 180.00000, 0.00135, 0.254 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -2, -1, 1 }, new double[] { 180.00000, 0.00158, 0.044 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -2, 0, -3 }, new double[] { 180.00000, 0.00001, 0.057 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -2, 0, -1 }, new double[] { 180.00000, 0.00546, 0.107 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -2, 0, 1 }, new double[] { 180.00000, 0.00193, 0.028 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -2, 1, -1 }, new double[] { 180.00000, 0.00035, 0.044 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -2, 1, 1 }, new double[] { 180.00000, 0.00029, 0.020 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -2, 2, -1 }, new double[] { 180.00000, 0.00003, 0.028 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -2, 2, 1 }, new double[] { 180.00000, 0.00003, 0.016 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, -4, -1 }, new double[] { 180.00000, 0.00001, 0.023 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, -3, -1 }, new double[] { 180.00000, 0.00014, 0.034 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, -3, 1 }, new double[] { 180.00000, 0.00002, 0.384 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, -2, -1 }, new double[] { 180.00000, 0.00164, 0.062 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, -2, 1 }, new double[] { 0.00000, 0.00016, 0.094 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, -1, -3 }, new double[] { 180.00000, 0.00003, 0.034 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, -1, -1 }, new double[] { 180.00000, 0.01869, 0.340 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, -1, 1 }, new double[] { 180.00000, 0.02229, 0.042 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, -1, 3 }, new double[] { 0.00000, 0.00003, 0.020 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, 0, -3 }, new double[] { 180.00000, 0.00022, 0.060 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, 0, -1 }, new double[] { 180.00000, 0.07430, 0.097 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, 0, 1 }, new double[] { 180.00000, 0.01999, 0.027 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, 0, 3 }, new double[] { 0.00000, 0.00002, 0.016 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, 1, -3 }, new double[] { 0.00000, 0.00004, 0.305 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, 1, -1 }, new double[] { 180.00000, 0.00443, 0.042 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, 1, 1 }, new double[] { 180.00000, 0.00285, 0.020 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, 2, -1 }, new double[] { 180.00000, 0.00032, 0.027 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, 2, 1 }, new double[] { 180.00000, 0.00031, 0.016 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, 3, -1 }, new double[] { 180.00000, 0.00002, 0.020 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, 3, 1 }, new double[] { 180.00000, 0.00003, 0.013 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, -1 }, new double[] { 0.00000, 0.00026, 0.515 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, 1 }, new double[] { 0.00000, 0.00037, 0.040 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -3 }, new double[] { 0.00000, 0.00001, 0.064 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -1 }, new double[] { 0.00000, 0.00295, 0.088 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1 }, new double[] { 0.00000, 0.00053, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, -1 }, new double[] { 0.00000, 0.00022, 0.041 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, 1 }, new double[] { 0.00000, 0.00010, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, -1 }, new double[] { 0.00000, 0.00002, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 1 }, new double[] { 0.00000, 0.00001, 0.015 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, -3, -1 }, new double[] { 180.00000, 0.00005, 0.036 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, -2, -1 }, new double[] { 180.00000, 0.00020, 0.070 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, -2, 1 }, new double[] { 180.00000, 0.00014, 0.079 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, -1, -1 }, new double[] { 0.00000, 0.00198, 1.063 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, -1, 1 }, new double[] { 0.00000, 0.00330, 0.039 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, -3 }, new double[] { 0.00000, 0.00014, 0.069 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, -1 }, new double[] { 0.00000, 0.03043, 0.081 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 1 }, new double[] { 0.00000, 0.00318, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, 1, -3 }, new double[] { 180.00000, 0.00001, 0.785 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, 1, -1 }, new double[] { 0.00000, 0.00207, 0.039 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, 1, 1 }, new double[] { 0.00000, 0.00060, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, 2, -1 }, new double[] { 0.00000, 0.00016, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, 2, 1 }, new double[] { 0.00000, 0.00008, 0.015 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, 3, -1 }, new double[] { 0.00000, 0.00001, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 2, -2, -1 }, new double[] { 0.00000, 0.00006, 0.076 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 2, -2, 1 }, new double[] { 0.00000, 0.00003, 0.073 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 2, -1, -1 }, new double[] { 0.00000, 0.00053, 16.885 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 2, -1, 1 }, new double[] { 0.00000, 0.00057, 0.037 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, -1 }, new double[] { 0.00000, 0.00068, 0.075 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, 1 }, new double[] { 0.00000, 0.00007, 0.025 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 2, 1, -1 }, new double[] { 0.00000, 0.00003, 0.038 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 3, -1, -1, -1 }, new double[] { 0.00000, 0.00005, 0.106 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 3, -1, -1, 1 }, new double[] { 0.00000, 0.00003, 0.028 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 3, -1, 0, -1 }, new double[] { 0.00000, 0.00006, 0.044 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 3, 1, -1, -1 }, new double[] { 180.00000, 0.00003, 0.088 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 3, 1, -1, 1 }, new double[] { 180.00000, 0.00005, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, -1 }, new double[] { 180.00000, 0.00009, 0.041 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, 1 }, new double[] { 180.00000, 0.00003, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 3, 1, 1, -1 }, new double[] { 180.00000, 0.00001, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -3, -1, -1 }, new double[] { 180.00000, 0.00001, 0.051 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -3, -1, 1 }, new double[] { 180.00000, 0.00001, 0.021 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -3, 0, -1 }, new double[] { 180.00000, 0.00001, 0.030 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -2, -2, -1 }, new double[] { 180.00000, 0.00001, 0.133 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -2, -2, 1 }, new double[] { 180.00000, 0.00006, 0.029 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -2, -1, -1 }, new double[] { 180.00000, 0.00017, 0.048 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -2, -1, 1 }, new double[] { 180.00000, 0.00012, 0.021 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -2, 0, -1 }, new double[] { 180.00000, 0.00015, 0.029 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -2, 0, 1 }, new double[] { 180.00000, 0.00006, 0.016 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -2, 1, -1 }, new double[] { 180.00000, 0.00002, 0.021 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -2, 1, 1 }, new double[] { 180.00000, 0.00001, 0.013 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -1, -2, -1 }, new double[] { 180.00000, 0.00013, 0.117 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -1, -2, 1 }, new double[] { 180.00000, 0.00054, 0.028 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -1, -1, -1 }, new double[] { 180.00000, 0.00149, 0.046 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -1, -1, 1 }, new double[] { 180.00000, 0.00085, 0.021 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -1, 0, -3 }, new double[] { 180.00000, 0.00001, 0.122 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -1, 0, -1 }, new double[] { 180.00000, 0.00104, 0.029 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -1, 0, 1 }, new double[] { 180.00000, 0.00040, 0.016 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -1, 1, -1 }, new double[] { 180.00000, 0.00014, 0.021 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -1, 1, 1 }, new double[] { 180.00000, 0.00008, 0.013 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -1, 2, -1 }, new double[] { 180.00000, 0.00002, 0.016 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, -1, 2, 1 }, new double[] { 180.00000, 0.00001, 0.011 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 0, -2, 1 }, new double[] { 0.00000, 0.00001, 0.027 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 0, -1, -1 }, new double[] { 0.00000, 0.00008, 0.044 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 0, -1, 1 }, new double[] { 0.00000, 0.00003, 0.020 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, -1 }, new double[] { 0.00000, 0.00007, 0.028 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 1 }, new double[] { 0.00000, 0.00002, 0.016 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 0, 1, -1 }, new double[] { 0.00000, 0.00001, 0.020 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 1, -2, 1 }, new double[] { 0.00000, 0.00007, 0.027 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 1, -1, -1 }, new double[] { 0.00000, 0.00043, 0.042 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 1, -1, 1 }, new double[] { 0.00000, 0.00013, 0.020 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 1, 0, -1 }, new double[] { 0.00000, 0.00028, 0.027 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 1, 0, 1 }, new double[] { 0.00000, 0.00006, 0.016 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 1, 1, -1 }, new double[] { 0.00000, 0.00004, 0.020 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 1, 1, 1 }, new double[] { 0.00000, 0.00001, 0.013 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 2, -2, 1 }, new double[] { 0.00000, 0.00001, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 4, 2, -1, -1 }, new double[] { 0.00000, 0.00002, 0.040 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 6, -1, -3, 1 }, new double[] { 180.00000, 0.00001, 0.021 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 6, -1, -2, -1 }, new double[] { 180.00000, 0.00003, 0.030 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 6, -1, -2, 1 }, new double[] { 180.00000, 0.00002, 0.017 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 6, -1, -1, -1 }, new double[] { 180.00000, 0.00004, 0.021 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 6, -1, -1, 1 }, new double[] { 180.00000, 0.00002, 0.014 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 6, -1, 0, -1 }, new double[] { 180.00000, 0.00002, 0.017 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, -1, 0 }, new double[] { 194.81311, 0.00002, 0.041 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, 0 }, new double[] { 194.81311, 0.00041, 0.088 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, 1, 0 }, new double[] { 194.81311, 0.00010, 0.530 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 1, 0, 0 }, new double[] { 194.81311, 0.00002, 0.096 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, -2, 0 }, new double[] { 194.81311, 0.00002, 0.076 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, -1, -2 }, new double[] { 194.81311, 0.00003, 0.037 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, -1, 0 }, new double[] { 194.81311, 0.00066, 8.850 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -2 }, new double[] { 194.81311, 0.00008, 0.074 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0 }, new double[] { 14.81311, 0.01172, 0.075 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 2 }, new double[] { 194.81311, 0.00001, 0.025 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, -2 }, new double[] { 194.81311, 0.00002, 4.535 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0 }, new double[] { 14.81311, 0.00062, 0.038 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 2, 0 }, new double[] { 14.81311, 0.00004, 0.025 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, -1, 0 }, new double[] { 14.81311, 0.00013, 0.040 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, 0, 0 }, new double[] { 14.81311, 0.00007, 0.026 })
    };
}
