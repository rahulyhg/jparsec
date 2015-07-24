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

final class elp_lon_earth_perturb {
    static final Elp2000Set2 Lon[] = {
            new Elp2000Set2(new int[] { 0, 0, 0, 0, 1 }, new double[] { 270.00000, 0.00003, 0.075 }),
            new Elp2000Set2(new int[] { 0, 0, 0, 0, 2 }, new double[] { 0.00000, 0.00037, 0.037 }),
            new Elp2000Set2(new int[] { 0, 0, 0, 1, -2 }, new double[] { 180.00000, 0.00480, 0.074 }),
            new Elp2000Set2(new int[] { 0, 0, 0, 1, -1 }, new double[] { 90.00000, 0.00001, 5.997 }),
            new Elp2000Set2(new int[] { 0, 0, 0, 2, -2 }, new double[] { 0.00000, 0.00085, 2.998 }),
            new Elp2000Set2(new int[] { 0, 0, 0, 2, 0 }, new double[] { 180.00000, 0.00025, 0.038 }),
            new Elp2000Set2(new int[] { 0, 0, 0, 3, -2 }, new double[] { 0.00000, 0.00003, 0.077 }),
            new Elp2000Set2(new int[] { 0, 0, 0, 3, 0 }, new double[] { 180.00000, 0.00002, 0.025 }),
            new Elp2000Set2(new int[] { 0, 0, 0, 4, 0 }, new double[] { 180.00000, 0.00001, 0.019 }),
            new Elp2000Set2(new int[] { 0, 0, 1, -2, 0 }, new double[] { 180.00000, 0.00003, 0.039 }),
            new Elp2000Set2(new int[] { 0, 0, 1, -1, 0 }, new double[] { 180.00000, 0.00048, 0.082 }),
            new Elp2000Set2(new int[] { 0, 0, 1, -1, 2 }, new double[] { 180.00000, 0.00001, 0.069 }),
            new Elp2000Set2(new int[] { 0, 0, 1, 0, 0 }, new double[] { 180.00000, 0.00047, 1.000 }),
            new Elp2000Set2(new int[] { 0, 0, 1, 1, -2 }, new double[] { 180.00000, 0.00005, 0.079 }),
            new Elp2000Set2(new int[] { 0, 0, 1, 1, 0 }, new double[] { 180.00000, 0.00019, 0.070 }),
            new Elp2000Set2(new int[] { 0, 0, 1, 2, 0 }, new double[] { 180.00000, 0.00001, 0.036 }),
            new Elp2000Set2(new int[] { 0, 0, 2, -1, 0 }, new double[] { 180.00000, 0.00003, 0.089 }),
            new Elp2000Set2(new int[] { 0, 1, -1, -1, 0 }, new double[] { 180.00000, 0.00001, 0.530 }),
            new Elp2000Set2(new int[] { 0, 1, -1, 0, 0 }, new double[] { 180.00000, 0.00015, 0.088 }),
            new Elp2000Set2(new int[] { 0, 1, -1, 1, 0 }, new double[] { 180.00000, 0.00001, 0.041 }),
            new Elp2000Set2(new int[] { 0, 1, 0, -2, 0 }, new double[] { 180.00000, 0.00001, 0.071 }),
            new Elp2000Set2(new int[] { 0, 1, 0, -1, 0 }, new double[] { 180.00000, 0.00004, 1.127 }),
            new Elp2000Set2(new int[] { 0, 1, 0, 0, -2 }, new double[] { 0.00000, 0.00001, 0.069 }),
            new Elp2000Set2(new int[] { 0, 1, 0, 0, 0 }, new double[] { 180.00000, 0.00100, 0.081 }),
            new Elp2000Set2(new int[] { 0, 1, 0, 1, 0 }, new double[] { 180.00000, 0.00006, 0.039 }),
            new Elp2000Set2(new int[] { 0, 1, 1, -1, 0 }, new double[] { 0.00000, 0.00019, 8.850 }),
            new Elp2000Set2(new int[] { 0, 1, 1, 0, 0 }, new double[] { 180.00000, 0.00070, 0.075 }),
            new Elp2000Set2(new int[] { 0, 1, 1, 1, 0 }, new double[] { 180.00000, 0.00005, 0.038 }),
            new Elp2000Set2(new int[] { 0, 2, -1, -2, 0 }, new double[] { 180.00000, 0.00002, 0.360 }),
            new Elp2000Set2(new int[] { 0, 2, -1, -1, 0 }, new double[] { 0.00000, 0.00061, 0.095 }),
            new Elp2000Set2(new int[] { 0, 2, -1, 0, -2 }, new double[] { 0.00000, 0.00002, 0.322 }),
            new Elp2000Set2(new int[] { 0, 2, -1, 0, 0 }, new double[] { 0.00000, 0.00001, 0.042 }),
            new Elp2000Set2(new int[] { 0, 2, -1, 1, -2 }, new double[] { 0.00000, 0.00004, 0.099 }),
            new Elp2000Set2(new int[] { 0, 2, 0, -3, 2 }, new double[] { 180.00000, 0.00001, 0.085 }),
            new Elp2000Set2(new int[] { 0, 2, 0, -2, 0 }, new double[] { 180.00000, 0.00077, 0.564 }),
            new Elp2000Set2(new int[] { 0, 2, 0, -2, 2 }, new double[] { 0.00000, 0.00006, 0.040 }),
            new Elp2000Set2(new int[] { 0, 2, 0, -1, -2 }, new double[] { 180.00000, 0.00005, 0.065 }),
            new Elp2000Set2(new int[] { 0, 2, 0, -1, 0 }, new double[] { 0.00000, 0.02206, 0.087 }),
            new Elp2000Set2(new int[] { 0, 2, 0, 0, -2 }, new double[] { 0.00000, 0.00064, 0.474 }),
            new Elp2000Set2(new int[] { 0, 2, 0, 0, 0 }, new double[] { 0.00000, 0.00102, 0.040 }),
            new Elp2000Set2(new int[] { 0, 2, 0, 1, -2 }, new double[] { 0.00000, 0.00089, 0.090 }),
            new Elp2000Set2(new int[] { 0, 2, 0, 1, 0 }, new double[] { 0.00000, 0.00004, 0.026 }),
            new Elp2000Set2(new int[] { 0, 2, 0, 2, -2 }, new double[] { 0.00000, 0.00007, 0.041 }),
            new Elp2000Set2(new int[] { 0, 2, 1, -2, 0 }, new double[] { 0.00000, 0.00006, 1.292 }),
            new Elp2000Set2(new int[] { 0, 2, 1, -1, 0 }, new double[] { 180.00000, 0.00006, 0.080 }),
            new Elp2000Set2(new int[] { 0, 2, 1, 0, -2 }, new double[] { 180.00000, 0.00002, 0.903 }),
            new Elp2000Set2(new int[] { 0, 2, 1, 0, 0 }, new double[] { 180.00000, 0.00001, 0.039 }),
            new Elp2000Set2(new int[] { 0, 2, 2, -1, 0 }, new double[] { 0.00000, 0.00009, 0.074 }),
            new Elp2000Set2(new int[] { 0, 3, 0, -1, 0 }, new double[] { 180.00000, 0.00001, 0.042 }),
            new Elp2000Set2(new int[] { 0, 4, -1, -2, 0 }, new double[] { 0.00000, 0.00002, 0.046 }),
            new Elp2000Set2(new int[] { 0, 4, -1, -1, 0 }, new double[] { 0.00000, 0.00002, 0.028 }),
            new Elp2000Set2(new int[] { 0, 4, 0, -2, 0 }, new double[] { 0.00000, 0.00026, 0.044 }),
            new Elp2000Set2(new int[] { 0, 4, 0, -1, -2 }, new double[] { 0.00000, 0.00002, 0.107 }),
            new Elp2000Set2(new int[] { 0, 4, 0, -1, 0 }, new double[] { 0.00000, 0.00019, 0.028 }),
            new Elp2000Set2(new int[] { 0, 4, 0, 0, -2 }, new double[] { 0.00000, 0.00002, 0.044 }),
            new Elp2000Set2(new int[] { 0, 4, 0, 0, 0 }, new double[] { 0.00000, 0.00002, 0.020 }),
            new Elp2000Set2(new int[] { 0, 4, 0, 1, -2 }, new double[] { 0.00000, 0.00001, 0.028 }),
            new Elp2000Set2(new int[] { 1, -6, 0, 0, -1 }, new double[] { 0.00100, 0.00001, 0.013 }),
            new Elp2000Set2(new int[] { 1, -6, 0, 1, -1 }, new double[] { 0.00100, 0.00003, 0.016 }),
            new Elp2000Set2(new int[] { 1, -6, 0, 2, -1 }, new double[] { 0.00068, 0.00003, 0.021 }),
            new Elp2000Set2(new int[] { 1, -6, 0, 3, -1 }, new double[] { 0.00036, 0.00001, 0.029 }),
            new Elp2000Set2(new int[] { 1, -4, -1, 0, -1 }, new double[] { 180.00103, 0.00001, 0.020 }),
            new Elp2000Set2(new int[] { 1, -4, -1, 1, -1 }, new double[] { 180.00081, 0.00002, 0.027 }),
            new Elp2000Set2(new int[] { 1, -4, -1, 1, 1 }, new double[] { 180.00072, 0.00002, 0.096 }),
            new Elp2000Set2(new int[] { 1, -4, 0, -2, -1 }, new double[] { 0.00099, 0.00002, 0.013 }),
            new Elp2000Set2(new int[] { 1, -4, 0, -2, 1 }, new double[] { 180.00050, 0.00001, 0.020 }),
            new Elp2000Set2(new int[] { 1, -4, 0, -1, -1 }, new double[] { 0.00109, 0.00014, 0.016 }),
            new Elp2000Set2(new int[] { 1, -4, 0, -1, 1 }, new double[] { 180.00050, 0.00009, 0.028 }),
            new Elp2000Set2(new int[] { 1, -4, 0, 0, -1 }, new double[] { 0.00100, 0.00075, 0.020 }),
            new Elp2000Set2(new int[] { 1, -4, 0, 0, 1 }, new double[] { 180.00017, 0.00011, 0.044 }),
            new Elp2000Set2(new int[] { 1, -4, 0, 1, -3 }, new double[] { 180.00093, 0.00002, 0.016 }),
            new Elp2000Set2(new int[] { 1, -4, 0, 1, -1 }, new double[] { 0.00080, 0.00141, 0.028 }),
            new Elp2000Set2(new int[] { 1, -4, 0, 1, 1 }, new double[] { 0.00091, 0.00022, 0.106 }),
            new Elp2000Set2(new int[] { 1, -4, 0, 2, -3 }, new double[] { 180.00091, 0.00001, 0.020 }),
            new Elp2000Set2(new int[] { 1, -4, 0, 2, -1 }, new double[] { 0.00029, 0.00065, 0.043 }),
            new Elp2000Set2(new int[] { 1, -4, 1, -1, -1 }, new double[] { 0.00098, 0.00002, 0.016 }),
            new Elp2000Set2(new int[] { 1, -4, 1, 0, -1 }, new double[] { 0.00099, 0.00010, 0.021 }),
            new Elp2000Set2(new int[] { 1, -4, 1, 1, -1 }, new double[] { 0.00080, 0.00017, 0.028 }),
            new Elp2000Set2(new int[] { 1, -4, 1, 1, 1 }, new double[] { 0.00082, 0.00002, 0.119 }),
            new Elp2000Set2(new int[] { 1, -4, 1, 2, -1 }, new double[] { 0.00030, 0.00006, 0.045 }),
            new Elp2000Set2(new int[] { 1, -4, 2, 0, -1 }, new double[] { 0.00094, 0.00001, 0.021 }),
            new Elp2000Set2(new int[] { 1, -4, 2, 1, -1 }, new double[] { 0.00098, 0.00001, 0.029 }),
            new Elp2000Set2(new int[] { 1, -3, 0, 0, -1 }, new double[] { 0.00082, 0.00004, 0.027 }),
            new Elp2000Set2(new int[] { 1, -3, 0, 0, 1 }, new double[] { 180.00073, 0.00023, 0.097 }),
            new Elp2000Set2(new int[] { 1, -3, 0, 1, -1 }, new double[] { 180.00068, 0.00006, 0.042 }),
            new Elp2000Set2(new int[] { 1, -3, 0, 1, 1 }, new double[] { 180.00072, 0.00003, 0.340 }),
            new Elp2000Set2(new int[] { 1, -3, 1, 0, 1 }, new double[] { 180.00072, 0.00002, 0.107 }),
            new Elp2000Set2(new int[] { 1, -2, -2, 1, -1 }, new double[] { 180.00031, 0.00002, 0.074 }),
            new Elp2000Set2(new int[] { 1, -2, -2, 1, 1 }, new double[] { 180.00029, 0.00001, 0.075 }),
            new Elp2000Set2(new int[] { 1, -2, -1, -2, -1 }, new double[] { 180.00123, 0.00002, 0.019 }),
            new Elp2000Set2(new int[] { 1, -2, -1, -2, 1 }, new double[] { 0.00056, 0.00001, 0.039 }),
            new Elp2000Set2(new int[] { 1, -2, -1, -1, -1 }, new double[] { 180.00119, 0.00012, 0.026 }),
            new Elp2000Set2(new int[] { 1, -2, -1, -1, 1 }, new double[] { 0.00065, 0.00009, 0.082 }),
            new Elp2000Set2(new int[] { 1, -2, -1, 0, -1 }, new double[] { 180.00109, 0.00053, 0.039 }),
            new Elp2000Set2(new int[] { 1, -2, -1, 0, 1 }, new double[] { 180.00076, 0.00123, 0.949 }),
            new Elp2000Set2(new int[] { 1, -2, -1, 1, -1 }, new double[] { 180.00047, 0.00053, 0.080 }),
            new Elp2000Set2(new int[] { 1, -2, -1, 2, -1 }, new double[] { 180.00148, 0.00006, 1.388 }),
            new Elp2000Set2(new int[] { 1, -2, 0, -3, -1 }, new double[] { 0.00122, 0.00009, 0.015 }),
            new Elp2000Set2(new int[] { 1, -2, 0, -3, 1 }, new double[] { 180.00044, 0.00005, 0.027 }),
            new Elp2000Set2(new int[] { 1, -2, 0, -2, -3 }, new double[] { 180.00093, 0.00001, 0.013 }),
            new Elp2000Set2(new int[] { 1, -2, 0, -2, -1 }, new double[] { 0.00119, 0.00097, 0.019 }),
            new Elp2000Set2(new int[] { 1, -2, 0, -2, 1 }, new double[] { 180.00050, 0.00065, 0.041 }),
            new Elp2000Set2(new int[] { 1, -2, 0, -1, -3 }, new double[] { 180.00101, 0.00008, 0.015 }),
            new Elp2000Set2(new int[] { 1, -2, 0, -1, -1 }, new double[] { 0.00113, 0.00913, 0.026 }),
            new Elp2000Set2(new int[] { 1, -2, 0, -1, 1 }, new double[] { 180.00049, 0.00887, 0.089 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 0, -3 }, new double[] { 180.00092, 0.00037, 0.019 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 0, -1 }, new double[] { 0.00100, 0.06569, 0.040 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 0, 0 }, new double[] { 90.00000, 0.00006, 0.088 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 0, 1 }, new double[] { 0.00076, 0.04746, 0.487 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 0, 3 }, new double[] { 180.00077, 0.00013, 0.035 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 1, -3 }, new double[] { 180.00073, 0.00044, 0.026 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 1, -1 }, new double[] { 0.00029, 0.04962, 0.087 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 1, 1 }, new double[] { 0.00045, 0.00026, 0.065 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 1, 3 }, new double[] { 180.00076, 0.00001, 0.024 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 2, -3 }, new double[] { 180.00043, 0.00001, 0.040 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 2, -1 }, new double[] { 180.00208, 0.00249, 0.581 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 2, 1 }, new double[] { 180.00070, 0.00048, 0.035 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 3, -1 }, new double[] { 180.00155, 0.00045, 0.067 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 3, 1 }, new double[] { 180.00073, 0.00008, 0.024 }),
            new Elp2000Set2(new int[] { 1, -2, 0, 4, -1 }, new double[] { 180.00145, 0.00005, 0.035 }),
            new Elp2000Set2(new int[] { 1, -2, 1, -2, -1 }, new double[] { 0.00118, 0.00008, 0.020 }),
            new Elp2000Set2(new int[] { 1, -2, 1, -2, 1 }, new double[] { 180.00049, 0.00004, 0.043 }),
            new Elp2000Set2(new int[] { 1, -2, 1, -1, -1 }, new double[] { 0.00111, 0.00072, 0.027 }),
            new Elp2000Set2(new int[] { 1, -2, 1, -1, 1 }, new double[] { 180.00052, 0.00049, 0.098 }),
            new Elp2000Set2(new int[] { 1, -2, 1, 0, -3 }, new double[] { 180.00091, 0.00003, 0.020 }),
            new Elp2000Set2(new int[] { 1, -2, 1, 0, -1 }, new double[] { 0.00098, 0.00482, 0.042 }),
            new Elp2000Set2(new int[] { 1, -2, 1, 0, 1 }, new double[] { 0.00075, 0.00187, 0.327 }),
            new Elp2000Set2(new int[] { 1, -2, 1, 1, -3 }, new double[] { 180.00089, 0.00002, 0.027 }),
            new Elp2000Set2(new int[] { 1, -2, 1, 1, -1 }, new double[] { 0.00031, 0.00225, 0.095 }),
            new Elp2000Set2(new int[] { 1, -2, 1, 1, 1 }, new double[] { 180.00078, 0.00005, 0.061 }),
            new Elp2000Set2(new int[] { 1, -2, 1, 2, -1 }, new double[] { 180.00225, 0.00009, 0.368 }),
            new Elp2000Set2(new int[] { 1, -2, 1, 2, 1 }, new double[] { 180.00071, 0.00003, 0.034 }),
            new Elp2000Set2(new int[] { 1, -2, 1, 3, -1 }, new double[] { 180.00164, 0.00001, 0.063 }),
            new Elp2000Set2(new int[] { 1, -2, 2, -1, -1 }, new double[] { 0.00111, 0.00004, 0.028 }),
            new Elp2000Set2(new int[] { 1, -2, 2, -1, 1 }, new double[] { 180.00054, 0.00002, 0.109 }),
            new Elp2000Set2(new int[] { 1, -2, 2, 0, -1 }, new double[] { 0.00097, 0.00024, 0.044 }),
            new Elp2000Set2(new int[] { 1, -2, 2, 0, 1 }, new double[] { 0.00072, 0.00006, 0.247 }),
            new Elp2000Set2(new int[] { 1, -2, 2, 1, -1 }, new double[] { 0.00031, 0.00008, 0.105 }),
            new Elp2000Set2(new int[] { 1, -2, 3, 0, -1 }, new double[] { 0.00094, 0.00001, 0.046 }),
            new Elp2000Set2(new int[] { 1, -1, -1, -1, -1 }, new double[] { 0.00122, 0.00004, 0.037 }),
            new Elp2000Set2(new int[] { 1, -1, -1, 0, -1 }, new double[] { 0.00107, 0.00019, 0.075 }),
            new Elp2000Set2(new int[] { 1, -1, -1, 0, 1 }, new double[] { 0.00000, 0.00001, 0.075 }),
            new Elp2000Set2(new int[] { 1, -1, -1, 1, -1 }, new double[] { 180.00149, 0.00001, 5.998 }),
            new Elp2000Set2(new int[] { 1, -1, 0, -2, -1 }, new double[] { 180.00131, 0.00003, 0.026 }),
            new Elp2000Set2(new int[] { 1, -1, 0, -1, -1 }, new double[] { 180.00131, 0.00023, 0.039 }),
            new Elp2000Set2(new int[] { 1, -1, 0, -1, 1 }, new double[] { 180.00122, 0.00002, 0.857 }),
            new Elp2000Set2(new int[] { 1, -1, 0, 0, -3 }, new double[] { 0.00093, 0.00001, 0.025 }),
            new Elp2000Set2(new int[] { 1, -1, 0, 0, -1 }, new double[] { 180.00134, 0.00075, 0.081 }),
            new Elp2000Set2(new int[] { 1, -1, 0, 0, 1 }, new double[] { 180.00067, 0.00056, 0.069 }),
            new Elp2000Set2(new int[] { 1, -1, 0, 1, -1 }, new double[] { 0.00127, 0.00028, 1.200 }),
            new Elp2000Set2(new int[] { 1, -1, 0, 1, 1 }, new double[] { 180.00072, 0.00002, 0.036 }),
            new Elp2000Set2(new int[] { 1, -1, 0, 2, -1 }, new double[] { 0.00129, 0.00006, 0.071 }),
            new Elp2000Set2(new int[] { 1, -1, 1, 0, -1 }, new double[] { 179.99990, 0.00004, 0.088 }),
            new Elp2000Set2(new int[] { 1, -1, 1, 0, 1 }, new double[] { 180.00072, 0.00001, 0.065 }),
            new Elp2000Set2(new int[] { 1, 0, -2, -1, -1 }, new double[] { 180.00138, 0.00002, 0.065 }),
            new Elp2000Set2(new int[] { 1, 0, -2, 0, -1 }, new double[] { 0.00072, 0.00003, 0.487 }),
            new Elp2000Set2(new int[] { 1, 0, -2, 1, -1 }, new double[] { 0.00116, 0.00007, 0.089 }),
            new Elp2000Set2(new int[] { 1, 0, -1, -3, -1 }, new double[] { 180.00133, 0.00003, 0.024 }),
            new Elp2000Set2(new int[] { 1, 0, -1, -2, -1 }, new double[] { 180.00133, 0.00029, 0.036 }),
            new Elp2000Set2(new int[] { 1, 0, -1, -2, 1 }, new double[] { 0.00025, 0.00003, 1.389 }),
            new Elp2000Set2(new int[] { 1, 0, -1, -1, -3 }, new double[] { 0.00090, 0.00001, 0.024 }),
            new Elp2000Set2(new int[] { 1, 0, -1, -1, -1 }, new double[] { 180.00141, 0.00187, 0.070 }),
            new Elp2000Set2(new int[] { 1, 0, -1, -1, 1 }, new double[] { 359.99928, 0.00008, 0.080 }),
            new Elp2000Set2(new int[] { 1, 0, -1, 0, -3 }, new double[] { 0.00092, 0.00001, 0.036 }),
            new Elp2000Set2(new int[] { 1, 0, -1, 0, -1 }, new double[] { 0.00067, 0.00282, 0.949 }),
            new Elp2000Set2(new int[] { 1, 0, -1, 0, 1 }, new double[] { 0.00045, 0.00010, 0.039 }),
            new Elp2000Set2(new int[] { 1, 0, -1, 1, -1 }, new double[] { 0.00118, 0.00387, 0.082 }),
            new Elp2000Set2(new int[] { 1, 0, -1, 1, 1 }, new double[] { 0.00070, 0.00026, 0.026 }),
            new Elp2000Set2(new int[] { 1, 0, -1, 2, -1 }, new double[] { 0.00122, 0.00047, 0.039 }),
            new Elp2000Set2(new int[] { 1, 0, -1, 2, 1 }, new double[] { 0.00070, 0.00004, 0.019 }),
            new Elp2000Set2(new int[] { 1, 0, -1, 3, -1 }, new double[] { 0.00122, 0.00005, 0.026 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -5, -1 }, new double[] { 0.00127, 0.00001, 0.015 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -4, -1 }, new double[] { 0.00129, 0.00016, 0.019 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -3, -3 }, new double[] { 180.00113, 0.00003, 0.015 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -3, -1 }, new double[] { 0.00129, 0.00228, 0.025 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -3, 1 }, new double[] { 180.00029, 0.00013, 0.077 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -2, -3 }, new double[] { 180.00109, 0.00032, 0.019 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -2, -1 }, new double[] { 0.00128, 0.03279, 0.038 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -2, 1 }, new double[] { 180.00024, 0.00387, 3.574 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -1, -3 }, new double[] { 180.00102, 0.00261, 0.025 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -1, -1 }, new double[] { 0.00127, 0.49141, 0.075 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -1, 0 }, new double[] { 90.00000, 0.00010, 8.847 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -1, 1 }, new double[] { 0.00051, 0.05036, 0.074 }),
            new Elp2000Set2(new int[] { 1, 0, 0, -1, 3 }, new double[] { 180.00060, 0.00017, 0.025 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 0, -5 }, new double[] { 0.00086, 0.00003, 0.019 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 0, -3 }, new double[] { 180.00086, 0.01492, 0.037 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 0, -1 }, new double[] { 0.00094, 7.06304, 18.613 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 0, 0 }, new double[] { 270.00000, 0.00027, 0.075 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 0, 1 }, new double[] { 0.00071, 0.36061, 0.037 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 0, 3 }, new double[] { 180.00071, 0.00074, 0.019 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 1, -3 }, new double[] { 180.00054, 0.00050, 0.073 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 1, -1 }, new double[] { 0.00127, 0.49331, 0.076 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 1, 0 }, new double[] { 270.00000, 0.00002, 0.038 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 1, 1 }, new double[] { 0.00070, 0.03838, 0.025 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 1, 3 }, new double[] { 180.00074, 0.00015, 0.015 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 2, -3 }, new double[] { 180.00061, 0.00004, 2.582 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 2, -1 }, new double[] { 0.00126, 0.03402, 0.038 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 2, 1 }, new double[] { 0.00069, 0.00331, 0.019 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 2, 3 }, new double[] { 180.00073, 0.00002, 0.012 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 3, -1 }, new double[] { 0.00125, 0.00242, 0.025 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 3, 1 }, new double[] { 0.00067, 0.00027, 0.015 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 4, -1 }, new double[] { 0.00125, 0.00017, 0.019 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 4, 1 }, new double[] { 0.00067, 0.00002, 0.013 }),
            new Elp2000Set2(new int[] { 1, 0, 0, 5, -1 }, new double[] { 0.00127, 0.00001, 0.015 }),
            new Elp2000Set2(new int[] { 1, 0, 1, -3, -1 }, new double[] { 0.00133, 0.00004, 0.026 }),
            new Elp2000Set2(new int[] { 1, 0, 1, -2, -1 }, new double[] { 0.00135, 0.00037, 0.039 }),
            new Elp2000Set2(new int[] { 1, 0, 1, -2, 1 }, new double[] { 180.00050, 0.00003, 0.781 }),
            new Elp2000Set2(new int[] { 1, 0, 1, -1, -3 }, new double[] { 180.00090, 0.00001, 0.026 }),
            new Elp2000Set2(new int[] { 1, 0, 1, -1, -1 }, new double[] { 0.00143, 0.00249, 0.081 }),
            new Elp2000Set2(new int[] { 1, 0, 1, -1, 1 }, new double[] { 0.00272, 0.00002, 0.069 }),
            new Elp2000Set2(new int[] { 1, 0, 1, 0, -1 }, new double[] { 180.00079, 0.00240, 1.057 }),
            new Elp2000Set2(new int[] { 1, 0, 1, 0, 1 }, new double[] { 180.00076, 0.00034, 0.036 }),
            new Elp2000Set2(new int[] { 1, 0, 1, 1, -1 }, new double[] { 180.00116, 0.00292, 0.070 }),
            new Elp2000Set2(new int[] { 1, 0, 1, 1, 1 }, new double[] { 180.00073, 0.00022, 0.024 }),
            new Elp2000Set2(new int[] { 1, 0, 1, 2, -1 }, new double[] { 180.00121, 0.00037, 0.036 }),
            new Elp2000Set2(new int[] { 1, 0, 1, 2, 1 }, new double[] { 180.00071, 0.00004, 0.018 }),
            new Elp2000Set2(new int[] { 1, 0, 1, 3, -1 }, new double[] { 180.00122, 0.00004, 0.025 }),
            new Elp2000Set2(new int[] { 1, 0, 2, -1, -1 }, new double[] { 0.00146, 0.00004, 0.088 }),
            new Elp2000Set2(new int[] { 1, 0, 2, 0, -1 }, new double[] { 180.00072, 0.00003, 0.514 }),
            new Elp2000Set2(new int[] { 1, 0, 2, 1, -1 }, new double[] { 180.00119, 0.00003, 0.066 }),
            new Elp2000Set2(new int[] { 1, 1, -1, 0, -1 }, new double[] { 180.00080, 0.00003, 0.088 }),
            new Elp2000Set2(new int[] { 1, 1, 0, -2, -1 }, new double[] { 0.00182, 0.00003, 0.070 }),
            new Elp2000Set2(new int[] { 1, 1, 0, -1, -1 }, new double[] { 179.99929, 0.00011, 1.063 }),
            new Elp2000Set2(new int[] { 1, 1, 0, -1, 1 }, new double[] { 180.00052, 0.00002, 0.039 }),
            new Elp2000Set2(new int[] { 1, 1, 0, 0, -1 }, new double[] { 180.00088, 0.00342, 0.081 }),
            new Elp2000Set2(new int[] { 1, 1, 0, 0, 1 }, new double[] { 180.00072, 0.00021, 0.026 }),
            new Elp2000Set2(new int[] { 1, 1, 0, 1, -1 }, new double[] { 180.00104, 0.00043, 0.039 }),
            new Elp2000Set2(new int[] { 1, 1, 0, 1, 1 }, new double[] { 180.00071, 0.00004, 0.019 }),
            new Elp2000Set2(new int[] { 1, 1, 0, 2, -1 }, new double[] { 180.00110, 0.00004, 0.026 }),
            new Elp2000Set2(new int[] { 1, 1, 1, -1, -1 }, new double[] { 180.00007, 0.00006, 16.874 }),
            new Elp2000Set2(new int[] { 1, 1, 1, 0, -1 }, new double[] { 0.00059, 0.00064, 0.075 }),
            new Elp2000Set2(new int[] { 1, 1, 1, 0, 1 }, new double[] { 0.00072, 0.00003, 0.025 }),
            new Elp2000Set2(new int[] { 1, 1, 1, 1, -1 }, new double[] { 0.00085, 0.00007, 0.038 }),
            new Elp2000Set2(new int[] { 1, 2, -3, 0, -1 }, new double[] { 0.00094, 0.00001, 0.046 }),
            new Elp2000Set2(new int[] { 1, 2, -2, -1, -1 }, new double[] { 0.00040, 0.00010, 0.106 }),
            new Elp2000Set2(new int[] { 1, 2, -2, -1, 1 }, new double[] { 0.00072, 0.00001, 0.028 }),
            new Elp2000Set2(new int[] { 1, 2, -2, 0, -1 }, new double[] { 0.00090, 0.00031, 0.044 }),
            new Elp2000Set2(new int[] { 1, 2, -2, 0, 1 }, new double[] { 0.00072, 0.00002, 0.020 }),
            new Elp2000Set2(new int[] { 1, 2, -2, 1, -1 }, new double[] { 0.00104, 0.00005, 0.028 }),
            new Elp2000Set2(new int[] { 1, 2, -1, -3, -1 }, new double[] { 180.00162, 0.00001, 0.062 }),
            new Elp2000Set2(new int[] { 1, 2, -1, -2, -1 }, new double[] { 180.00296, 0.00006, 0.354 }),
            new Elp2000Set2(new int[] { 1, 2, -1, -2, 1 }, new double[] { 0.00051, 0.00003, 0.042 }),
            new Elp2000Set2(new int[] { 1, 2, -1, -1, -1 }, new double[] { 0.00041, 0.00288, 0.096 }),
            new Elp2000Set2(new int[] { 1, 2, -1, -1, 1 }, new double[] { 0.00069, 0.00037, 0.027 }),
            new Elp2000Set2(new int[] { 1, 2, -1, 0, -1 }, new double[] { 0.00091, 0.00646, 0.042 }),
            new Elp2000Set2(new int[] { 1, 2, -1, 0, 1 }, new double[] { 0.00072, 0.00031, 0.020 }),
            new Elp2000Set2(new int[] { 1, 2, -1, 1, -1 }, new double[] { 0.00103, 0.00091, 0.027 }),
            new Elp2000Set2(new int[] { 1, 2, -1, 1, 1 }, new double[] { 0.00069, 0.00006, 0.016 }),
            new Elp2000Set2(new int[] { 1, 2, -1, 2, -1 }, new double[] { 0.00106, 0.00010, 0.020 }),
            new Elp2000Set2(new int[] { 1, 2, 0, -4, -1 }, new double[] { 180.00153, 0.00005, 0.035 }),
            new Elp2000Set2(new int[] { 1, 2, 0, -3, -1 }, new double[] { 180.00173, 0.00037, 0.066 }),
            new Elp2000Set2(new int[] { 1, 2, 0, -3, 1 }, new double[] { 180.00003, 0.00005, 0.085 }),
            new Elp2000Set2(new int[] { 1, 2, 0, -2, -3 }, new double[] { 0.00121, 0.00002, 0.035 }),
            new Elp2000Set2(new int[] { 1, 2, 0, -2, -1 }, new double[] { 180.00322, 0.00142, 0.547 }),
            new Elp2000Set2(new int[] { 1, 2, 0, -2, 1 }, new double[] { 0.00052, 0.00067, 0.040 }),
            new Elp2000Set2(new int[] { 1, 2, 0, -1, -1 }, new double[] { 0.00042, 0.06456, 0.088 }),
            new Elp2000Set2(new int[] { 1, 2, 0, -1, 1 }, new double[] { 0.00071, 0.00815, 0.026 }),
            new Elp2000Set2(new int[] { 1, 2, 0, -1, 3 }, new double[] { 180.00036, 0.00004, 0.015 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 0, -3 }, new double[] { 179.99827, 0.00006, 0.463 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 0, -1 }, new double[] { 0.00090, 0.09642, 0.041 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 0, 1 }, new double[] { 0.00070, 0.00480, 0.019 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 0, 3 }, new double[] { 180.00038, 0.00002, 0.013 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 1, -3 }, new double[] { 180.00114, 0.00014, 0.090 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 1, -1 }, new double[] { 0.00102, 0.01234, 0.026 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 1, 1 }, new double[] { 0.00070, 0.00080, 0.015 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 2, -3 }, new double[] { 180.00118, 0.00002, 0.041 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 2, -1 }, new double[] { 0.00107, 0.00126, 0.020 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 2, 1 }, new double[] { 0.00073, 0.00009, 0.013 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 3, -1 }, new double[] { 0.00111, 0.00012, 0.016 }),
            new Elp2000Set2(new int[] { 1, 2, 0, 3, 1 }, new double[] { 0.00062, 0.00001, 0.011 }),
            new Elp2000Set2(new int[] { 1, 2, 1, -1, -1 }, new double[] { 180.00004, 0.00017, 0.080 }),
            new Elp2000Set2(new int[] { 1, 2, 1, -1, 1 }, new double[] { 180.00073, 0.00006, 0.025 }),
            new Elp2000Set2(new int[] { 1, 2, 1, 0, -1 }, new double[] { 180.00088, 0.00113, 0.039 }),
            new Elp2000Set2(new int[] { 1, 2, 1, 0, 1 }, new double[] { 180.00073, 0.00005, 0.019 }),
            new Elp2000Set2(new int[] { 1, 2, 1, 1, -1 }, new double[] { 180.00098, 0.00021, 0.026 }),
            new Elp2000Set2(new int[] { 1, 2, 1, 1, 1 }, new double[] { 180.00099, 0.00001, 0.015 }),
            new Elp2000Set2(new int[] { 1, 2, 1, 2, -1 }, new double[] { 180.00105, 0.00003, 0.019 }),
            new Elp2000Set2(new int[] { 1, 2, 2, -1, -1 }, new double[] { 180.00033, 0.00005, 0.074 }),
            new Elp2000Set2(new int[] { 1, 3, 0, -2, -1 }, new double[] { 179.99961, 0.00001, 0.095 }),
            new Elp2000Set2(new int[] { 1, 3, 0, -1, -1 }, new double[] { 180.00070, 0.00013, 0.042 }),
            new Elp2000Set2(new int[] { 1, 3, 0, -1, 1 }, new double[] { 180.00072, 0.00001, 0.020 }),
            new Elp2000Set2(new int[] { 1, 3, 1, -1, -1 }, new double[] { 0.00073, 0.00001, 0.040 }),
            new Elp2000Set2(new int[] { 1, 3, 1, 0, -1 }, new double[] { 0.00088, 0.00001, 0.026 }),
            new Elp2000Set2(new int[] { 1, 4, -2, -1, -1 }, new double[] { 0.00091, 0.00002, 0.029 }),
            new Elp2000Set2(new int[] { 1, 4, -2, 0, -1 }, new double[] { 0.00094, 0.00001, 0.021 }),
            new Elp2000Set2(new int[] { 1, 4, -1, -2, -1 }, new double[] { 0.00041, 0.00008, 0.046 }),
            new Elp2000Set2(new int[] { 1, 4, -1, -2, 1 }, new double[] { 0.00092, 0.00001, 0.021 }),
            new Elp2000Set2(new int[] { 1, 4, -1, -1, -1 }, new double[] { 0.00077, 0.00024, 0.028 }),
            new Elp2000Set2(new int[] { 1, 4, -1, -1, 1 }, new double[] { 0.00071, 0.00002, 0.016 }),
            new Elp2000Set2(new int[] { 1, 4, -1, 0, -1 }, new double[] { 0.00090, 0.00015, 0.021 }),
            new Elp2000Set2(new int[] { 1, 4, -1, 1, -1 }, new double[] { 0.00091, 0.00003, 0.016 }),
            new Elp2000Set2(new int[] { 1, 4, 0, -3, -1 }, new double[] { 359.99818, 0.00001, 0.104 }),
            new Elp2000Set2(new int[] { 1, 4, 0, -3, 1 }, new double[] { 0.00056, 0.00001, 0.027 }),
            new Elp2000Set2(new int[] { 1, 4, 0, -2, -1 }, new double[] { 0.00042, 0.00088, 0.044 }),
            new Elp2000Set2(new int[] { 1, 4, 0, -2, 1 }, new double[] { 0.00070, 0.00014, 0.020 }),
            new Elp2000Set2(new int[] { 1, 4, 0, -1, -1 }, new double[] { 0.00078, 0.00217, 0.028 }),
            new Elp2000Set2(new int[] { 1, 4, 0, -1, 1 }, new double[] { 0.00071, 0.00016, 0.016 }),
            new Elp2000Set2(new int[] { 1, 4, 0, 0, -1 }, new double[] { 0.00090, 0.00115, 0.020 }),
            new Elp2000Set2(new int[] { 1, 4, 0, 0, 1 }, new double[] { 0.00072, 0.00006, 0.013 }),
            new Elp2000Set2(new int[] { 1, 4, 0, 1, -1 }, new double[] { 0.00098, 0.00021, 0.016 }),
            new Elp2000Set2(new int[] { 1, 4, 0, 1, 1 }, new double[] { 0.00038, 0.00001, 0.011 }),
            new Elp2000Set2(new int[] { 1, 4, 0, 2, -1 }, new double[] { 0.00093, 0.00003, 0.013 }),
            new Elp2000Set2(new int[] { 1, 4, 1, -1, -1 }, new double[] { 180.00077, 0.00004, 0.027 }),
            new Elp2000Set2(new int[] { 1, 4, 1, 0, -1 }, new double[] { 180.00089, 0.00003, 0.020 }),
            new Elp2000Set2(new int[] { 1, 6, 0, -3, -1 }, new double[] { 0.00037, 0.00001, 0.029 }),
            new Elp2000Set2(new int[] { 1, 6, 0, -2, -1 }, new double[] { 0.00067, 0.00004, 0.021 }),
            new Elp2000Set2(new int[] { 1, 6, 0, -1, -1 }, new double[] { 0.00090, 0.00004, 0.016 }),
            new Elp2000Set2(new int[] { 1, 6, 0, 0, -1 }, new double[] { 0.00090, 0.00002, 0.013 }),
            new Elp2000Set2(new int[] { 2, -2, -1, 0, 0 }, new double[] { 0.00000, 0.00001, 1.000 }),
            new Elp2000Set2(new int[] { 2, -2, 0, -1, -2 }, new double[] { 180.00000, 0.00004, 0.026 }),
            new Elp2000Set2(new int[] { 2, -2, 0, -1, 0 }, new double[] { 0.00000, 0.00013, 0.089 }),
            new Elp2000Set2(new int[] { 2, -2, 0, 0, -2 }, new double[] { 180.00000, 0.00027, 0.040 }),
            new Elp2000Set2(new int[] { 2, -2, 0, 0, 0 }, new double[] { 180.00000, 0.00043, 0.500 }),
            new Elp2000Set2(new int[] { 2, -2, 0, 1, -2 }, new double[] { 180.00000, 0.00025, 0.086 }),
            new Elp2000Set2(new int[] { 2, -2, 0, 1, 0 }, new double[] { 180.00000, 0.00002, 0.066 }),
            new Elp2000Set2(new int[] { 2, -2, 0, 2, -2 }, new double[] { 0.00000, 0.00001, 0.600 }),
            new Elp2000Set2(new int[] { 2, -2, 1, 0, -2 }, new double[] { 180.00000, 0.00002, 0.042 }),
            new Elp2000Set2(new int[] { 2, -2, 1, 0, 0 }, new double[] { 180.00000, 0.00003, 0.333 }),
            new Elp2000Set2(new int[] { 2, -2, 1, 1, -2 }, new double[] { 180.00000, 0.00001, 0.094 }),
            new Elp2000Set2(new int[] { 2, 0, -1, 0, -2 }, new double[] { 180.00000, 0.00003, 0.903 }),
            new Elp2000Set2(new int[] { 2, 0, -1, 1, -2 }, new double[] { 180.00000, 0.00002, 0.082 }),
            new Elp2000Set2(new int[] { 2, 0, 0, -2, -2 }, new double[] { 180.00000, 0.00016, 0.038 }),
            new Elp2000Set2(new int[] { 2, 0, 0, -2, 0 }, new double[] { 0.00000, 0.00009, 4.424 }),
            new Elp2000Set2(new int[] { 2, 0, 0, -1, -4 }, new double[] { 0.00000, 0.00001, 0.025 }),
            new Elp2000Set2(new int[] { 2, 0, 0, -1, -2 }, new double[] { 180.00000, 0.00239, 0.075 }),
            new Elp2000Set2(new int[] { 2, 0, 0, -1, -1 }, new double[] { 270.00000, 0.00001, 16.863 }),
            new Elp2000Set2(new int[] { 2, 0, 0, -1, 0 }, new double[] { 180.00000, 0.00080, 0.074 }),
            new Elp2000Set2(new int[] { 2, 0, 0, 0, -4 }, new double[] { 0.00000, 0.00007, 0.037 }),
            new Elp2000Set2(new int[] { 2, 0, 0, 0, -2 }, new double[] { 180.00000, 0.03638, 9.307 }),
            new Elp2000Set2(new int[] { 2, 0, 0, 0, -1 }, new double[] { 90.00000, 0.00003, 0.075 }),
            new Elp2000Set2(new int[] { 2, 0, 0, 0, 0 }, new double[] { 180.00000, 0.00239, 0.037 }),
            new Elp2000Set2(new int[] { 2, 0, 0, 1, -2 }, new double[] { 180.00000, 0.00241, 0.076 }),
            new Elp2000Set2(new int[] { 2, 0, 0, 1, 0 }, new double[] { 180.00000, 0.00025, 0.025 }),
            new Elp2000Set2(new int[] { 2, 0, 0, 2, -2 }, new double[] { 180.00000, 0.00017, 0.038 }),
            new Elp2000Set2(new int[] { 2, 0, 0, 2, 0 }, new double[] { 180.00000, 0.00002, 0.019 }),
            new Elp2000Set2(new int[] { 2, 0, 1, 0, -2 }, new double[] { 0.00000, 0.00002, 1.120 }),
            new Elp2000Set2(new int[] { 2, 0, 1, 1, -2 }, new double[] { 0.00000, 0.00001, 0.071 }),
            new Elp2000Set2(new int[] { 2, 1, 0, 0, -2 }, new double[] { 0.00000, 0.00002, 0.082 }),
            new Elp2000Set2(new int[] { 2, 1, 1, 0, -2 }, new double[] { 180.00000, 0.00004, 0.075 }),
            new Elp2000Set2(new int[] { 2, 2, -1, -1, -2 }, new double[] { 180.00000, 0.00002, 0.096 }),
            new Elp2000Set2(new int[] { 2, 2, -1, 0, -2 }, new double[] { 180.00000, 0.00004, 0.042 }),
            new Elp2000Set2(new int[] { 2, 2, 0, -1, -2 }, new double[] { 180.00000, 0.00039, 0.088 }),
            new Elp2000Set2(new int[] { 2, 2, 0, -1, 0 }, new double[] { 180.00000, 0.00006, 0.026 }),
            new Elp2000Set2(new int[] { 2, 2, 0, 0, -2 }, new double[] { 180.00000, 0.00057, 0.041 }),
            new Elp2000Set2(new int[] { 2, 2, 0, 0, 0 }, new double[] { 180.00000, 0.00003, 0.019 }),
            new Elp2000Set2(new int[] { 2, 2, 0, 1, -2 }, new double[] { 180.00000, 0.00007, 0.026 }),
            new Elp2000Set2(new int[] { 2, 4, 0, -1, -2 }, new double[] { 180.00000, 0.00001, 0.028 })
    };
}

