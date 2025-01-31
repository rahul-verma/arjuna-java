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

package arjex.youtube.scheduled;

import org.testng.annotations.Test;

import arjuna.tpi.Arjuna;
import arjuna.tpi.guiauto.GuiAutomator;
import arjuna.tpi.guiauto.component.GuiElement;
import arjuna.tpi.guiauto.helpers.With;
import arjuna.tpi.testengine.TestNGBaseTest;

public class Y11ElementIdentificationUsingXPath extends TestNGBaseTest{
	
	@Test
	public void test() throws Exception{
		GuiAutomator automator = Arjuna.createGuiAutomator(this.getTestContext().getConfig());
		automator.Browser().goToUrl(automator.getConfig().getUserOptionValue("wp.login.url").asString());
		
		// Based on Text
		GuiElement element = automator.Element(With.xpath("//*[text() = 'Lost your password?']"));
		element.identify();
		System.out.println(element.Source().getRootContent());
		
		// Based on partial text
		element = automator.Element(With.xpath("//*[contains(text(), 'Lost')]"));
		element.identify();
		System.out.println(element.Source().getRootContent());
	
		// Based on Title
		element = automator.Element(With.xpath("//*[@title = 'Password Lost and Found']"));
		element.identify();
		System.out.println(element.Source().getRootContent());
		
		// Based on Value
		element = automator.Element(With.xpath("//*[@value = 'Log In']"));
		element.identify();
		System.out.println(element.Source().getRootContent());
		
		// Based on any attribute e.g. for
		element = automator.Element(With.xpath("//*[@for = 'user_login']"));
		element.identify();
		System.out.println(element.Source().getRootContent());
		
		// Based on partial content of an attribute
		element = automator.Element(With.xpath("//*[contains(@for, '_login')]"));
		element.identify();
		System.out.println(element.Source().getRootContent());
		
		// Based on element type
		element = automator.Element(With.xpath("//*[@type ='password']"));
		element.identify();
		System.out.println(element.Source().getRootContent());

		automator.quit();
	}
	
}
