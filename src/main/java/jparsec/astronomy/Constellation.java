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
package jparsec.astronomy;

import java.util.ArrayList;

import jparsec.ephem.EphemerisElement;
import jparsec.ephem.EphemerisElement.REDUCTION_METHOD;
import jparsec.ephem.Functions;
import jparsec.ephem.Precession;
import jparsec.ephem.Target.TARGET;
import jparsec.ephem.planets.EphemElement;
import jparsec.graph.DataSet;
import jparsec.graph.chartRendering.SkyRenderElement;
import jparsec.io.FileIO;
import jparsec.io.ReadFile;
import jparsec.math.Constant;
import jparsec.observer.LocationElement;
import jparsec.util.JPARSECException;

/**
 * This class contains methods to get the constellation corresponding to a
 * given equatorial position.
 * 
 * @author T. Alonso Albi - OAN (Spain)
 * @version 1.0
 */
public class Constellation
{
	// private constructor so that this class cannot be instantiated.
	private Constellation() {}
	
	/**
	 * Types of constellations names.
	 */
	public static enum CONSTELLATION_NAME {
		/** Symbolic constant for Latin constellation names. */
		LATIN,
		/** Symbolic constant for Spanish constellation names. */
		SPANISH,
		/** Symbolic constant for Spanish constellation names with alternative 
		 * names for some Zodiacal constellations. Gemelos is shown as 
		 * G�minis, for instance. */
		SPANISH_WITH_ALTERNATE_ZODIAC,
		/** Symbolic constant for abbreviated constellation names. */
		ABREVIATED,
		/** Symbolic constant for English constellation names. */
		ENGLISH
	};
	
	/**
	 * Latin constellation names for the array of limits.
	 */
	private static final String CONSTELLATION_NAMES_FOR_LIMITS[] =
	{ "Andromeda", "Antlia", "Apus", "Aquila", "Aquarius", "Aries", "Ara", "Auriga", "Bootes", "Caelum", "Camelopardalis", 
		"Cancer", "Capricornus", "Carina", "Cassiopeia", "Centaurus", "Cepheus", "Cetus", "Chamaeleon", "Circinus", "Canis Major", 
		"Canis Minor", "Cancer", "Columba", "Coma Berenices", "Corona Australis", "Corona Borealis", "Crater", "Crux", 
		"Corvus", "Canes Venatici", "Cygnus", "Delphinus", "Dorado", "Draco", "Equuleus", "Eridanus", "Fornax", "Gemini", 
		"Grus", "Hercules", "Horologium", "Hydra", "Hydrus", "Indus", "Lacerta", "Leo", "Lepus", "Libra", "Leo Minor", 
		"Lupus", "Lynx", "Lyra", "Mensa", "Microscopium", "Monoceros", "Musca", "Norma", "Octans", "Ophiuchus", "Orion", 
		"Pavo", "Pegasus", "Perseus", "Phoenix", "Pictor", "Piscis Austrinus", "Pisces", "Puppis", "Pyxis", "Reticulum", 
		"Sculptor", "Scorpius", "Scutum", "Serpens Caput", "Sextans", "Sagitta", "Sagittarius", "Taurus", "Telescopium", 
		"Triangulum Australe", "Triangulum", "Tucana", "Ursa Major", "Ursa Minor", "Vela", "Virgo", "Volans", "Vulpecula", 
		"Serpens Cauda"};

	private static final String CONSTELLATION_ABBREV_FOR_LIMITS[] = {
		"And", "Ant", "Aps", "Aql",	"Aqr", "Ari", "Ara", "Aur",	"Boo", "Cae", "Cam",
		"CnC", "Cap", "Car", "Cas", "Cen", "Cep", "Cet", "Cha", "Cir", "CMa",
		"CMi", "Cnc", "Col", "Com", "CrA", "CrB", "Crt", "Cru",
		"Crv", "CVn", "Cyg", "Del", "Dor", "Dra", "Equ", "Eri", "For", "Gem",
		"Gru", "Her", "Hor", "Hya", "Hyi", "Ind", "Lac", "Leo", "Lep", "Lib", "LMi",
		"Lup", "Lyn", "Lyr", "Men", "Mic", "Mon", "Mus", "Nor", "Oct", "Oph", "Ori",
		"Pav",  "Peg", "Per", "Phe", "Pic", "PsA", "Psc", "Pup", "Pyx", "Ret",
		"Scl", "Sco", "Sct", "Ser", "Sex", "Sge", "Sgr", "Tau", "Tel",
		"Tra", "Tri", "Tyc", "UMa", "UMi", "Vel", "Vir", "Vol", "Vul", 
		"Ser"};
	
