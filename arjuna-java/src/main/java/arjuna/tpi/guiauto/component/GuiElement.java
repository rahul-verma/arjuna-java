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

package arjuna.tpi.guiauto.component;

import arjuna.client.core.connector.SetuManagedObject;
import arjuna.client.guiauto.component.SourceInquirable;
import arjuna.tpi.guiauto.helpers.GuiActionConfig;

public interface GuiElement extends SetuManagedObject, SourceInquirable{
	
	void enterText(String text) throws Exception;

	void setText(String text) throws Exception;

	void click() throws Exception;

	void waitUntilPresent() throws Exception;
	
	void waitUntilVisible() throws Exception;
	
	void waitUntilClickable() throws Exception;

	void check() throws Exception;
	
	void uncheck() throws Exception;
	
	void identify() throws Exception;
	
	GuiElement configure(GuiActionConfig config) throws Exception;
	
}