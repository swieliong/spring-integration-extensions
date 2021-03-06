Spring Integration IP Extensions
=================================================

Welcome to the Spring Integration IP Extensions project. It is intended to supplement the spring-integration-ip module with, for example, custom serializers/deserializers.

__There are currently no extensions in this project. The previous experimental WebSocket support has been superceded by the support in spring-messaging.__


# Building

If you encounter out of memory errors during the build, increase available heap and permgen for Gradle:

    GRADLE_OPTS='-XX:MaxPermSize=1024m -Xmx1024m'

To build and install jars into your local Maven cache:

    ./gradlew install

To build api Javadoc (results will be in `build/api`):

    ./gradlew api

To build complete distribution including `-dist` and `-docs` zip files (results will be in `build/distributions`)

    ./gradlew dist

# IDE Support

## Using SpringSource Tool Suite

	Gradle projects can be directly imported into STS

## Using Plain Eclipse

To generate Eclipse metadata (.classpath and .project files), do the following:

    ./gradlew eclipse

Once complete, you may then import the projects into Eclipse as usual:

 *File -> Import -> Existing projects into workspace*

Browse to the *'spring-integration'* root directory. All projects should import free of errors.

## Using IntelliJ IDEA

To generate IDEA metadata (.iml and .ipr files), do the following:

    ./gradlew idea

For more information, please visit the Spring Integration website at:
[https://www.springsource.org/spring-integration](https://www.springsource.org/spring-integration)

