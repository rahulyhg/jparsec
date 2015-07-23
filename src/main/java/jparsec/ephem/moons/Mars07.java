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
package jparsec.ephem.moons;

import jparsec.math.*;
import jparsec.util.JPARSECException;

/**
 * An implementation of the martian moons ephemerides using Lainey et al. 2007 theory.<P>
 * 
 * Reference: Lainey, V., Dehant, V. and Paetzold, M. "First numerical ephemerides of the Martian moons", 
 * Astron. Astrophys., vol 465 pp.1075-1084	(2007).
 */
public class Mars07 
{
	// private constructor so that this class cannot be instantiated.
	private Mars07() {}

	/**
	 * For unit testing only.
	 * @param args Not used.
	 */
	public static void main(String args[])
	{
		System.out.println("Mars07 test");

		try {
			double jd = 2451605.00;
			double pos[] = Mars07.getMoonPosition(jd, 1, true);
			for (int i=0; i<pos.length; i++)
			{
				System.out.println(pos[i]);
			}
// Should be	
// 2451605.00   0.000033910062 -0.000038516526 -0.000037325256  0.000870900873  0.000850538844 -0.000068951380
		
			System.out.println("");
			pos = Mars07.getMoonPosition(jd, 2, true);
			for (int i=0; i<pos.length; i++)
			{
				System.out.println(pos[i]);
			}
// Should be	
// -0.000088636495  0.000087252940  0.000095540292 -0.000534197094 -0.000568224917  0.000023172689
		} catch (Exception exc) {
			exc.printStackTrace();
		}
	}
	