	// Note Cancer is repeated, so we use here a public array corrected for this
	
	/**
	 * Latin constellation names, corresponding to the possible values of {@linkplain EphemElement#constellation}.
	 */
	public static final String CONSTELLATION_NAMES[] =
	{ "Andromeda", "Antlia", "Apus", "Aquila", "Aquarius", "Ara", "Aries", "Auriga", "Bootes", "Caelum", "Camelopardalis", 
		"Capricornus", "Carina", "Cassiopeia", "Centaurus", "Cepheus", "Cetus", "Chamaeleon", "Circinus", "Canis Major", 
		"Canis Minor", "Cancer", "Columba", "Coma Berenices", "Corona Australis", "Corona Borealis", "Crater", "Crux", 
		"Corvus", "Canes Venatici", "Cygnus", "Delphinus", "Dorado", "Draco", "Equuleus", "Eridanus", "Fornax", "Gemini", 
		"Grus", "Hercules", "Horologium", "Hydra", "Hydrus", "Indus", "Lacerta", "Leo", "Lepus", "Libra", "Leo Minor", 
		"Lupus", "Lynx", "Lyra", "Mensa", "Microscopium", "Monoceros", "Musca", "Norma", "Octans", "Ophiuchus", "Orion", 
		"Pavo", "Pegasus", "Perseus", "Phoenix", "Pictor", "Piscis Austrinus", "Pisces", "Puppis", "Pyxis", "Reticulum", 
		"Sculptor", "Scorpius", "Scutum", "Serpens Caput", "Serpens Cauda", "Sextans", "Sagitta", "Sagittarius", "Taurus", 
		"Telescopium", "Triangulum Australe", "Triangulum", "Tucana", "Ursa Major", "Ursa Minor", "Vela", "Virgo", "Volans", 
		"Vulpecula"};


	/*
	 * Table of constellation boundaries. Roman, Nancy Grace, "Identification of
	 * a Constellation from a Position" Pub. Astron. Soc. Pac. 99, 695, (1987)
	 * Array items are Lower Right Ascension, Upper Right Ascension, both in
	 * units of seconds of time; Lower Declination, in units of arcseconds; and
	 * array index of constellation name.
	 */
	private static final int NBNDRIES = 357;

