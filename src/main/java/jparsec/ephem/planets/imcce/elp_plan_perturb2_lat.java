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

final class elp_plan_perturb2_lat {
    static final Elp2000Set3 Lat[] = {
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, new double[] { 0.00002, 0.00068, 0.075 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, -1 }, new double[] { 180.00000, 0.00041, 5.997 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1 }, new double[] { 180.00001, 0.00039, 0.037 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, -1 }, new double[] { 180.00134, 0.00001, 0.076 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1 }, new double[] { 180.00003, 0.00005, 0.025 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, -1 }, new double[] { 155.90141, 0.00007, 0.039 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, -1, 1 }, new double[] { 155.89388, 0.00006, 0.857 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, -1 }, new double[] { 155.96862, 0.00006, 0.081 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 }, new double[] { 155.96726, 0.00006, 0.069 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, -1 }, new double[] { 155.89029, 0.00005, 1.200 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1 }, new double[] { 155.89864, 0.00006, 0.036 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, -1 }, new double[] { 24.15518, 0.00001, 0.487 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, -1, 0, 1 }, new double[] { 24.15503, 0.00001, 0.040 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, -1, 1 }, new double[] { 168.91635, 0.00001, 0.074 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, -1 }, new double[] { 335.84475, 0.00007, 18.600 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1 }, new double[] { 335.84494, 0.00007, 0.037 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, -1, 1 }, new double[] { 24.07078, 0.00001, 0.042 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, -1, 0, -1 }, new double[] { 25.70742, 0.00006, 0.097 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, -2, -1 }, new double[] { 180.00014, 0.00001, 0.066 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, -1 }, new double[] { 179.99989, 0.00011, 0.515 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, -1, 1 }, new double[] { 180.00001, 0.00007, 0.040 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, -1 }, new double[] { 359.99976, 0.00057, 0.088 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1 }, new double[] { 179.99998, 0.00003, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 0, 1, -1 }, new double[] { 359.99956, 0.00002, 0.041 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, -1, -1 }, new double[] { 335.90294, 0.00002, 1.063 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, -1, 1 }, new double[] { 335.89944, 0.00002, 0.039 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, -1 }, new double[] { 335.90598, 0.00006, 0.081 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 2, -1, -1 }, new double[] { 156.00424, 0.00001, 16.885 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 2, -1, 1 }, new double[] { 156.00393, 0.00001, 0.037 }),
            new Elp2000Set3(new int[] { 0, 0, 0, 0, 0, 0, 0, 2, 2, 0, -1 }, new double[] { 335.58947, 0.00002, 0.075 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -3, -1, 1, 0 }, new double[] { 275.13228, 0.00001, 0.042 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -3, 0, -1, 0 }, new double[] { 95.13228, 0.00004, 0.020 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -3, 0, 0, 0 }, new double[] { 95.13231, 0.00029, 0.028 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -3, 0, 0, 2 }, new double[] { 95.13225, 0.00001, 0.108 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -3, 0, 1, 0 }, new double[] { 95.13223, 0.00050, 0.044 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -3, 0, 2, 0 }, new double[] { 95.13217, 0.00004, 0.104 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -3, 1, 0, 0 }, new double[] { 95.13228, 0.00003, 0.028 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -3, 1, 1, 0 }, new double[] { 95.13228, 0.00004, 0.046 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -2, 0, 0, 0 }, new double[] { 275.13228, 0.00003, 0.042 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -2, 0, 0, 1 }, new double[] { 77.05290, 0.00003, 0.097 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -2, 0, 1, 0 }, new double[] { 275.13228, 0.00002, 0.095 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, -2, 0, 0 }, new double[] { 275.13105, 0.00002, 0.075 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, -1, -1, 0 }, new double[] { 275.13228, 0.00006, 0.039 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, -1, 0, 0 }, new double[] { 275.13221, 0.00096, 0.081 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, -1, 0, 2 }, new double[] { 275.13232, 0.00001, 0.069 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, -1, 1, 0 }, new double[] { 275.13228, 0.00006, 1.127 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, -3, 0 }, new double[] { 95.13228, 0.00001, 0.020 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, -2, 0 }, new double[] { 95.13251, 0.00017, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, -1, -2 }, new double[] { 95.13530, 0.00006, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, -1, 0 }, new double[] { 95.13236, 0.00264, 0.041 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, -1, 2 }, new double[] { 275.13175, 0.00008, 0.450 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, -2 }, new double[] { 95.13684, 0.00014, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, 0 }, new double[] { 95.13226, 0.04834, 0.088 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, 0, 2 }, new double[] { 95.13225, 0.00050, 0.065 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, 1, -2 }, new double[] { 275.13286, 0.00024, 0.040 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, 1, 0 }, new double[] { 95.13224, 0.01209, 0.530 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, 1, 2 }, new double[] { 95.13229, 0.00007, 0.035 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, 2, 0 }, new double[] { 95.13216, 0.00108, 0.066 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, 3, 0 }, new double[] { 95.13204, 0.00010, 0.035 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 0, 4, 0 }, new double[] { 95.13228, 0.00001, 0.024 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 1, -1, 0 }, new double[] { 95.13239, 0.00014, 0.042 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 1, 0, -2 }, new double[] { 95.13641, 0.00001, 0.027 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 1, 0, 0 }, new double[] { 95.13228, 0.00227, 0.096 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 1, 0, 2 }, new double[] { 95.13230, 0.00002, 0.061 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 1, 1, -2 }, new double[] { 275.13287, 0.00001, 0.042 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 1, 1, 0 }, new double[] { 95.13223, 0.00054, 0.346 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 1, 2, 0 }, new double[] { 95.13217, 0.00005, 0.062 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 2, 0, 0 }, new double[] { 95.13228, 0.00008, 0.107 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, -1, 2, 1, 0 }, new double[] { 95.13228, 0.00002, 0.257 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 0, -1, 0, 0 }, new double[] { 95.13228, 0.00006, 99999.999 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, 0 }, new double[] { 275.13228, 0.00004, 0.082 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, -1 }, new double[] { 257.75566, 0.00002, 0.081 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, new double[] { 275.13228, 0.00035, 1.000 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1 }, new double[] { 257.75566, 0.00002, 0.069 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0 }, new double[] { 275.13228, 0.00003, 0.070 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, -1, -2, 0 }, new double[] { 275.13228, 0.00002, 0.071 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, -1, -1, -2 }, new double[] { 275.13552, 0.00001, 0.036 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, -1, -1, 0 }, new double[] { 275.13237, 0.00038, 1.127 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, -1, 0, -2 }, new double[] { 95.13134, 0.00001, 0.069 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, -1, 0, 0 }, new double[] { 275.13175, 0.00044, 0.081 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, -1, 1, -2 }, new double[] { 95.13401, 0.00002, 0.819 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, -1, 1, 0 }, new double[] { 275.13214, 0.00048, 0.039 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, -1, 2, 0 }, new double[] { 275.13216, 0.00006, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, -3, -2 }, new double[] { 95.13461, 0.00003, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, -3, 0 }, new double[] { 95.13212, 0.00015, 0.038 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, -2, -2 }, new double[] { 95.13464, 0.00037, 0.025 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, -2, 0 }, new double[] { 95.13209, 0.00294, 0.076 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, -2, 2 }, new double[] { 275.13183, 0.00004, 0.073 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, -1, -2 }, new double[] { 95.13467, 0.00325, 0.037 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, -1, 0 }, new double[] { 95.13234, 0.07755, 8.850 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, -1, 2 }, new double[] { 95.13192, 0.00075, 0.037 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -4 }, new double[] { 275.13485, 0.00001, 0.025 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, -2 }, new double[] { 95.13510, 0.00917, 0.074 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0 }, new double[] { 275.13226, 1.37497, 0.075 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 2 }, new double[] { 95.13223, 0.00142, 0.025 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, -2 }, new double[] { 95.13472, 0.00198, 4.535 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0 }, new double[] { 275.13217, 0.07245, 0.038 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 2 }, new double[] { 95.13223, 0.00023, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 2, -2 }, new double[] { 95.13490, 0.00013, 0.077 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 2, 0 }, new double[] { 275.13207, 0.00427, 0.025 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 2, 2 }, new double[] { 95.13228, 0.00003, 0.015 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 3, -2 }, new double[] { 95.13477, 0.00001, 0.038 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 3, 0 }, new double[] { 275.13197, 0.00026, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 0, 4, 0 }, new double[] { 275.13203, 0.00002, 0.015 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 1, -2, 0 }, new double[] { 95.13228, 0.00002, 0.082 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 1, -1, -2 }, new double[] { 95.13550, 0.00002, 0.039 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 1, -1, 0 }, new double[] { 95.13231, 0.00044, 0.898 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0 }, new double[] { 95.13293, 0.00037, 0.070 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, -2 }, new double[] { 275.13410, 0.00001, 1.283 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 1, 1, 0 }, new double[] { 95.13220, 0.00037, 0.036 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 1, 1, 2, 0 }, new double[] { 95.13216, 0.00004, 0.024 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 2, 0, -1, 0 }, new double[] { 275.13228, 0.00001, 0.080 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, -1 }, new double[] { 77.14857, 0.00001, 0.081 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0 }, new double[] { 95.13223, 0.00039, 0.039 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 2, 0, 1, 0 }, new double[] { 95.13228, 0.00005, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0 }, new double[] { 275.13228, 0.00006, 0.037 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, -2, -1, 0 }, new double[] { 275.13228, 0.00002, 0.044 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, -2, 0, 0 }, new double[] { 275.13228, 0.00003, 0.028 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, -1, -1, -2 }, new double[] { 275.13446, 0.00001, 0.334 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, -1, -1, 0 }, new double[] { 275.13228, 0.00067, 0.042 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, -1, 0, -2 }, new double[] { 95.13544, 0.00003, 0.097 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, -1, 0, 0 }, new double[] { 275.13220, 0.00058, 0.027 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, -1, 1, 0 }, new double[] { 275.13210, 0.00008, 0.020 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, -3, -2 }, new double[] { 275.13456, 0.00001, 0.035 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, -3, 0 }, new double[] { 275.13228, 0.00002, 0.602 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, -2, -2 }, new double[] { 275.13457, 0.00007, 0.066 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, -2, 0 }, new double[] { 95.13267, 0.00012, 0.086 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, -2, 2 }, new double[] { 95.13191, 0.00002, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, -1, -2 }, new double[] { 275.13456, 0.00026, 0.501 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, -1, 0 }, new double[] { 275.13228, 0.01504, 0.040 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, -1, 2 }, new double[] { 95.13228, 0.00006, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, 0, -2 }, new double[] { 95.13571, 0.00050, 0.089 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, 0, 0 }, new double[] { 275.13220, 0.00849, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, 0, 2 }, new double[] { 95.13228, 0.00003, 0.015 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, 1, -2 }, new double[] { 95.13446, 0.00014, 0.041 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, 1, 0 }, new double[] { 275.13210, 0.00105, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, 2, -2 }, new double[] { 95.13433, 0.00002, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, 2, 0 }, new double[] { 275.13200, 0.00010, 0.015 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 0, 3, 0 }, new double[] { 275.13228, 0.00001, 0.013 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 1, -1, 0 }, new double[] { 95.13234, 0.00010, 0.039 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 1, 0, 0 }, new double[] { 95.13220, 0.00009, 0.026 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 3, 1, 1, 0 }, new double[] { 95.13228, 0.00002, 0.019 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 4, 0, -1, 0 }, new double[] { 95.13228, 0.00002, 0.027 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 5, -1, -2, 0 }, new double[] { 275.13228, 0.00002, 0.028 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 5, -1, -1, 0 }, new double[] { 275.13228, 0.00003, 0.021 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 5, -1, 0, 0 }, new double[] { 275.13228, 0.00001, 0.016 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 5, 0, -2, 0 }, new double[] { 275.13231, 0.00018, 0.028 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 5, 0, -1, 0 }, new double[] { 275.13223, 0.00022, 0.020 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 5, 0, 0, 0 }, new double[] { 275.13214, 0.00008, 0.016 }),
            new Elp2000Set3(new int[] { 0, 0, 1, 0, 0, 0, 0, 5, 0, 1, 0 }, new double[] { 275.13228, 0.00002, 0.013 })
    };
}
