/*
    This is the Geb configuration file.
    
    See: http://www.gebish.org/manual/current/configuration.html
*/

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.remote.RemoteWebDriver
import org.openqa.selenium.remote.DesiredCapabilities
import org.openqa.selenium.Platform

waiting {
    timeout = 2
}

baseUrl = 'http://localhost:8080'

sauceUsername = System.getProperty('sauce.username')
sauceApiKey = System.getProperty('sauce.apiKey')

driver = { new FirefoxDriver() }
environments {
    
    'windows-ie-8' {

        driver = { 
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer()
            capabilities.setPlatform(Platform.XP)
            capabilities.setVersion("8")

            new RemoteWebDriver(new URL("http://${sauceUsername}:${sauceApiKey}@ondemand.saucelabs.com:80/wd/hub"), capabilities) 
        }
    }

    'windows-ie-9' {

        driver = { 
            DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer()
            capabilities.setCapability('platform', 'Windows 2008')
            capabilities.setVersion('9')

            new RemoteWebDriver(new URL("http://${sauceUsername}:${sauceApiKey}@ondemand.saucelabs.com:80/wd/hub"), capabilities) 
        }
    }

}