	private static final int BOUNDARIES[] =
	{ 0, 86400, 316800, 84, 28800, 52200, 311400, 84, 75600, 82800, 310200, 84, 64800, 75600, 309600, 84, 0, 28800,
			306000, 16, 33000, 38400, 295200, 10, 0, 18000, 288000, 16, 38400, 52200, 288000, 10, 63000, 64800, 288000,
			84, 72600, 75600, 288000, 34, 0, 12630, 277200, 16, 41400, 48900, 277200, 10, 59520, 63000, 270000, 84,
			72600, 74400, 270000, 16, 28680, 33000, 264600, 10, 33000, 40800, 264600, 34, 46800, 59520, 252000, 84,
			11160, 12300, 244800, 14, 73500, 74400, 241200, 34, 40800, 43200, 239400, 34, 0, 1200, 237600, 16, 50400,
			56400, 237600, 84, 84900, 86400, 237600, 16, 43200, 48600, 230400, 34, 48600, 51900, 226800, 34, 83400,
			84900, 226800, 16, 21960, 25200, 223200, 10, 72000, 73500, 221400, 34, 73932, 74160, 219300, 16, 25200,
			28680, 216000, 10, 28680, 30300, 216000, 83, 71160, 72000, 214200, 34, 72000, 73932, 214200, 16, 82320,
			83400, 212700, 16, 0, 8760, 210600, 14, 69900, 71160, 208800, 34, 6120, 6870, 207000, 14, 8760, 11160,
			205200, 14, 11160, 11400, 205200, 10, 80340, 82320, 202500, 16, 18000, 21960, 201600, 10, 50520, 51900,
			199800, 83, 51900, 69900, 199800, 34, 11400, 12000, 198000, 10, 79680, 80340, 198000, 16, 74160, 79080,
			197400, 16, 0, 6120, 194400, 14, 21960, 23400, 194400, 51, 43500, 48600, 190800, 83, 54900, 56700, 190800,
			34, 79080, 79680, 189900, 16, 12000, 18000, 189000, 10, 82320, 84000, 189000, 14, 56700, 61200, 185400, 34,
			7350, 9060, 181800, 63, 61200, 65640, 181800, 34, 0, 4920, 180000, 14, 4920, 6000, 180000, 63, 23400,
			24480, 180000, 51, 84000, 86400, 180000, 14, 48600, 50520, 174600, 83, 0, 4020, 172800, 14, 84900, 86400,
			172800, 14, 65430, 65640, 171000, 40, 65640, 68700, 171000, 34, 68700, 69000, 171000, 31, 6000, 7350,
			169200, 63, 30300, 33000, 169200, 83, 600, 3120, 165600, 14, 43200, 43500, 162000, 83, 24480, 26520,
			160200, 51, 78870, 79080, 158400, 31, 78750, 78870, 157500, 31, 69000, 69840, 156600, 31, 33000, 36600,
			151200, 83, 36600, 38820, 144000, 83, 55560, 56700, 144000, 8, 56700, 58800, 144000, 40, 33300, 34500,
			143100, 51, 0, 9060, 132300, 0, 9060, 9240, 132300, 63, 69690, 69840, 131400, 52, 16200, 16890, 129600, 63,
			78240, 78750, 129600, 31, 78750, 79200, 129600, 45, 23520, 26520, 127800, 7, 26520, 27900, 127800, 51, 0,
			7200, 126000, 0, 79200, 82140, 126000, 45, 82140, 82320, 124200, 45, 82320, 84600, 124200, 0, 9240, 9780,
			122400, 63, 38820, 39600, 122400, 83, 43200, 44400, 122400, 30, 27900, 33300, 120600, 51, 33300, 35580,
			120600, 49, 2580, 5070, 118800, 0, 54660, 55560, 118800, 8, 84600, 85500, 115500, 0, 44400, 47700, 115200,
			30, 85500, 86400, 112800, 0, 50250, 50520, 110700, 30, 8700, 9780, 110400, 81, 9780, 16200, 110400, 63,
			16200, 17100, 108000, 7, 65430, 69690, 108000, 52, 39600, 43200, 104400, 83, 70800, 75300, 104400, 31,
			17100, 21180, 102600, 7, 35580, 37800, 102600, 49, 47700, 50250, 102600, 30, 0, 240, 100800, 0, 5070, 6000,
			100800, 81, 21180, 23520, 100800, 7, 28380, 28800, 100800, 38, 75300, 78240, 100800, 31, 69330, 70800,
			99000, 31, 6900, 8700, 98100, 81, 58200, 58800, 97200, 26, 54300, 54660, 93600, 8, 54660, 58200, 93600, 26,
			66120, 67920, 93600, 52, 38700, 39600, 91800, 49, 67920, 69330, 91800, 52, 6000, 6900, 90000, 81, 2580,
			3060, 85500, 67, 37800, 38700, 84600, 49, 76500, 77100, 84600, 88, 20520, 21180, 82200, 78, 240, 510,
			79200, 0, 57300, 57720, 79200, 74, 21180, 22380, 77400, 38, 71400, 72900, 76500, 88, 67920, 69300, 75900,
			88, 510, 3060, 75600, 0, 72900, 74040, 73800, 88, 28110, 28380, 72000, 38, 74040, 76500, 70200, 88, 69300,
			71400, 69000, 88, 11820, 12120, 68400, 5, 67920, 68400, 66600, 76, 20520, 20760, 64800, 60, 22380, 22710,
			63000, 38, 68400, 71400, 58200, 76, 17880, 19200, 57600, 78, 57300, 57900, 57600, 40, 71400, 72900, 56700,
			76, 16620, 17880, 55800, 78, 19200, 20160, 55800, 78, 46200, 48600, 54000, 24, 62100, 65700, 51600, 40,
			42720, 46200, 50400, 24, 27000, 28110, 48600, 38, 60300, 62100, 46200, 40, 0, 510, 45000, 62, 20160, 20760,
			45000, 78, 25200, 27000, 45000, 38, 76020, 76800, 45000, 62, 22710, 24960, 43200, 38, 65700, 67920, 43200,
			40, 75150, 75780, 42600, 32, 75780, 76020, 42600, 62, 41460, 42720, 39600, 46, 22470, 22710, 36000, 60,
			24960, 25200, 36000, 38, 28110, 28530, 36000, 22, 85800, 86400, 36000, 62, 6000, 11820, 35700, 5, 72510,
			73080, 30600, 32, 48600, 54300, 28800, 8, 81900, 85800, 27000, 62, 28530, 33300, 25200, 22, 33300, 38700,
			25200, 46, 65700, 67184, 22500, 59, 67184, 67920, 22500, 3, 75000, 75150, 21600, 32, 25200, 25260, 19800,
			21, 65700, 66330, 16200, 74, 57900, 60300, 14400, 40, 65700, 66330, 10800, 59, 77280, 78000, 9900, 62, 0,
			7200, 7200, 67, 66900, 67920, 7200, 74, 73080, 75000, 7200, 32, 75000, 76800, 7200, 35, 76800, 77280, 7200,
			62, 79200, 81900, 7200, 62, 78000, 79200, 6300, 62, 25260, 25920, 5400, 21, 12900, 16620, 0, 78, 16620,
			16800, 0, 60, 25920, 29100, 0, 21, 52800, 54300, 0, 86, 64200, 65700, 0, 59, 9540, 11820, -6300, 17, 11820,
			12900, -6300, 78, 54300, 58560, -11700, 74, 16800, 18300, -14400, 60, 21000, 22470, -14400, 60, 64200,
			64680, -14400, 74, 65700, 66900, -14400, 74, 66900, 67920, -14400, 3, 81900, 85800, -14400, 67, 38700,
			41460, -21600, 46, 41460, 42600, -21600, 86, 0, 1200, -25200, 67, 85800, 86400, -25200, 67, 51300, 52800,
			-28800, 86, 57300, 58560, -28800, 59, 72000, 73920, -32400, 3, 76800, 78720, -32400, 4, 61800, 64680,
			-36000, 59, 21000, 29100, -39600, 55, 17700, 18300, -39600, 36, 18300, 21000, -39600, 60, 29100, 30120,
			-39600, 42, 34500, 38700, -39600, 75, 42600, 46200, -39600, 86, 63300, 63600, -42000, 59, 67920, 72000,
			-43320, 3, 17400, 17700, -52200, 36, 73920, 76800, -54000, 4, 61800, 65700, -57600, 74, 65700, 67920,
			-57600, 73, 30120, 30900, -61200, 42, 58560, 58950, -65700, 59, 30900, 32700, -68400, 42, 38700, 39000,
			-68400, 27, 58560, 58950, -69300, 59, 56400, 57300, -72000, 48, 45300, 46200, -79200, 29, 46200, 51300,
			-79200, 86, 32700, 35100, -86400, 42, 6000, 9540, -87780, 17, 9540, 13500, -87780, 36, 39000, 42600,
			-88200, 27, 42600, 45300, -88200, 29, 51300, 53700, -88200, 48, 58560, 60300, -88500, 59, 0, 6000, -91800,
			17, 76800, 78720, -91800, 12, 78720, 85800, -91800, 4, 85800, 86400, -91800, 17, 35100, 36900, -95400, 42,
			16920, 17400, -98100, 36, 17400, 22020, -98100, 47, 72000, 76800, -100800, 12, 36900, 38100, -105000, 42,
			45300, 53700, -106200, 42, 53700, 56400, -106200, 48, 56400, 57600, -106200, 72, 16500, 16920, -108000, 36,
			60300, 63360, -108000, 59, 63360, 64200, -108000, 77, 38100, 39000, -112200, 42, 22020, 26520, -118800, 20,
			44100, 45300, -118800, 42, 39000, 44100, -126000, 42, 12600, 13500, -129600, 37, 30120, 33720, -132300, 69,
			15360, 16500, -133200, 36, 64200, 69000, -133200, 77, 76800, 82800, -133200, 66, 82800, 84000, -133200, 71,
			10800, 12600, -142500, 37, 33720, 39600, -143100, 1, 0, 6000, -144000, 71, 6000, 10800, -144000, 37, 13920,
			15360, -144000, 36, 84000, 86400, -144000, 71, 51000, 53700, -151200, 15, 56400, 57600, -151200, 50, 57600,
			59115, -151200, 72, 17400, 18000, -154800, 9, 18000, 23700, -154800, 23, 28800, 30120, -154800, 68, 12300,
			13920, -158400, 36, 59115, 64200, -163800, 72, 64200, 69000, -163800, 25, 69000, 73200, -163800, 77, 73200,
			76800, -163800, 54, 10800, 12300, -165600, 36, 16200, 17400, -167400, 9, 55200, 56400, -172800, 50, 0,
			8400, -173400, 64, 9600, 10800, -176400, 36, 14700, 15360, -176400, 41, 15360, 16200, -176400, 9, 76800,
			79200, -180000, 39, 21600, 28800, -182700, 68, 28800, 29400, -182700, 85, 8700, 9600, -183600, 36, 13800,
			14700, -183600, 41, 0, 6600, -185400, 64, 21600, 22200, -189000, 13, 29400, 30420, -190800, 85, 12600,
			13800, -191400, 41, 13800, 14400, -191400, 33, 0, 5700, -192600, 64, 7800, 8700, -194400, 36, 16200, 18000,
			-194400, 65, 54180, 55200, -194400, 50, 30420, 31800, -196200, 85, 22200, 23400, -198000, 13, 42600, 46200,
			-198000, 15, 51000, 54180, -198000, 50, 54180, 55200, -198000, 57, 14400, 15600, -203400, 33, 31800, 39600,
			-203400, 85, 39600, 40500, -203400, 15, 63000, 64800, -205200, 6, 64800, 73200, -205200, 79, 79200, 84000,
			-205200, 39, 11520, 12600, -207000, 41, 18000, 19800, -207000, 65, 23400, 24600, -208800, 13, 0, 4800,
			-210600, 64, 4800, 7800, -210600, 36, 84000, 86400, -210600, 64, 15600, 16500, -212400, 33, 55200, 59115,
			-216000, 57, 73200, 76800, -216000, 44, 19800, 21600, -219600, 65, 54600, 55200, -219600, 19, 59115, 59700,
			-219600, 6, 53700, 54600, -228900, 19, 59700, 60300, -228900, 6, 21600, 24600, -230400, 65, 24600, 32520,
			-230400, 13, 40500, 42600, -230400, 15, 42600, 46200, -230400, 28, 46200, 52320, -230400, 15, 48600, 49200,
			-234000, 19, 60300, 60600, -234000, 6, 7800, 11520, -243000, 41, 11520, 16500, -243000, 70, 53100, 53700,
			-243000, 19, 60600, 63000, -243000, 6, 63000, 64800, -243000, 61, 79200, 84000, -243000, 82, 16500, 23700,
			-252000, 33, 49200, 53100, -252000, 19, 53100, 61200, -252000, 80, 0, 4800, -270000, 82, 12600, 16500,
			-270000, 43, 23700, 32520, -270000, 87, 32520, 40500, -270000, 13, 40500, 49200, -270000, 56, 64800, 76800,
			-270000, 61, 76800, 84000, -270000, 44, 84000, 86400, -270000, 82, 2700, 4800, -273600, 82, 0, 12600,
			-297000, 43, 27600, 49200, -297000, 18, 49200, 64800, -297000, 2, 12600, 27600, -306000, 53, 0, 86400,
			-324000, 58 };

