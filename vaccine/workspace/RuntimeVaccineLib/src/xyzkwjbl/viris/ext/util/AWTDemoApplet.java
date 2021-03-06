/*****************************************************************************
 *                                                                           *
 *  This file is part of the BeanShell Java Scripting distribution.          *
 *  Documentation and updates may be found at http://www.beanshell.org/      *
 *                                                                           *
 *  BeanShell is distributed under the terms of the LGPL:                    *
 *  GNU Library Public License http://www.gnu.org/copyleft/lgpl.html         *
 *                                                                           *
 *  Patrick Niemeyer (pat@pat.net)                                           *
 *  Author of Exploring Java, O'Reilly & Associates                          *
 *  http://www.pat.net/~pat/                                                 *
 *                                                                           *
 *****************************************************************************/

package xyzkwjbl.viris.ext.util;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Component;

import xyzkwjbl.viris.ext.ConsoleInterface;
import xyzkwjbl.viris.ext.Interpreter;

/**
	Run bsh as an applet for demo purposes.
*/
public class AWTDemoApplet extends Applet
{
	public void init()
	{
		setLayout(new BorderLayout());
		ConsoleInterface console = new AWTConsole();
		add("Center", (Component)console);
		Interpreter interpreter = new Interpreter( console );
		new Thread(interpreter).start();
	}
}