	/**
	 * This method delivers the ephemerides of the Martian moons.
	 * It is based on a numerical model fitted to observations dispatched
	 * from 1877 to 2005. The expected accuracy of these ephemerides 
	 * is around 500 meters for the period [1998:2010], and few kilometers 
	 * for the period [1967:2020].<P>
	 * There are no explicit time limit in the use of this subroutine.
	 * However we DO NOT recommend its use outside the period [1877-2025].
	 * More details are available in (Lainey, Dehant, Patzold, 2007).
	 * 
	 * @param ET Ephemeris time, TDB.
	 * @param target Satellite, from 1 (Phobos) to 2 (Deimos).
	 * @param positions Select the output type. True to get rectangular positions, false
	 * for orbital elements.
	 * @return The output elements/positions. Angles in radians, positions in AU 
	 * (mean equatorial J2000).
	 * @throws JPARSECException If the target is invalid.
	 */
	public static double[] getMoonPosition(double ET, int target, boolean positions) throws JPARSECException
	{
		int nsat = target - 1;
		if (nsat < 0 || nsat > 1) throw new JPARSECException("Invalid target.");
		
		double gk2 = Math.pow(Constant.EARTH_MEAN_ORBIT_RATE, 2), 
	     	enrad=0.017453292519943;
		double ELEM[] = new double[6];
		double L[] = new double[] {19.7020556283139, 4.9770138896523};
		double XV[] = new double[6];
		double MU[] = new double[] {3.2271557149889E-07, 3.2271556750209E-07};
		
		double ACC[] = new double[] {1.657852042683113e-10, -2.331793571572226e-14};
		int nf1[] = new int[] {33, 57, 28, 29};
		int nf2[] = new int[] {50, 30, 17, 28};
		int nf[] = new int[4];
		
		double EL1Aa[] = new double[] {0.00006269161880, 0.00000000226877, 
			     0.00000000226877, 0.00000000036560, 0.00000000036560,
			     0.00000000038928, 0.00000000038928, 0.00000000017647,
			     0.00000000017647, 0.00000000010473, 0.00000000010473, 
			     0.00000000004570, 0.00000000004570, 0.00000000003102,
			     0.00000000003102, 0.00000000002648, 0.00000000002648,
			     0.00000000000906, 0.00000000000906, 0.00000000000782,
			     0.00000000000782, 0.00000000000768, 0.00000000000768,
			     0.00000000000652, 0.00000000000652, 0.00000000000831,
			     0.00000000000831, 0.00000000000664, 0.00000000000664,
			     0.00000000000428, 0.00000000000428, 0.00000000000362, 
			     0.00000000000362};
		double EL1La[] = new double[] {2.09129739264173, 0.00005016848130, 
			     0.00005016848130, 0.00003350264970, 0.00003350264903,
			     0.00002827839093, 0.00002827839093, 0.00001578862428,
			     0.00001578862427, 0.00001504422160, 0.00001504422160,
			     0.00000817856317, 0.00000817856334, 0.00001022163922,
			     0.00001022163922, 0.00000651695172, 0.00000651695172,
			     0.00000506658494, 0.00000506658494, 0.00000374173438,
			     0.00000374173438, 0.00000258935939, 0.00000258935939,
			     0.00000112514742, 0.00000112514742, 0.00000076176630,
			     0.00000076176630, 0.00000049765123, 0.00000049765123,
			     0.00000068419668, 0.00000068419668, 0.00000056243429,
			     0.00000056243429, 0.00000039367057, 0.00000039367057,
			     0.00000052032286, 0.00000052032286, 0.00000035833947,
			     0.00000035833947, 0.00000030110114, 0.00000030110114,
			     0.00000019649769, 0.00000019649645, 0.00000024936539,
			     0.00000024936539, 0.00000024024140, 0.00000024024140,
			     0.00000017471331, 0.00000017471331, 0.00000017930767,
			     0.00000017930768, 0.00000013268776, 0.00000013268776,
			     0.00000012696364, 0.00000012696364, 0.00000012547154,
			     0.00000012547155};
		double EL1Za[] = new double[] {0.01514110912521,0.00038496208674,
			     0.00006903413242,0.00004946101994,0.00003671320788,
			     0.00003267983782,0.00000875048305,0.00000617093881,
			     0.00000695700594,0.00000573408896,0.00000343157786,
			     0.00000403740951,0.00000211529622,0.00000190482762,
			     0.00000084613232,0.00000086960947,0.00000063298682,
			     0.00000061303178,0.00000057372171,0.00000081810883,
			     0.00000074341453,0.00000054416478,0.00000050445150,
			     0.00000042845991,0.00000042249373,0.00000035819498,
			     0.00000038088812,0.00000040557392};
		double EL1ZETAa[] = new double[] {0.00940860518312,0.00007892894454,
			     0.00005699538102,0.00002474369483,0.00002062715397,
			     0.00000594557416,0.00000392019020,0.00000216779197,
			     0.00000276976375,0.00000181353917,0.00000108342918,
			     0.00000106665701,0.00000079098533,0.00000088808851,
			     0.00000055207589,0.00000043978860,0.00000045836091,
			     0.00000035331311,0.00000035029885,0.00000038288517,
			     0.00000027112473,0.00000019917454,0.00000020368977,
			     0.00000017267796,0.00000015744728,0.00000016985677,
			     0.00000010150045,0.00000008259149,0.00000008504923};
		double EL1Ap[] = new double[] {0.00000000,-0.23137652, 0.23137652,
			     0.31903311,-0.31903311,-0.15425102, 0.15425102,
			     0.46275305,-0.46275305,-0.13411243, 0.13411243,
			     0.11568826,-0.11568826,-0.84211324, 0.84211324,
			     0.10397809,-0.10397809, 0.15952911,-0.15952911,
			     0.10875357,-0.10875357, 0.29864398,-0.29864398,
			     -0.18884134, 0.18884134, 0.15951656,-0.15951656,
			     0.84383237,-0.84383237,-0.15939353, 0.15939353,
			     -0.10628011, 0.10628011};
		double EL1Lp[] = new double[] {0.00000000, 686.99369592, -686.99369241,
			     -4077.46840757,   4077.46821917,   -343.48537930,   
			     343.48537949,    826.22438660,   -826.22438999,     
			     0.23137650,     -0.23137650,   2026.08615872,  
			     -2026.08614258,     -0.31903309,      0.31903309,   
			     228.99331848,   -228.99331849,      0.46275300,    
			     -0.46275300,      0.15425100,     -0.15425100,  
			     -242.61956612,    242.61956592,   -171.74597329,   
			     171.74597310,      0.13411241,     -0.13411241,  
			     -375.12500185,    375.12500278,   -413.26245099,   
			     413.26245103,    179.29817450,   -179.29817450,    
			     -1.02723078,      1.02723078,     -0.11568825,     
			     0.11568825,      0.84211307,     -0.84211307,    
			     -4.78104120,      4.78104120,  -8341.85985545,  
			     8341.72443362,      0.15952910,     -0.15952910,    
			     -0.10397808,      0.10397808,   -137.39750245,   
			     137.39750251,   1035.39217901,  -1035.39219300,     
			     0.15951654,     -0.15951654,     -0.18884132,     
			     0.18884132,   -513.09805470,    513.09805450};
		double EL1Zp[] = new double[] {827.21507332, 0.31891012, 587.39458533,  
			     -826.16172371,      0.13409069,     -0.84297139,    
			      0.15948580,      1.02595676,      0.10396503,   
			     316.64130873,      0.18879824,     -0.29875184, 
			      4054.54269012,     -0.10629376,      0.00000000,   
			      -0.12164857,    686.47877752,    375.32150909, 
			     -4052.07162766,      0.23131182,    216.74351242,   
			      -0.23144126,     -0.13798985,     -0.31920648,   
			      -0.18154621,    242.67861994,   1035.98671884,  
			      2043.26880788};
		double EL1ZETAp[] = new double[] {-826.20642714,0.00000000,-686.99749665,  
			      343.48630483,    827.20268346,    228.99362064,   
				     687.00755782,   -343.48244903,     -0.84297139,      
				     0.15942429,      0.31891012,    171.74558971,   
				     242.62779510,     -4.75353965,      1.02595676,     
				     0.13409069,   -228.99359936,   -374.99999997,  
				     4073.32789493,      0.51266007,    587.77857598, 
				      -242.62375723,    179.29612278,      0.23144134,   
				      -0.29875184,    137.41607584,      0.18879824,    
				     -0.31890996,  -1028.57142835};
		double EL1Af[] = new double[] {0.000000000000, 1.269694941721,
			     -1.269694972385, 0.683991069326,-0.683991048830,
			     1.769154106463,-1.769154016711,-0.751833721919,
			     0.751833534661, 0.582878090440,-0.582877938274,
			     -2.055123065092, 2.055123107938,-1.167907572776,
			     1.167907593259,-1.085910468998, 1.085910738159,
			     -1.123139908698, 1.123139843925, 2.223276867087,
			     -2.223277592714, 0.692161581064,-0.692161667059,
			     0.067382573233,-0.067382536015, 1.368231513583,
			     -1.368231474439, 0.260153915930,-0.260153924005,
			     -0.059038385412, 0.059038528330, 0.103874462974,
			     -0.103874462966};
		double EL1Lf[] = new double[] {-0.000000000014, -0.949015738908, 
			     0.949016158884, -0.380534526596,  0.380533948496,
			     0.994821588644, -0.994821497820, -2.870499589128, 
			     2.870499308383, -2.834185436330,  2.834185466290, 
			     0.919444544403, -0.919444319278,  0.895559796633,
			     -0.895559859111,  2.848996739890, -2.848996748767,
			     -2.328774139340,  2.328774139340,  2.912659020395,
			     -2.912659547077,  2.215327142355, -2.215327333708,
			     -0.377627161385,  0.377626798556, -2.161248941800, 
			     2.161248590720, -1.231836210236,  1.231836585135,
			     -2.488083095032,  2.488083105051,  1.576141879515,
			     -1.576141881804,  0.137856626591, -0.137856591483,
			     -2.626756099135,  2.626756111094,  2.759579592331,
			     -2.759579510413,  0.277512180092, -0.277511887506,
			     -0.093530900566,  0.093432654525,  0.430292851332,
			     -0.430292825369,  2.695745393985, -2.695745301579, 
			     2.099637656810, -2.099637491253, -0.693740926999, 
			     0.693740188061, -0.220489234489,  0.220488707822, 
			     1.654303228826, -1.654303208682,  1.546722735399, 
			     -1.546722718402};
		double EL1Zf[] = new double[] {1.404382124885,  2.088385523034, 
			     -2.387807946031,  0.498957209475,  0.821521022172, 
			     -2.905108919700,  2.772375719698,  2.839303414769,  
			     0.318450317043,  1.410329121503,  1.336796551701,
			     -2.429538561192,  0.254706736621,  1.508224230072, 
			     2.321836603108,  0.034626075514, -3.084529992972,
			     -1.119230636263,  0.780393743699, -3.018597072641,
			     -1.071855877472,  2.691716763490,  1.001733960626, 
			     -3.071035704337, -2.137527057619, -1.219306169725, 
			     2.558639707373, -0.990686281624};
		double EL1ZETAf[] = new double[] {2.058107128488, -2.386965958787, 
			     -3.034328817803, -1.725904319907, -0.169761953966, 
			     2.067112903892,  1.700689207004, -2.706125953253,
			     -1.342900415409,  2.117885747855,  0.517605536523,
			     -0.418936524968, -3.042493138839,  0.757075199434, 
			     0.660891079606, -0.763516173091, -0.439185212306,
			     -1.680429911951,  2.685649467156, -2.930008429370, 
			     2.556761413073, -1.660815588764,  0.749769089433,
			     -2.317979704428, -1.539326818938, -2.877315237045, 
			     0.374238084921,  1.374678754422,  1.140160118874};
		
		double EL2Aa[] = new double[] {0.00015681340867,  0.00000000269918, 
			     0.00000000269918,  0.00000000035476,  0.00000000035476, 
			       0.00000000018689,  0.00000000018689,  0.00000000011687, 
			       0.00000000011687,  0.00000000008485,  0.00000000008485, 
			       0.00000000002657,  0.00000000002657,  0.00000000003523, 
			       0.00000000003523,  0.00000000002117,  0.00000000002117,  
			      0.00000000001407,  0.00000000001407,  0.00000000001275,  
			      0.00000000001275,  0.00000000000838,  0.00000000000838,  
			      0.00000000000486,  0.00000000000486,  0.00000000000476, 
			       0.00000000000476,  0.00000000000487,  0.00000000000487, 
			       0.00000000000514,  0.00000000000514,  0.00000000000334, 
			       0.00000000000334,  0.00000000000344,  0.00000000000344, 
			       0.00000000000310,  0.00000000000310,  0.00000000000268, 
			       0.00000000000268,  0.00000000000168,  0.00000000000168, 
			       0.00000000000146,  0.00000000000146,  0.00000000000149, 
			       0.00000000000149,  0.00000000000132,  0.00000000000132, 
			       0.00000000000102,  0.00000000000102,  0.00000000000109};
		double EL2La[] = new double[] {1.91675212352556,   0.00248303166019,   
			      0.00248303165949,   0.00020234269782,   0.00020234269782,   
			      0.00010431675642,   0.00010431675643,   0.00008185668873,   
			      0.00008185668873,   0.00002410335710,   0.00002410335710,   
			      0.00001497066023,   0.00001497066034,   0.00000568514429,   
			      0.00000568514429,   0.00000417530493,   0.00000417530493,   
			      0.00000438325450,   0.00000438325450,   0.00000415808821,   
			      0.00000415808821,   0.00000322379379,   0.00000322379379,   
			      0.00000396334370,   0.00000396334370,   0.00000390506421,   
			      0.00000311780183,   0.00000390506421,   0.00000311780183,   
			      0.00000165754846};
		double EL2Za[] = new double[] {0.00027441315346,   0.00006015912711,  
			       0.00003534984782,   0.00003614585349,   0.00002577157903,   
				      0.00000680199783,   0.00000445297914,   0.00000223848292,   
				      0.00000092341709,   0.00000147874757,   0.00000145772004,   
				      0.00000134703031,   0.00000075381791,   0.00000087162297,   
				      0.00000101564888,   0.00000050909893,   0.00000065370775};
		double EL2ZETAa[] = new double[] {0.01562693319959,  0.00775101287565,  
			      0.00013218186311,  0.00003833652719,  0.00002660211842, 
			       0.00002882438535,  0.00002713213911,  0.00000929632495,  
			      0.00000446096029,  0.00000490415603,  0.00000236688115,  
			      0.00000205755285,  0.00000236575014,  0.00000122881444,  
			      0.00000121518946,  0.00000096028570,  0.00000117447177,  
			      0.00000105844105,  0.00000238314749,  0.00000076563038,  
			      0.00000040758243,  0.00000049623409,  0.00000030030779,  
			      0.00000026134164,  0.00000028919452,  0.00000022137882,  
			      0.00000024499503,  0.00000016524166};
		double EL2Ap[] = new double[] {0.00000000,    2.73847176,  -2.73847176, 
		         0.63238251,   -0.63238251,    1.82564784,   
			      -1.82564784,   -0.63296515,    0.63296515,    
			      5.47694352,   -5.47694352,    0.63354887,   -0.63354887, 
			         0.63122038,   -0.63122038,    0.63180092,   
			      -0.63180092,    2.73884829,   -2.73884829,   
			      -2.73809533,    2.73809533,    1.36923588,   
			      -1.36923588,   -0.63118038,    0.63118038,   
			       0.63064094,   -0.63064094,   -0.42669999,    
			      0.42669999,    0.63413367,   -0.63413367,    
			      2.34192368,   -2.34192368,    2.34247408,   -2.34247408, 
			         0.63236243,   -0.63236243,   -1.26252066,    
			      1.26252066,    0.63240258,   -0.63240258,   -1.82581518, 
			         1.82581518,    2.34219905,   -2.34219905,   
			      -1.82548053,    1.82548053,    0.63294504,   
			      -0.63294504,  2.72759910};
		double EL2Lp[] = new double[] {0.00000000,   -19925.25479395,    
			      19925.25482649,     -686.99361389,      686.99361415, 
		          -343.48525280,      343.48525251,        2.73847175,        
		     -2.73847175,     -228.99419233,      228.99419233,      
		     -337.66341441,      337.66341418,        5.47694261,       
		      -5.47694261,        1.82564754,       -1.82564754,   
		       10149.06972719,   -10149.06971679,      171.76869151,     
		      -171.76869151,      226.39849071,     -226.39849071,       
		      -0.63238250,        0.63238250,     -711.69825336,     
		      -663.85314762,      711.69825335,      663.85314763,        
		      0.00000000};
		double EL2Zp[] = new double[] {19956.74479178,       1.26244078,       
			      0.00000000,  -19926.60456897,       2.34219912,      
			      -1.26709782,       4.09222912,      -1.26943918,       
			      0.00000000,   26995.13970336,   16059.93520224,      
			       0.86409248,       0.42132977,     349.50296239,     
			       16.18594275,      -1.27178920,      -1.26244078};
		double EL2ZETAp[] = new double[] {-19916.19973129,       0.00000000,    
			       343.48730623,    -686.99215577,     687.01233091,     
				      228.99391436,   19892.53158003,     337.66474671,    
				      -343.48211159,     171.74656701,    -664.09364734,     
				      226.39163557,     711.55812043,    -337.66025169,     
				      349.52237555,  -10037.28889631,    -228.99413227,     
				      664.12627842,   37351.49200304,     137.38646249,     
				      170.59316073,       0.63120042,    -226.50126587,    
				      -705.59895012,     231.14050852,    -171.66458272,       
				      0.63238270,     692.28265851};
		double EL2Af[] = new double[] {0.000000000000,  -0.136381775523,   
			      0.136381777698,  -2.850380153005,   2.850380089315, 
			       -1.926604205693,   1.926604195461,   0.367583823079, 
			       -0.367583824486,   1.615243161942,  -1.615243160951,  
			       2.114704903813,  -2.114704908419,   0.939338838730,  
			      -0.939338816854,  -2.333690484620,   2.333690544274,  
			       2.089322500989,  -2.089322282950,  -0.779557024035,  
			       0.779557327338,   2.361851648242,  -2.361851691087,   
			     -2.770026814512,   2.770026952645,  -1.549662975963,   
			      1.549663021137,   3.024403974280,  -3.024403881041,   
			     -1.686885659588,   1.686885282544,   3.057688429345,   
			     -3.057688457348,  -0.829253165285,   0.829253093148,  
			      -1.954686031809,   1.954686103625,  -2.168321203999,   
			      2.168321557125,   2.516818643150,  -2.516818534200,  
			      -0.299782666734,   0.299782747411,   2.143143410577,  
			      -2.143143430348,   1.011403786810,  -1.011403745572,   
			      0.538228537741,  -0.538228903445,  -2.653997343428};
		double EL2Lf[] = new double[] {-3.141592653540,  -2.488175621789,   
			      2.488175634463,   0.946296042215,  -0.946295960274,   
			      1.001646985816,  -1.001647348657,   1.433490072350,   
			     -1.433489965321,  -2.852007788402,   2.852007788273,   
			      3.136008703144,  -3.136009000145,  -3.100668654449,   
			      3.100668633924,  -0.366003419529,   0.366003444013,   
			     -2.738313647435,   2.738313658144,   0.461419338359,   
			     -0.461419338359,   0.675422268593,  -0.675422268593,   
			      1.281544455534,  -1.281544458794,   1.797966683376,  
			      -0.222101391798,  -1.797966684284,   0.222101394466,   
			     -3.141592653523};
		double EL2Zf[] = new double[] {2.198649419514,  -1.916548788202,  
			       2.345230773944,   1.463816210370,   1.362467588064,  
			       0.933679289332,  -3.130753296830,  -1.549133813261,  
			       0.599042274749,  -0.546542453837,  -1.198239348674,  
			      -2.050414656408,   1.516439412109,   3.100618466711,  
			      -1.127752616215,   2.250768124831,  -2.860933968311};
		double EL2ZETAf[] = new double[] {2.981506933511, -2.386504179132, 
			      -1.725684412813, -3.035061242067,  1.701551338710,  
			      2.067662003165, -1.477858084701,  2.318788380092,  
			     -2.669604598165, -0.415374756507, -0.786669759362,  
			     -0.162822349334, -2.670796098338, -0.729022305245,  
			     -2.721699324043,  1.941975361869, -0.437940530420,  
			      1.821048365911,  0.758713545461, -2.990293668575, 
			      -2.517169198799, -0.535940350960,  1.724062868741, 
			      -1.853437577537,  0.865916190901,  2.259603352363,  
			      1.108725025984,  1.680391963791};
		double ELA[][] = new double[57][3];
		double ELL[][] = new double[57][3];
		double ELZ[][] = new double[57][3];
		double ELZETA[][] = new double[57][3];

		Complex RESULT;

		double ome0 = 47.68143, ainc0 = 37.1135;
		double dome = -0.1061, dainc = 0.0609;

		ET = ET - Constant.J2000;
	    double DAT=ET;
	    double DAT2=ET+6491.5; // retour a la date du 2445053.5 (25/03/1982, 0H00am)

	      if (nsat == 0) {
	    	  for (int i=0; i<4; i++)
	    	  {
	    		  nf[i]=nf1[i];
	    	  }
	    	  for (int i=0; i<nf[0]; i++)
	    	  {
		          ELA[i][0]=EL1Aa[i];
		          ELA[i][1]=EL1Ap[i];
		          ELA[i][2]=EL1Af[i];
	    	  }
	    	  for (int i=0; i<nf[1]; i++)
	    	  {
		          ELL[i][0]=EL1La[i];
		          ELL[i][1]=EL1Lp[i];
		          ELL[i][2]=EL1Lf[i];
	    	  }
	    	  for (int i=0; i<nf[2]; i++)
	    	  {
		          ELZ[i][0]=EL1Za[i];
		          ELZ[i][1]=EL1Zp[i];
		          ELZ[i][2]=EL1Zf[i];
	    	  }
	    	  for (int i=0; i<nf[3]; i++)
	    	  {
		          ELZETA[i][0]=EL1ZETAa[i];
		          ELZETA[i][1]=EL1ZETAp[i];
		          ELZETA[i][2]=EL1ZETAf[i];
	    	  }
	      } else {
	    	  for (int i=0; i<4; i++)
	    	  {
	    		  nf[i]=nf2[i];
	    	  }
	    	  for (int i=0; i<nf[0]; i++)
	    	  {
		          ELA[i][0]=EL2Aa[i];
		          ELA[i][1]=EL2Ap[i];
		          ELA[i][2]=EL2Af[i];
	    	  }
	    	  for (int i=0; i<nf[1]; i++)
	    	  {
		          ELL[i][0]=EL2La[i];
		          ELL[i][1]=EL2Lp[i];
		          ELL[i][2]=EL2Lf[i];
	    	  }
	    	  for (int i=0; i<nf[2]; i++)
	    	  {
		          ELZ[i][0]=EL2Za[i];
		          ELZ[i][1]=EL2Zp[i];
		          ELZ[i][2]=EL2Zf[i];
	    	  }
	    	  for (int i=0; i<nf[3]; i++)
	    	  {
		          ELZETA[i][0]=EL2ZETAa[i];
		          ELZETA[i][1]=EL2ZETAp[i];
		          ELZETA[i][2]=EL2ZETAf[i];
	    	  }
	      }

	      RESULT = new Complex(0.0, 0.0);
    	  for (int i=0; i<nf[0]; i++)
    	  {
	         if (ELA[i][1] == 0.) {
	            RESULT= (((new Complex(0.0, ELA[i][2])).exponential()).multiply(ELA[i][0])).add(RESULT);
	         } else {
	            RESULT = RESULT.add(((
	            		new Complex(0.0, (2.*Math.PI/ELA[i][1])*DAT2+ELA[i][2])
	            		).exponential()).multiply(ELA[i][0]));
	         }
    	  }
	      ELEM[0] = RESULT.real;

	      RESULT = new Complex(0.0, 0.0);
    	  for (int i=0; i<nf[1]; i++)
    	  {
 	         if (ELL[i][1] == 0.) {
 	            RESULT= (((new Complex(0.0, ELL[i][2])).exponential()).multiply(ELL[i][0])).add(RESULT);
 	         } else {
 	            RESULT = RESULT.add(((
 	            		new Complex(0.0, (2.*Math.PI/ELL[i][1])*DAT2+ELL[i][2])
 	            		).exponential()).multiply(ELL[i][0]));
 	         }
    	  }
	      ELEM[1] = RESULT.real;

	      RESULT = new Complex(0.0, 0.0);
    	  for (int i=0; i<nf[2]; i++)
    	  {
 	         if (ELZ[i][1] == 0.) {
 	            RESULT= (((new Complex(0.0, ELZ[i][2])).exponential()).multiply(ELZ[i][0])).add(RESULT);
 	         } else {
 	            RESULT = RESULT.add(((
 	            		new Complex(0.0, (2.*Math.PI/ELZ[i][1])*DAT2+ELZ[i][2])
 	            		).exponential()).multiply(ELZ[i][0]));
 	         }
    	  }
	      ELEM[2] = RESULT.real;
	      ELEM[3] = RESULT.imaginary;

	      RESULT = new Complex(0.0, 0.0);
    	  for (int i=0; i<nf[3]; i++)
    	  {
 	         if (ELZETA[i][1] == 0.) {
 	            RESULT= (((new Complex(0.0, ELZETA[i][2])).exponential()).multiply(ELZETA[i][0])).add(RESULT);
 	         } else {
 	            RESULT = RESULT.add(((
 	            		new Complex(0.0, (2.*Math.PI/ELZETA[i][1])*DAT2+ELZETA[i][2])
 	            		).exponential()).multiply(ELZETA[i][0]));
 	         }
    	  }
	      ELEM[4] = RESULT.real;
	      ELEM[5] = RESULT.imaginary;

	      ELEM[1] += L[nsat]*DAT2+ACC[nsat]*DAT2*DAT2;
	      ELEM[1] = Math.atan2(Math.sin(ELEM[1]), Math.cos(ELEM[1]));
	      if (ELEM[1] < 0.0) ELEM[1] += 2.*Math.PI;

	      if (positions) {
	        double xmu=MU[nsat]*gk2;
	        double ome=(ome0+dome*DAT/Constant.JULIAN_DAYS_PER_CENTURY)*enrad;
	        double ainc=(ainc0+dainc*DAT/Constant.JULIAN_DAYS_PER_CENTURY)*enrad;
	        XV = Mars07.ELEM2PV(xmu, ELEM);
	        ELEM[0]=XV[0]*Math.cos(ome)-XV[1]*Math.sin(ome)*Math.cos(ainc)
	       +XV[2]*Math.sin(ainc)*Math.sin(ome);
	        ELEM[1]=XV[0]*Math.sin(ome)+XV[1]*Math.cos(ome)*
	       Math.cos(ainc)-XV[2]*Math.sin(ainc)*Math.cos(ome);      
	        ELEM[2]=XV[1]*Math.sin(ainc)+XV[2]*Math.cos(ainc);
	        ELEM[3]=XV[3]*Math.cos(ome)-XV[4]*Math.sin(ome)*Math.cos(ainc)
	       +XV[5]*Math.sin(ainc)*Math.sin(ome);
	        ELEM[4]=XV[3]*Math.sin(ome)+XV[4]*Math.cos(ome)*
	       Math.cos(ainc)-XV[5]*Math.sin(ainc)*Math.cos(ome);      
	        ELEM[5]=XV[4]*Math.sin(ainc)+XV[5]*Math.cos(ainc);
	      }
	      
	      return ELEM;
	}
	