	/**
	 * Return the constellation name corresponding to a given mean equatorial
	 * position refered to certain epoch.
	 * <P>
	 * Roman, Nancy Grace, "Identification of a Constellation from a Position"
	 * Pub. Astron. Soc. Pac. 99, 695, (1987).
	 * <P>
	 * This method comes from software by S. L. Moshier.
	 * 
	 * @param ra Right ascension in radians.
	 * @param dec Declination in radians.
	 * @param epoch Reference epoch as a julian day.
	 * @param eph Ephemeris properties.
	 * @return Constellation Latin name.
	 * @throws JPARSECException If the calculation fails.
	 */
	public static String getConstellationName(double ra, double dec, double epoch, EphemerisElement eph)
			throws JPARSECException
	{
		return getConstellationName(new LocationElement(ra, dec, 1.0), epoch, eph);
	}

	/**
	 * Return the constellation name corresponding to a given mean equatorial
	 * position referred to certain epoch.
	 * <P>
	 * Roman, Nancy Grace, "Identification of a Constellation from a Position"
	 * Pub. Astron. Soc. Pac. 99, 695, (1987).
	 * <P>
	 * This method comes from software by S. L. Moshier.
	 * 
	 * @param loc Object position, should be mean astrometric referred to certain epoch.
	 * @param epoch Reference epoch as a Julian day.
	 * @param eph Ephemeris properties.
	 * @return Constellation Latin name.
	 * @throws JPARSECException If the calculation fails.
	 */
	public static String getConstellationName(LocationElement loc, double epoch, EphemerisElement eph)
			throws JPARSECException
	{
		int i, k;

		// double B1875 = Constant.B1900 + Constant.TROPICAL_YEAR * (1875.0 - 1900.0); // 2405889.25855 ...
		loc = LocationElement.parseRectangularCoordinatesFast(Precession.precess(epoch, 2405889.25855, LocationElement.parseLocationElementFast(loc), eph));
		double ra = loc.getLongitude();
		ra *= 43200.0 / Math.PI; // Constant.RAD_TO_ARCSEC / 15.0;
		double dec = loc.getLatitude() * Constant.RAD_TO_ARCSEC;

		/*
		 * FIND CONSTELLATION SUCH THAT THE DECLINATION ENTERED IS HIGHER THAN
		 * THE LOWER BOUNDARY OF THE CONSTELLATION WHEN THE UPPER AND LOWER
		 * RIGHT ASCENSIONS FOR THE CONSTELLATION BOUND THE ENTERED RIGHT
		 * ASCENSION
		 */
		for (i = 0; i < NBNDRIES; i++)
		{
			k = i << 2;
			if (ra >= BOUNDARIES[k] && ra < BOUNDARIES[k + 1] && dec > BOUNDARIES[k + 2])
			{
				k = BOUNDARIES[k + 3];
				if (k == 74 && Functions.normalizeRadians(loc.getLongitude()) > 17 / Constant.RAD_TO_HOUR) k = CONSTELLATION_NAMES_FOR_LIMITS.length-1;
				return (CONSTELLATION_NAMES_FOR_LIMITS[k]);
			}
		}

		throw new JPARSECException("constellation not found");
	}

