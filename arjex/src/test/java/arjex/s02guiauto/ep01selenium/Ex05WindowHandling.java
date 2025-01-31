/*******************************************************************************
 * Copyright 2015-19 Test Mile Software Testing Pvt Ltd
 * 
 * Website: www.TestMile.com
 * Email: support [at] testmile.com
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package arjex.s02guiauto.ep01selenium;

import org.testng.annotations.Test;

import arjuna.tpi.Arjuna;
import arjuna.tpi.guiauto.GuiAutomator;
import arjuna.tpi.guiauto.component.ChildWindow;
import arjuna.tpi.guiauto.component.MainWindow;

public class Ex05WindowHandling {
	
	@Test
	public void test() throws Exception{
		Arjuna.init();
		GuiAutomator automator = Arjuna.createGuiAutomator();
		
		WPLoginLogout.login(automator);
		
		MainWindow mainWin = automator.MainWindow();
		mainWin.maximize();
		System.out.println(mainWin.getTitle());
		
		automator.executeScript("window.open('/abc')");
		ChildWindow win = automator.LatestChildWindow();
		win.focus();
		System.out.println(win.getTitle());
		win.close();
		
		automator.executeScript("window.open('/def')");
		automator.executeScript("window.open('/xyz')");
		automator.closeAllChildWindows();
		System.out.println(mainWin.getTitle());
		
		WPLoginLogout.logout(automator);
	}

}
