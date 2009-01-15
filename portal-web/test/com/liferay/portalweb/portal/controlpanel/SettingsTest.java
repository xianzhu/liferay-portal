/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portalweb.portal.controlpanel;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * <a href="SettingsTest.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class SettingsTest extends BaseTestCase {
	public void testSettings() throws Exception {
		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("link=Settings")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.click(RuntimeVariables.replace("link=Settings"));
		selenium.waitForPageToLoad("30000");

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("_130_legalId")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.typeKeys("_130_legalId", RuntimeVariables.replace("LIFE"));
		selenium.type("_130_legalId", RuntimeVariables.replace("LIFE"));
		selenium.type("_130_sicCode", RuntimeVariables.replace("1234"));
		selenium.type("_130_tickerSymbol", RuntimeVariables.replace("LFRY"));
		selenium.type("_130_industry", RuntimeVariables.replace("Web Portal"));
		selenium.type("_130_type", RuntimeVariables.replace("Open Source"));
		selenium.select("_130_timeZoneId",
			RuntimeVariables.replace("label=(UTC -08:00) Pacific Standard Time"));
		selenium.click(RuntimeVariables.replace("//input[@value='Save']"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isTextPresent(
				"Your request processed successfully."));

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("//input[@value='Add']")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.click(RuntimeVariables.replace("//input[@value='Add']"));
		selenium.waitForPageToLoad("30000");

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("_130_address")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.typeKeys("_130_address",
			RuntimeVariables.replace("Admin@Lifera.com"));
		selenium.type("_130_address",
			RuntimeVariables.replace("Admin@Liferay.com"));
		selenium.select("_130_typeId", RuntimeVariables.replace("label=E-mail"));
		selenium.click("_130_primaryCheckbox");
		selenium.click(RuntimeVariables.replace("//input[@value='Save']"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isTextPresent(
				"Your request processed successfully."));
		assertTrue(selenium.isTextPresent("Admin@Liferay.com"));
		selenium.click("link=Addresses");

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("//div[2]/div[1]/input")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.click(RuntimeVariables.replace("//div[2]/div[1]/input"));
		selenium.waitForPageToLoad("30000");

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("_130_street1")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.typeKeys("_130_street1",
			RuntimeVariables.replace("123. Lifera Ln."));
		selenium.type("_130_street1",
			RuntimeVariables.replace("123. Liferay Ln."));
		selenium.type("_130_city", RuntimeVariables.replace("Diamond Bar"));
		selenium.type("_130_city", RuntimeVariables.replace("Rays of Light"));
		selenium.type("_130_zip", RuntimeVariables.replace("12345"));
		selenium.select("_130_countryId",
			RuntimeVariables.replace("label=United States"));
		Thread.sleep(5000);
		selenium.select("_130_regionId",
			RuntimeVariables.replace("label=California"));
		selenium.select("_130_typeId", RuntimeVariables.replace("label=Billing"));
		selenium.click("_130_mailingCheckbox");
		selenium.click("_130_primaryCheckbox");
		selenium.click(RuntimeVariables.replace("//input[@value='Save']"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isTextPresent(
				"Your request processed successfully."));
		selenium.click("link=Addresses");
		assertTrue(selenium.isTextPresent("Rays of Light"));
		selenium.click("link=Websites");

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("//div[3]/div[1]/input")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.click(RuntimeVariables.replace("//div[3]/div[1]/input"));
		selenium.waitForPageToLoad("30000");

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("_130_url")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.typeKeys("_130_url",
			RuntimeVariables.replace("http://www.lifera.com"));
		selenium.type("_130_url",
			RuntimeVariables.replace("http://www.liferay.com"));
		selenium.select("_130_typeId", RuntimeVariables.replace("label=Public"));
		selenium.click("_130_primaryCheckbox");
		selenium.click(RuntimeVariables.replace("//input[@value='Save']"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isTextPresent(
				"Your request processed successfully."));
		selenium.click("link=Websites");
		assertTrue(selenium.isTextPresent("http://www.liferay.com"));
		selenium.click("link=Phone Numbers");

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("//div[4]/div[1]/input")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.click(RuntimeVariables.replace("//div[4]/div[1]/input"));
		selenium.waitForPageToLoad("30000");

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("_130_number")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.typeKeys("_130_number",
			RuntimeVariables.replace("123-123-1234"));
		selenium.type("_130_number", RuntimeVariables.replace("123-123-1234"));
		selenium.type("_130_extension", RuntimeVariables.replace("123"));
		selenium.select("_130_typeId", RuntimeVariables.replace("label=Other"));
		selenium.click("_130_primaryCheckbox");
		selenium.click(RuntimeVariables.replace("//input[@value='Save']"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isTextPresent(
				"Your request processed successfully."));
		selenium.click("link=Phone Numbers");
		assertTrue(selenium.isTextPresent("1231231234"));
		selenium.click(RuntimeVariables.replace("link=Authentication"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isElementPresent("_130_authType"));
		selenium.click(RuntimeVariables.replace("link=LDAP"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isElementPresent("_130_enabledCheckbox"));
		selenium.click(RuntimeVariables.replace("link=CAS"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isElementPresent("_130_enabledCheckbox"));
		selenium.click(RuntimeVariables.replace("link=NTLM"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isElementPresent("_130_enabledCheckbox"));
		selenium.click(RuntimeVariables.replace("link=OpenID"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isElementPresent("_130_enabledCheckbox"));
		selenium.click(RuntimeVariables.replace("link=Open SSO"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isElementPresent("_130_enabledCheckbox"));
		selenium.click(RuntimeVariables.replace("link=SiteMinder"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isElementPresent("_130_enabledCheckbox"));
		selenium.click(RuntimeVariables.replace(
				"link=Default User Associations"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isElementPresent("_130_defaultGroupNames"));
		assertTrue(selenium.isElementPresent("_130_defaultRoleNames"));
		assertTrue(selenium.isElementPresent("_130_defaultUserGroupNames"));
		selenium.click(RuntimeVariables.replace("link=Reserved Screen Names"));
		selenium.waitForPageToLoad("30000");

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("_130_reservedScreenNames")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.typeKeys("_130_reservedScreenNames",
			RuntimeVariables.replace("Lifera"));
		selenium.type("_130_reservedScreenNames",
			RuntimeVariables.replace("Liferay"));
		selenium.type("_130_reservedEmailAddresses",
			RuntimeVariables.replace("liferay@liferay.com"));
		selenium.click(RuntimeVariables.replace("//input[@value='Save']"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isTextPresent(
				"Your request processed successfully."));
		selenium.click(RuntimeVariables.replace("link=Mail Host Names"));
		selenium.waitForPageToLoad("30000");

		for (int second = 0;; second++) {
			if (second >= 60) {
				fail("timeout");
			}

			try {
				if (selenium.isElementPresent("_130_mailHostNames")) {
					break;
				}
			}
			catch (Exception e) {
			}

			Thread.sleep(1000);
		}

		selenium.typeKeys("_130_mailHostNames",
			RuntimeVariables.replace("rasoflight.com"));
		selenium.type("_130_mailHostNames",
			RuntimeVariables.replace("raysoflight.com"));
		selenium.click(RuntimeVariables.replace("//input[@value='Save']"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isTextPresent(
				"Your request processed successfully."));
		selenium.click(RuntimeVariables.replace("link=Email Notifications"));
		selenium.waitForPageToLoad("30000");
		selenium.click(RuntimeVariables.replace(
				"link=Account Created Notification"));
		selenium.waitForPageToLoad("30000");
		selenium.click(RuntimeVariables.replace(
				"link=Password Changed Notification"));
		selenium.waitForPageToLoad("30000");
	}
}