	/**
	 * Return the constellation name corresponding to a given mean equatorial
	 * position referred to certain epoch.
	 * <P>
	 * Roman, Nancy Grace, "Identification of a Constellation from a Position"
	 * Pub. Astron. Soc. Pac. 99, 695, (1987).
	 * <P>
	 * This method comes from software by S. L. Moshier.
	 * 
	 * @param loc Object position, should be mean astrometric referred to certain epoch.
	 * @param epoch Reference epoch as a Julian day.
	 * @param eph Ephemeris properties.
	 * @return Constellation Latin name.
	 * @throws JPARSECException If the calculation fails.
	 */
	public static String getConstellationAbbreviation(LocationElement loc, double epoch, EphemerisElement eph)
			throws JPARSECException
	{
		int i, k;

		// double B1875 = Constant.B1900 + Constant.TROPICAL_YEAR * (1875.0 - 1900.0); // 2405889.25855 ...
		loc = LocationElement.parseRectangularCoordinatesFast(Precession.precess(epoch, 2405889.25855, LocationElement.parseLocationElementFast(loc), eph));
		double ra = loc.getLongitude();
		ra *= 43200.0 / Math.PI; // Constant.RAD_TO_ARCSEC / 15.0;
		double dec = loc.getLatitude() * Constant.RAD_TO_ARCSEC;

		/*
		 * FIND CONSTELLATION SUCH THAT THE DECLINATION ENTERED IS HIGHER THAN
		 * THE LOWER BOUNDARY OF THE CONSTELLATION WHEN THE UPPER AND LOWER
		 * RIGHT ASCENSIONS FOR THE CONSTELLATION BOUND THE ENTERED RIGHT
		 * ASCENSION
		 */
		for (i = 0; i < NBNDRIES; i++)
		{
			k = i << 2;
			if (ra >= BOUNDARIES[k] && ra < BOUNDARIES[k + 1] && dec > BOUNDARIES[k + 2])
			{
				k = BOUNDARIES[k + 3];
				if (k == 74 && Functions.normalizeRadians(loc.getLongitude()) > 17 / Constant.RAD_TO_HOUR) k = CONSTELLATION_ABBREV_FOR_LIMITS.length-1;
				return (CONSTELLATION_ABBREV_FOR_LIMITS[k]);
			}
		}

		throw new JPARSECException("constellation not found");
	}
	
