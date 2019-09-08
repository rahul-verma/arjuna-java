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

import arjuna.lib.audit.HardCoded;
import arjuna.tpi.testng.TestNGBaseTest;

public class Y15HardcodedSleep extends TestNGBaseTest{
	
	@Test
	public void test() throws Exception{
		// You are stage 1
		
		// You put a static wait for reasons best known to you at that time or sheer laziness :-)
		Thread.sleep(2000);
		
		// Atleast do this
		HardCoded.sleep("I am being lazy", 2);
		HardCoded.sleep("I don't know what to do.", 2);
		HardCoded.sleep("Temporary fix for 5 years.", 2);
		
	}
	
}
