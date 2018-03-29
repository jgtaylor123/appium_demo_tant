# UI Tests

UI test automation framework for Phoenix Android and iOS apps based on Appium, TestNG and Maven.

## Usage

### Pre-requisites

Java, Appium and Maven must be installed.

Download Appium here:
https://github.com/appium/appium-desktop/releases/latest

### Configure

Define `browser` system property before executing tests or at run time. The default selection is `android`.

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
