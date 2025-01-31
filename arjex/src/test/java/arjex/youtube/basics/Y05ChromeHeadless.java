/*******************************************************************************
 * Copyright 2015-18 Test Mile Software Testing Pvt Ltd
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

package arjex.youtube.basics;

import arjuna.tpi.Arjuna;
import arjuna.tpi.guiauto.GuiAutomator;
import arjuna.tpi.guiauto.helpers.GuiDriverExtendedConfig;

public class Y05ChromeHeadless{
	
	public static void main (String args[]) throws Exception {
		Arjuna.init();
		
		GuiDriverExtendedConfig exConfig = new GuiDriverExtendedConfig();
		exConfig.browserArg("--headless");

		GuiAutomator automator = Arjuna.createGuiAutomator(Arjuna.getCentralConfig(), exConfig);

		automator.Browser().goToUrl("https://www.google.com");
		System.out.println(automator.MainWindow().getTitle());
		automator.quit();
	}

}