	private static double[] ELEM2PV(double MU, double ELEM[])
	{
	      double K, H, Q, P, A, AL, AN, EE, DE, CE, SE, DLE,
	      	RSAM1, ASR, PHI, PSI, X1, Y1, VX1, VY1, F2, P2, Q2, PQ; 
	      double XV[] = new double[6];
	      K=ELEM[2]; 
	      H=ELEM[3]; 
	      Q=ELEM[4]; 
	      P=ELEM[5]; 
	      A=ELEM[0]; 
	      AL=ELEM[1]; 
	      AN=Math.sqrt(MU/(A*A*A));
	      EE=AL+K*Math.sin(AL)-H*Math.cos(AL); 

	      do {
		      CE=Math.cos(EE); 
		      SE=Math.sin(EE) ;
		      DE=(AL-EE+K*SE-H*CE)/(1.-K*CE-H*SE); 
		      EE=EE+DE;
	      } while (Math.abs(DE) >= 1.0E-11);
	    	  
	      CE=Math.cos(EE);
	      SE=Math.sin(EE);
	      DLE=H*CE-K*SE; 
	      RSAM1=-K*CE-H*SE; 
	      ASR=1./(1.+RSAM1); 
	      PHI=Math.sqrt(1.-K*K-H*H); 
	      PSI=1./(1.+PHI);
	      X1=A*(CE-K-PSI*H*DLE); 
	      Y1=A*(SE-H+PSI*K*DLE);
	      VX1=AN*ASR*A*(-SE-PSI*H*RSAM1); 
	      VY1=AN*ASR*A*( CE+PSI*K*RSAM1);
	      F2=2.*Math.sqrt(1.-Q*Q-P*P); 
	      P2=1.-2.*P*P;
	      Q2=1.-2.*Q*Q;
	      PQ=2.*P*Q;
	      XV[0]=X1*P2+Y1*PQ; 
	      XV[1]=X1*PQ+Y1*Q2;
	      XV[2]=(Q*Y1-X1*P)*F2; 
	      XV[3]=VX1*P2+VY1*PQ;
	      XV[4]=VX1*PQ+VY1*Q2;
	      XV[5]=(Q*VY1-VX1*P)*F2; 
	      return XV;
	}
}
