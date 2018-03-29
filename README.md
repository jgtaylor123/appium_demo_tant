# UI Tests

UI test automation framework for Phoenix Android and iOS apps based on Appium, TestNG and Maven.

## Usage

### Pre-requisites

Java and Appium must be installed.

Download Java here:
https://java.com/en/download/manual.jsp

Download Appium here:
https://github.com/appium/appium-desktop/releases/latest

### Configure

Define `platrform` system property before executing tests or at run time. The default selection is `android` in the config.properties file.

to modify the platform at runtime in a Jenkins execution shell:
1) simply echo the platform to the config file 
2) overwrite the default testng.xml file with the platform specific file.  This will include only the tests we want to use for the platform under test.
3) create the mvn package

```bash
echo "platform=ios" > src/test/resources/config.properties
cp src/test/resources/testng-ios.xml src/test/resources/testng.xml
./apache-maven-3.5.3/bin/mvn -B clean package -DskipTests=true
```

### Execute tests

Execute tests as follows:

```bash
mvn clean test
```

Or create a mvn test package
```bash
mvn clean package -DskipTests=true
```

## License

The code in this repository, unless otherwise noted, is XYZ licensed. See the LICENSE file in this repository.
