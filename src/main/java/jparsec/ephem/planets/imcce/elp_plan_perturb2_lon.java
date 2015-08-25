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

final class elp_plan_perturb2_lon {
	static final Elp2000Set3 Lon[] = {
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  2}, new double[] { 180.00031,   0.00002,     0.037}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  0,  1, -2}, new double[] { 359.99968,   0.00012,     0.074}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  0}, new double[] { 180.00567,   0.00963,     0.075}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  0,  1,  2}, new double[] {   0.00000,   0.00002,     0.025}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  0,  2,  0}, new double[] { 180.00006,   0.00065,     0.038}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  0,  3,  0}, new double[] { 179.99986,   0.00005,     0.025}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  1, -2,  0}, new double[] { 153.73567,   0.00009,     0.039}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  1, -1,  0}, new double[] { 154.27480,   0.00135,     0.082}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  1,  0,  0}, new double[] { 155.76630,   0.00661,     1.000}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  1,  1,  0}, new double[] { 154.62845,   0.00120,     0.070}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  1,  2,  0}, new double[] { 153.96248,   0.00008,     0.036}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  2, -1,  0}, new double[] { 336.25846,   0.00002,     0.089}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  2,  0,  0}, new double[] { 154.00745,   0.00008,     0.500}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  0,  2,  1,  0}, new double[] { 155.89560,   0.00001,     0.066}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  1, -2,  0,  0}, new double[] {  24.15517,   0.00001,     0.096}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  1, -1, -1,  0}, new double[] {  24.15511,   0.00003,     0.530}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  1, -1,  0,  0}, new double[] {  24.08286,   0.00031,     0.088}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  1, -1,  1,  0}, new double[] {  23.35231,   0.00002,     0.041}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  1,  0, -1,  0}, new double[] {   0.00000,   0.00001,     1.127}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  1,  0,  0,  0}, new double[] { 346.96809,   0.00002,     0.081}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  1,  1, -2,  0}, new double[] { 336.31637,   0.00003,     0.076}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  1,  1, -1,  0}, new double[] { 165.16990,   0.00018,     8.850}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  1,  1,  0,  0}, new double[] { 335.78680,   0.00159,     0.075}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  1,  1,  1,  0}, new double[] { 335.84492,   0.00011,     0.038}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2, -2,  0,  0}, new double[] { 210.91539,   0.00003,     0.044}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2, -1, -1,  0}, new double[] {  40.76689,   0.00017,     0.095}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2, -1,  0,  0}, new double[] { 198.78197,   0.00017,     0.042}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2, -1,  1,  0}, new double[] { 182.66055,   0.00001,     0.027}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  0, -3,  0}, new double[] { 180.00152,   0.00002,     0.067}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  0, -2,  0}, new double[] { 179.99919,   0.00018,     0.564}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  0, -1, -2}, new double[] { 359.99976,   0.00002,     0.065}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  0, -1,  0}, new double[] { 180.07400,   0.00181,     0.087}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  0,  0, -2}, new double[] { 359.99982,   0.00015,     0.474}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  0,  0,  0}, new double[] { 179.70982,   0.00043,     0.040}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  0,  1,  0}, new double[] { 179.99999,   0.00011,     0.026}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  1, -2,  0}, new double[] { 350.80827,   0.00001,     1.292}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  1, -1,  0}, new double[] { 335.90413,   0.00056,     0.080}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  1,  0, -2}, new double[] { 335.92813,   0.00001,     0.903}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  1,  0,  0}, new double[] { 155.91133,   0.00007,     0.039}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  1,  1,  0}, new double[] { 155.90587,   0.00002,     0.026}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  2, -2,  0}, new double[] {  11.98593,   0.00002,     4.425}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  2, -1,  0}, new double[] { 156.00589,   0.00024,     0.074}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  2,  0, -2}, new double[] { 180.00000,   0.00004,     9.300}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  2,  2,  0,  0}, new double[] { 156.00396,   0.00002,     0.037}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  3,  1, -1,  0}, new double[] { 334.71131,   0.00002,     0.040}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  3,  1,  0,  0}, new double[] { 335.83848,   0.00002,     0.026}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  4,  0, -2,  0}, new double[] { 180.00003,   0.00002,     0.044}),
		new Elp2000Set3 (new int[] {  0,  0,  0,  0,  0,  0,  0,  4,  0, -1,  0}, new double[] { 180.00021,   0.00002,     0.028}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -3,  0, -1,  1}, new double[] { 275.13149,   0.00001,     0.028}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -3,  0,  1, -1}, new double[] { 275.13100,   0.00006,     0.028}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -3,  0,  1,  1}, new double[] {  95.13240,   0.00004,     0.106}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -3,  0,  2, -1}, new double[] { 275.13354,   0.00010,     0.043}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -2,  0,  0,  0}, new double[] {  77.00007,   0.00003,     0.042}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -2,  0,  0,  1}, new double[] { 275.13228,   0.00004,     0.097}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -2,  0,  1,  0}, new double[] {  77.05643,   0.00004,     0.095}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1, -1, -1,  1}, new double[] {  95.13228,   0.00001,     0.082}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1, -1,  0, -1}, new double[] {  95.12539,   0.00001,     0.039}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1, -1,  0,  1}, new double[] { 275.13214,   0.00023,     0.949}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1, -1,  1, -1}, new double[] {  95.13827,   0.00001,     0.080}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1, -1,  2, -1}, new double[] { 275.13355,   0.00002,     1.388}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  0, -2, -1}, new double[] {  95.13543,   0.00008,     0.019}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  0, -2,  1}, new double[] { 275.13140,   0.00011,     0.041}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  0, -1, -1}, new double[] {  95.13608,   0.00053,     0.026}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  0, -1,  1}, new double[] { 275.13151,   0.00146,     0.089}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  0,  0, -1}, new double[] {  95.14482,   0.00080,     0.040}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  0,  0,  1}, new double[] {  95.13222,   0.00851,     0.487}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  0,  0,  3}, new double[] { 275.13231,   0.00002,     0.035}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  0,  1, -1}, new double[] { 275.13348,   0.00772,     0.087}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  0,  1,  1}, new double[] {  95.13089,   0.00006,     0.065}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  0,  2, -1}, new double[] { 275.13413,   0.00094,     0.581}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  0,  2,  1}, new double[] { 275.13215,   0.00008,     0.035}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  0,  3, -1}, new double[] { 275.13430,   0.00010,     0.067}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  0,  3,  1}, new double[] { 275.13228,   0.00001,     0.024}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  1, -1, -1}, new double[] {  95.13568,   0.00004,     0.027}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  1, -1,  1}, new double[] { 275.13157,   0.00008,     0.098}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  1,  0, -1}, new double[] {  95.13903,   0.00010,     0.042}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  1,  0,  1}, new double[] {  95.13223,   0.00033,     0.327}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  1,  1, -1}, new double[] { 275.13356,   0.00033,     0.095}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0, -1,  1,  2, -1}, new double[] { 275.13422,   0.00004,     0.368}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  0,  0, -1, -1}, new double[] { 275.13807,   0.00001,     0.039}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  0,  0, -1,  0}, new double[] {  76.15482,   0.00003,     0.082}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  0,  0,  0, -1}, new double[] {  95.13038,   0.00015,     0.081}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  0,  0,  0,  0}, new double[] {  72.38269,   0.00009,     1.000}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  0,  0,  0,  1}, new double[] { 275.13220,   0.00009,     0.069}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  0,  0,  1, -1}, new double[] {  95.13339,   0.00007,     1.200}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  0,  0,  1,  0}, new double[] {  75.53411,   0.00002,     0.070}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  0,  0,  2, -1}, new double[] {  95.13373,   0.00001,     0.071}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1, -1, -2, -1}, new double[] { 275.13501,   0.00003,     0.036}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1, -1, -1, -1}, new double[] { 275.13540,   0.00022,     0.070}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1, -1, -1,  1}, new double[] {  95.12714,   0.00001,     0.080}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1, -1,  0, -1}, new double[] {  95.13243,   0.00041,     0.949}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1, -1,  0,  1}, new double[] {  95.13161,   0.00001,     0.039}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1, -1,  1, -1}, new double[] {  95.13406,   0.00052,     0.082}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1, -1,  1,  1}, new double[] {  95.13228,   0.00005,     0.026}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1, -1,  2, -1}, new double[] {  95.13425,   0.00006,     0.039}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0, -4, -1}, new double[] {  95.13456,   0.00002,     0.019}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0, -3, -1}, new double[] {  95.13463,   0.00029,     0.025}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0, -3,  1}, new double[] { 275.13107,   0.00002,     0.077}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0, -2, -3}, new double[] { 275.13460,   0.00003,     0.019}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0, -2, -1}, new double[] {  95.13465,   0.00410,     0.038}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0, -2,  1}, new double[] { 275.13112,   0.00042,     3.575}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0, -1, -3}, new double[] { 275.13461,   0.00018,     0.025}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0, -1, -1}, new double[] {  95.13459,   0.06174,     0.075}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0, -1,  0}, new double[] {  77.02181,   0.00001,     8.850}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0, -1,  1}, new double[] {  95.13157,   0.00858,     0.074}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0, -1,  3}, new double[] { 275.13186,   0.00003,     0.025}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0,  0, -3}, new double[] { 275.13472,   0.00047,     0.037}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0,  0, -1}, new double[] {  95.13523,   0.28938,    18.600}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0,  0,  1}, new double[] {  95.13225,   0.06154,     0.037}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0,  0,  3}, new double[] { 275.13228,   0.00013,     0.019}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0,  1, -3}, new double[] {  95.13641,   0.00003,     0.073}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0,  1, -1}, new double[] {  95.13453,   0.06245,     0.076}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0,  1,  1}, new double[] {  95.13221,   0.00661,     0.025}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0,  1,  3}, new double[] { 275.13228,   0.00003,     0.015}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0,  2, -1}, new double[] {  95.13449,   0.00432,     0.038}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0,  2,  1}, new double[] {  95.13217,   0.00057,     0.019}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0,  3, -1}, new double[] {  95.13450,   0.00031,     0.025}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0,  3,  1}, new double[] {  95.13220,   0.00005,     0.015}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  0,  4, -1}, new double[] {  95.13456,   0.00002,     0.019}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  1, -2, -1}, new double[] {  95.13498,   0.00004,     0.039}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  1, -1, -1}, new double[] {  95.13560,   0.00028,     0.081}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  1,  0, -1}, new double[] { 275.13212,   0.00046,     1.057}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  1,  0,  1}, new double[] { 275.13248,   0.00006,     0.036}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  1,  1, -1}, new double[] { 275.13400,   0.00039,     0.070}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  1,  1,  1}, new double[] { 275.13228,   0.00004,     0.024}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  1,  1,  2, -1}, new double[] { 275.13424,   0.00005,     0.036}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  2,  0,  0, -1}, new double[] { 275.13319,   0.00031,     0.081}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  2,  0,  0,  1}, new double[] { 275.13228,   0.00004,     0.026}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  2,  0,  1, -1}, new double[] { 275.13381,   0.00005,     0.039}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  2,  1,  0, -1}, new double[] {  95.13229,   0.00005,     0.075}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3, -2,  0, -1}, new double[] {  95.13429,   0.00002,     0.044}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3, -1, -2, -1}, new double[] { 275.13445,   0.00003,     0.354}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3, -1, -1, -1}, new double[] { 275.13432,   0.00022,     0.096}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3, -1, -1,  1}, new double[] {  95.13228,   0.00006,     0.027}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3, -1,  0, -1}, new double[] {  95.13417,   0.00036,     0.042}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3, -1,  0,  1}, new double[] {  95.13228,   0.00006,     0.020}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3, -1,  1, -1}, new double[] {  95.13427,   0.00008,     0.027}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3, -1,  1,  1}, new double[] {  95.13228,   0.00001,     0.016}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0, -3, -1}, new double[] { 275.13456,   0.00008,     0.066}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0, -2, -1}, new double[] { 275.13455,   0.00079,     0.547}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0, -2,  1}, new double[] {  95.13166,   0.00011,     0.040}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0, -1, -1}, new double[] { 275.13441,   0.00465,     0.088}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0, -1,  1}, new double[] {  95.13223,   0.00143,     0.026}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0,  0, -3}, new double[] {  95.13505,   0.00003,     0.463}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0,  0, -1}, new double[] {  95.13395,   0.00582,     0.041}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0,  0,  1}, new double[] {  95.13223,   0.00084,     0.019}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0,  1, -3}, new double[] { 275.13558,   0.00001,     0.090}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0,  1, -1}, new double[] {  95.13416,   0.00106,     0.026}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0,  1,  1}, new double[] {  95.13218,   0.00014,     0.015}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0,  2, -1}, new double[] {  95.13424,   0.00012,     0.020}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0,  2,  1}, new double[] {  95.13228,   0.00002,     0.013}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  0,  3, -1}, new double[] {  95.13428,   0.00001,     0.016}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  1, -1, -1}, new double[] {  95.13319,   0.00007,     0.080}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  1, -1,  1}, new double[] { 275.13228,   0.00001,     0.025}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  1,  0, -1}, new double[] { 275.13349,   0.00008,     0.039}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  3,  1,  1, -1}, new double[] { 275.13385,   0.00002,     0.026}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  5,  0, -2, -1}, new double[] { 275.13439,   0.00006,     0.044}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  5,  0, -2,  1}, new double[] {  95.13228,   0.00003,     0.020}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  5,  0, -1, -1}, new double[] {  95.13346,   0.00007,     0.028}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  5,  0, -1,  1}, new double[] {  95.13228,   0.00003,     0.016}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  5,  0,  0, -1}, new double[] {  95.13387,   0.00007,     0.020}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  5,  0,  0,  1}, new double[] {  95.13228,   0.00001,     0.013}),
		new Elp2000Set3 (new int[] {  0,  0,  1,  0,  0,  0,  0,  5,  0,  1, -1}, new double[] {  95.13402,   0.00002,     0.016}),
		new Elp2000Set3 (new int[] {  0,  8,-13,  0,  0,  0,  0, -2,  0,  0,  0}, new double[] { 234.68628,   0.00001,     0.040}),
		new Elp2000Set3 (new int[] {  0,  8,-13,  0,  0,  0,  0, -2,  0,  1,  0}, new double[] { 234.68866,   0.00002,     0.087}),
		new Elp2000Set3 (new int[] {  0,  8,-13,  0,  0,  0,  0,  0,  0, -1,  0}, new double[] { 234.67572,   0.00003,     0.075}),
		new Elp2000Set3 (new int[] {  0,  8,-13,  0,  0,  0,  0,  0,  0,  0,  0}, new double[] { 234.68884,   0.00014,   238.919}),
		new Elp2000Set3 (new int[] {  0,  8,-13,  0,  0,  0,  0,  0,  0,  1,  0}, new double[] { 234.67574,   0.00003,     0.075}),
		new Elp2000Set3 (new int[] {  0,  8,-13,  0,  0,  0,  0,  2,  0, -1,  0}, new double[] { 234.68887,   0.00002,     0.087}),
		new Elp2000Set3 (new int[] {  0,  8,-13,  0,  0,  0,  0,  2,  0,  0,  0}, new double[] { 234.68643,   0.00001,     0.040})
	};
}