	/**
	 * Gets the positions of the constellations for certain date.
	 * 
	 * @param jd Julian date. J2000 for catalog position.
	 * @param type_name Type of name, constants defined in this class.
	 *        Abbreviations by default.
	 * @throws JPARSECException If the method fails.
	 * @return Vector with three arrays: constellation names, constellation RA,
	 *         constellation DEC.
	 */
	public static ArrayList<Object> getConstellations(double jd, CONSTELLATION_NAME type_name) throws JPARSECException
	{
		ArrayList<String> v = ReadFile.readResource(FileIO.DATA_SKY_DIRECTORY + "connom.txt");

		String constel_name[] = new String[v.size()];
		double constel_ra[] = new double[v.size()];
		double constel_dec[] = new double[v.size()];

		for (int i = 0; i < v.size(); i++)
		{
			String line = v.get(i);
			double ra = DataSet.parseDouble(FileIO.getField(2, line, " ", true)) / Constant.RAD_TO_HOUR;
			double dec = DataSet.parseDouble(FileIO.getField(3, line, " ", true)) * Constant.DEG_TO_RAD;

			// Precession
			LocationElement loc = new LocationElement(ra, dec, 1.0);
			if (jd != Constant.J2000) {
				EphemerisElement eph = new EphemerisElement();
				eph.ephemMethod = REDUCTION_METHOD.IAU_2006;
				loc = LocationElement.parseRectangularCoordinates(Precession.precess(Constant.J2000, jd,
						LocationElement.parseLocationElement(loc), eph));
			}

			// Columns: 20-40 Latin name, 16-20 Abbrev, 40-> Spanish (2 naming version)
			String cons = null;
			switch (type_name) {
			case SPANISH_WITH_ALTERNATE_ZODIAC:
				cons = line.substring(62, 84).trim();
				break;
			case SPANISH:
				cons = line.substring(40, 62).trim();
				break;
			case LATIN:
				cons = line.substring(20, 40).trim();
				break;
			case ENGLISH:
				cons = line.substring(84).trim();
				break;
			case ABREVIATED:
				cons = line.substring(16, 20).trim();
				break;
			}

			constel_name[i] = cons;
			constel_ra[i] = loc.getLongitude();
			constel_dec[i] = loc.getLatitude();
		}

		ArrayList<Object> out = new ArrayList<Object>();
		out.add(constel_name);
		out.add(constel_ra);
		out.add(constel_dec);

		return out;
	}

