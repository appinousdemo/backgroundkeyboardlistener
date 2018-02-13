/*
 * Copyright 2011 Kristian Kraljic, Johannes Schüth 2008. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY KRISTIAN KRALJIC AND JOHANNES SCHLUETH ''AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL KRISTIAN KRALJIC AND JOHANNES SCHLUETH OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of Kristian Kraljic and Johannes Schüth.
 */

package de.ksquared.test.system.keyboard;

import java.util.ArrayList;

import de.ksquared.system.keyboard.GlobalKeyListener;
import de.ksquared.system.keyboard.KeyAdapter;
import de.ksquared.system.keyboard.KeyEvent;

public class KeyboardHookTest {
	public static void main(String[] args) {
		

		new GlobalKeyListener().addKeyListener(new KeyAdapter() {
			@Override public void keyPressed(KeyEvent event) 
			{ 
				ArrayList<String> a=new ArrayList<>();
				a.add(0,"Null character");
				a.add(1,"Start of Header");
				a.add(2,"Start of Text");
				a.add(3,"End of Text");
				a.add(4,"End of Transmission");
				a.add(5,"Enquiry");
				a.add(6,"Acknowledgement");
				a.add(7,"Bell");
				a.add(8,"Backspace");
				a.add(9,"Horizontal Tab");
				a.add(10,"Line feed");
				a.add(11,"Vertical Tab");
				a.add(12,"Form feed");
				a.add(13,"Carriage return");
				a.add(14,"Shift Out");
				a.add(15,"Shift In");
				a.add(16,"Data link escape");
				a.add(17,"Device control 1");
				a.add(18,"Device control 2");
				a.add(19,"Device control 3");
				a.add(20,"Device control 4");
				a.add(21,"Negative acknowledgement");
				a.add(22,"Synchronous idle");
				a.add(23,"End of transmission block");
				a.add(24,"Cancel");
				a.add(25,"End of medium");
				a.add(26,"Substitute");
				a.add(27,"Escape");
				a.add(28,"File separator");
				a.add(29,"Group separator");
				a.add(30,"Record separator");
				a.add(31,"Unit separator");
				a.add(32,"Space");
				a.add(33,"Exclamation mark");
				a.add(34,"Quotation mark ; quotes");
				a.add(35,"Number sign");
				a.add(36,"Dollar sign");
				a.add(37,"Percent sign");
				a.add(38,"Ampersand");
				a.add(39,"Apostrophe");
				a.add(40,"round brackets or parentheses");
				a.add(41,"round brackets or parentheses");
				a.add(42,"Asterisk");
				a.add(43,"Plus sign");
				a.add(44,"Comma");
				a.add(45,"Hyphen");
				a.add(46,"Dot , full stop");
				a.add(47,"Slash");
				a.add(48,"number zero");
				a.add(49,"number one");
				a.add(50,"number two");
				a.add(51,"number three");
				a.add(52,"number four");
				a.add(53,"number five");
				a.add(54,"number six");
				a.add(55,"number seven");
				a.add(56,"number eight");
				a.add(57,"number nine");
				a.add(58,"Colon");
				a.add(59,"Semicolon");
				a.add(60,"Less-than sign");
				a.add(61,"Equals sign");
				a.add(62,"Greater-than sign ; Inequality"); 
				a.add(63,"Question mark");
				a.add(64,"At sign");
				a.add(65,"Capital A");
				a.add(66,"Capital B");
				a.add(67,"Capital C");
				a.add(68,"Capital D");
				a.add(69,"Capital E");
				a.add(70,"Capital F");
				a.add(71,"Capital G");
				a.add(72,"Capital H");
				a.add(73,"Capital I");
				a.add(74,"Capital J");
				a.add(75,"Capital K");
				a.add(76,"Capital L");
				a.add(77,"Capital M");
				a.add(78,"Capital N");
				a.add(79,"Capital O");
				a.add(80,"Capital P");
				a.add(81,"Capital Q");
				a.add(82,"Capital R");
				a.add(83,"Capital S");
				a.add(84,"Capital T");
				a.add(85,"Capital U");
				a.add(86,"Capital V");
				a.add(87,"Capital W");
				a.add(88,"Capital X");
				a.add(89,"Capital Y");
				a.add(90,"Capital Z");
				a.add(91,"square brackets or box brackets");
				a.add(92,"Backslash");
				a.add(93,"square brackets or box brackets");
				a.add(94,"Caret or circumflex accent");
				a.add(95,"underscore , understrike , underbar or low line");
				a.add(96,"Grave accent");
				a.add(97,"Lowercase  a ");
				a.add(98,"Lowercase  b ");
				a.add(99,"Lowercase  c ");
				a.add(100,"Lowercase  d ");
				a.add(101,"Lowercase  e ");
				a.add(102,"Lowercase  f ");
				a.add(103,"Lowercase  g ");
				a.add(104,"Lowercase  h ");
				a.add(105,"Lowercase  i ");
				a.add(106,"Lowercase  j ");
				a.add(107,"Lowercase  k ");
				a.add(108,"Lowercase  l ");
				a.add(109,"Lowercase  m ");
				a.add(110,"Lowercase  n ");
				a.add(111,"Lowercase  o ");
				a.add(112,"Lowercase  p ");
				a.add(113,"Lowercase  q ");
				a.add(114,"Lowercase  r ");
				a.add(115,"Lowercase  s ");
				a.add(116,"Lowercase  t ");
				a.add(117,"Lowercase  u ");
				a.add(118,"Lowercase  v ");
				a.add(119,"Lowercase  w ");
				a.add(120,"Lowercase  x ");
				a.add(121,"Lowercase  y ");
				a.add(122,"Lowercase  z ");
				a.add(123,"curly brackets or braces");
				a.add(124,"vertical-bar, vbar, vertical line or vertical slash");
				a.add(125,"curly brackets or braces");
				a.add(126,"Tilde ; swung dash");
				a.add(127,"Delete");
				a.add(128,"Majuscule C-cedilla");
				a.add(129,"letter \"u\" with umlaut or diaeresis ; \"u-umlaut\"");
				a.add(130,"letter \"e\" with acute accent or \"e-acute\"");
				a.add(131,"letter \"a\" with circumflex accent or \"a-circumflex\"");
				a.add(132,"letter \"a\" with umlaut or diaeresis ; \"a-umlaut\"");
				a.add(133,"letter \"a\" with grave accent");
				a.add(134,"letter \"a\"  with a ring");
				a.add(135,"Minuscule c-cedilla");
				a.add(136,"letter \"e\" with circumflex accent or \"e-circumflex\"");
				a.add(137,"letter \"e\" with umlaut or diaeresis ; \"e-umlaut\"");
				a.add(138,"letter \"e\" with grave accent");
				a.add(139,"letter \"i\" with umlaut or diaeresis ; \"i-umlaut\"");
				a.add(140,"letter \"i\" with circumflex accent or \"i-circumflex\"");
				a.add(141,"letter \"i\" with grave accent");
				a.add(142,"letter \"A\" with umlaut or diaeresis ; \"A-umlaut\"");
				a.add(143,"Capital letter \"A\"  with a ring");
				a.add(144,"Capital letter \"E\" with acute accent or \"E-acute\"");
				a.add(145,"Latin diphthong \"ae\" in lowercase");
				a.add(146,"Latin diphthong \"AE\" in uppercase");
				a.add(147,"letter \"o\" with circumflex accent or \"o-circumflex\"");
				a.add(148,"letter \"o\" with umlaut or diaeresis ; \"o-umlaut\"");
				a.add(149,"letter \"o\" with grave accent");
				a.add(150,"letter \"u\" with circumflex accent or \"u-circumflex\"");
				a.add(151,"letter \"u\" with grave accent");
				a.add(152,"Lowercase letter \"y\" with diaeresis");
				a.add(153,"letter \"O\" with umlaut or diaeresis ; \"O-umlaut\"");
				a.add(154,"letter \"U\" with umlaut or diaeresis ; \"U-umlaut\"");
				a.add(155,"slashed zero or empty set");
				a.add(156,"Pound sign ; symbol for the pound sterling");
				a.add(157,"slashed zero or empty set");
				a.add(158,"multiplication sign");
				a.add(159,"function sign ; f with hook sign ; florin sign ");
				a.add(160,"letter \"a\" with acute accent or \"a-acute\"");
				a.add(161,"letter \"i\" with acute accent or \"i-acute\"");
				a.add(162,"letter \"o\" with acute accent or \"o-acute\"");
				a.add(163,"letter \"u\" with acute accent or \"u-acute\"");
				a.add(164,"letter \"n\" with tilde ; enye");
				a.add(165,"letter \"N\" with tilde ; enye");
				a.add(166,"feminine ordinal indicator");
				a.add(167,"masculine ordinal indicator");
				a.add(168,"Inverted question marks");
				a.add(169,"Registered trademark symbol");
				a.add(170,"Logical negation symbol");
				a.add(171,"One half");
				a.add(172,"Quarter or  one fourth");
				a.add(173,"Inverted exclamation marks");
				a.add(174,"Angle quotes or guillemets");
				a.add(175,"Guillemets or  angle quotes");
				a.add(176,"");
				a.add(177,"");
				a.add(178,"");
				a.add(179,"Box drawing character");
				a.add(180,"Box drawing character");
				a.add(181,"Capital letter \"A\" with acute accent or \"A-acute\"");
				a.add(182,"letter \"A\" with circumflex accent or \"A-circumflex\"");
				a.add(183,"letter \"A\" with grave accent");
				a.add(184,"Copyright symbol");
				a.add(185,"Box drawing character");
				a.add(186,"Box drawing character");
				a.add(187,"Box drawing character");
				a.add(188,"Box drawing character");
				a.add(189,"Cent symbol");
				a.add(190,"YEN and YUAN sign");
				a.add(191,"Box drawing character");
				a.add(192,"Box drawing character");
				a.add(193,"Box drawing character");
				a.add(194,"Box drawing character");
				a.add(195,"Box drawing character");
				a.add(196,"Box drawing character");
				a.add(197,"Box drawing character");
				a.add(198,"Lowercase letter \"a\" with tilde or \"a-tilde\"");
				a.add(199,"Capital letter \"A\" with tilde or \"A-tilde\"");
				a.add(200,"Box drawing character");
				a.add(201,"Box drawing character");
				a.add(202,"Box drawing character");
				a.add(203,"Box drawing character");
				a.add(204,"Box drawing character");
				a.add(205,"Box drawing character");
				a.add(206,"Box drawing character");
				a.add(207,"generic currency sign");
				a.add(208,"Lowercase letter \"eth\"");
				a.add(209,"Capital letter \"Eth\"");
				a.add(210,"letter \"E\" with circumflex accent or \"E-circumflex\"");
				a.add(211,"letter \"E\" with umlaut or diaeresis ; \"E-umlaut\"");
				a.add(212,"letter \"E\" with grave accent");
				a.add(213,"lowercase dot less i");
				a.add(214,"Capital letter \"I\" with acute accent or \"I-acute\"");
				a.add(215,"letter \"I\" with circumflex accent or \"I-circumflex\"");
				a.add(216,"letter \"I\" with umlaut or diaeresis ; \"I-umlaut\"");
				a.add(217,"Box drawing character");
				a.add(218,"Box drawing character");
				a.add(219,"Block");
				a.add(220,"Bottom half block");
				a.add(221,"vertical broken bar");
				a.add(222,"letter \"I\" with grave accent");
				a.add(223,"Top half block");
				a.add(224,"Capital letter \"O\" with acute accent or \"O-acute\"");
				a.add(225,"letter \"Eszett\" ; \"scharfes S\" or \"sharp S\"");
				a.add(226,"letter \"O\" with circumflex accent or \"O-circumflex\"");
				a.add(227,"letter \"O\" with grave accent");
				a.add(228,"letter \"o\" with tilde or \"o-tilde\"");
				a.add(229,"letter \"O\" with tilde or \"O-tilde\"");
				a.add(230,"Lowercase letter \"Mu\" ; micro sign or micron");
				a.add(231,"Lowercase letter \"Thorn\"");
				a.add(232,"Capital letter \"thorn\"");
				a.add(233,"Capital letter \"U\" with acute accent or \"U-acute\"");
				a.add(234,"letter \"U\" with circumflex accent or \"U-circumflex\"");
				a.add(235,"letter \"U\" with grave accent");
				a.add(236,"Lowercase letter \"y\" with acute accent");
				a.add(237,"Capital letter \"Y\" with acute accent");
				a.add(238,"macron symbol");
				a.add(239,"Acute accent");
				a.add(240,"Hyphen");
				a.add(241,"Plus-minus sign");
				a.add(242,"underline or underscore");
				a.add(243,"three quarters");
				a.add(244,"paragraph sign or pilcrow");
				a.add(245,"Section sign");
				a.add(246,"The division sign ; Obelus");
				a.add(247,"cedilla");
				a.add(248,"degree symbol ");
				a.add(249,"Diaeresis");
				a.add(250,"Interpunct or space dot");
				a.add(251,"superscript one");
				a.add(252,"cube or superscript three");
				a.add(253,"Square or superscript two");
				a.add(254,"black square");
				a.add(255,"non-breaking space or no-break space");
				int a1 = event.getVirtualKeyCode();
				
				
				System.out.println(event+" - "+a.get(a1));	
			}
			@Override public void keyReleased(KeyEvent event) 
			{
				
			}
		});
		while(true)
			try { Thread.sleep(100); }
			catch(InterruptedException e) { e.printStackTrace(); }
	}
}