	/**
	 * Gets the position of the center of a constellation for certain date.
	 * 
	 * @param cname Name of constellation to search.
	 * @param jd Julian date. J2000 for catalogue position.
	 * @param type_name Type of input name, constants defined in
	 *        SkyRenderElement. Abbreviations by default.
	 * @throws JPARSECException If the method fails.
	 * @see SkyRenderElement
	 * @return Right ascension and declination, or null object if not found.
	 */
	public static LocationElement getConstellationPosition(String cname, double jd, CONSTELLATION_NAME type_name)
			throws JPARSECException
	{
		ArrayList<Object> v = Constellation.getConstellations(jd, type_name);

		String constel_name[] = (String[]) v.get(0);
		double constel_ra[] = (double[]) v.get(1);
		double constel_dec[] = (double[]) v.get(2);

		LocationElement loc = null;
		String name = cname.toLowerCase();
		for (int i = 0; i < constel_name.length; i++)
		{
			if (constel_name[i].toLowerCase().indexOf(name) >= 0)
				loc = new LocationElement(constel_ra[i], constel_dec[i], 1.0);

			if (constel_name[i].toLowerCase().equals(name))
				break;
		}

		return loc;
	}

	private static ArrayList<String> v0 = null;
	/**
	 * Transforms a given constellation name into another language.
	 * @param name Constellation name (for Wester culture). Must be exactly equal
	 * to the output from other methods in this class, for a given language.
	 * @param output Output language.
	 * @return The constellation name for the output language.
	 * @throws JPARSECException If the constellation name cannot be found or there
	 * are more than one possible outputs.
	 */
	public static String getConstellation(String name, CONSTELLATION_NAME output) throws JPARSECException
	{
		if (v0 == null) v0 = ReadFile.readResource(FileIO.DATA_SKY_DIRECTORY + "connom.txt", ReadFile.ENCODING_ISO_8859);

		name = name.trim();
/*		ArrayList<String> v = new ArrayList<String>();
		for (int i=0; i<v0.size(); i++) {
			if (v0.get(i).indexOf(" "+name) >= 0) {
				v.add(v0.get(i));
				if (v0.get(i).indexOf(" "+name+" ") >= 0) break;
			}
		}
		
		if (v.size() == 0) throw new JPARSECException("Cannot find "+name+".");
		if (v.size() == 1) {
			String line = v.get(0);

			// Columns: 20-40 Latin name, 16-20 Abbrev, 40-> Spanish (2 naming version)
			String cons = null;
			switch (output) {
			case SPANISH_WITH_ALTERNATE_ZODIAC:
				cons = line.substring(62, 84).trim();
				break;
			case SPANISH:
				cons = line.substring(40, 62).trim();
				break;
			case LATIN:
				cons = line.substring(20, 40).trim();
				break;
			case ENGLISH:
				cons = line.substring(84).trim();
				break;
			case ABREVIATED:
				cons = line.substring(16, 20).trim();
				break;
			}
			return cons;
		}
*/		
		int s = v0.size();
		for (int i=0; i<s; i++) {
			String line = v0.get(i);
			if (line.indexOf(name) >= 0) {
				// Columns: 20-40 Latin name, 16-20 Abbrev, 40-> Spanish (2 naming version), 84 -> English name
				switch (output) {
				case SPANISH_WITH_ALTERNATE_ZODIAC:
					return line.substring(62, 84).trim();
				case SPANISH:
					return line.substring(40, 62).trim();
				case LATIN:
					return line.substring(20, 40).trim();
				case ENGLISH:
					return line.substring(84).trim();
				case ABREVIATED:
					return line.substring(16, 20).trim();
				}
			}
		}
		throw new JPARSECException("Cannot find "+name+".");
	}
	
	/**
	 * For unit testing only.
	 * @param args Not used.
	 */
	public static void main(String args[])
	{
		System.out.println("Constellation Test");

		EphemerisElement eph = new EphemerisElement(TARGET.NOT_A_PLANET, EphemerisElement.COORDINATES_TYPE.APPARENT,
				EphemerisElement.EQUINOX_OF_DATE, EphemerisElement.GEOCENTRIC, EphemerisElement.REDUCTION_METHOD.WILLIAMS_1994,
				EphemerisElement.FRAME.ICRF);

		try
		{
			double ra = 15.47 / Constant.RAD_TO_HOUR;
			double dec = 4.9 / Constant.RAD_TO_DEG;
			double epoch = Constant.J2000;
			
			LocationElement loc = new LocationElement(ra, dec, 1.0);
			String constel = Constellation.getConstellationName(ra, dec, epoch, eph);
			System.out.println("RA = " + Functions.formatRA(loc.getLongitude()) + " DEC = " + Functions.formatDEC(loc
					.getLatitude()) + " is in " + constel);
			// Serpens Caput
			System.out.println("   = " + Constellation.getConstellation(constel, CONSTELLATION_NAME.ENGLISH));

			ra = 17.49 / Constant.RAD_TO_HOUR;
			dec = -12.14 / Constant.RAD_TO_DEG;
			
			loc = new LocationElement(ra, dec, 1.0);
			constel = Constellation.getConstellationName(ra, dec, epoch, eph);
			System.out.println("RA = " + Functions.formatRA(loc.getLongitude()) + " DEC = " + Functions.formatDEC(loc
					.getLatitude()) + " is in " + constel);
			// Serpens Cauda
			
			System.out.println("   = " + Constellation.getConstellation(constel, CONSTELLATION_NAME.ENGLISH));

			// Complete list
			long t0 = System.currentTimeMillis();
			for (int i=0; i<CONSTELLATION_NAMES.length; i++) {
				String eng = Constellation.getConstellation(CONSTELLATION_NAMES[i], CONSTELLATION_NAME.ENGLISH);
				System.out.println(CONSTELLATION_NAMES[i] + " = " + eng + " = " + Constellation.getConstellation(eng, CONSTELLATION_NAME.SPANISH) + " = " + Constellation.getConstellation(eng, CONSTELLATION_NAME.ABREVIATED));
			}
			long t1 = System.currentTimeMillis();
			System.out.println("Time: "+(0.001f*(t1-t0)));
			
			String constell = Constellation.getConstellation(Constellation.getConstellationName(ra, dec, Constant.J2000,
					eph), CONSTELLATION_NAME.ABREVIATED);
			System.out.println(constell);
		} catch (JPARSECException ve)
		{
			JPARSECException.showException(ve);
		}
	}
}
