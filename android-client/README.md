# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.SearchApi;

public class SearchApiExample {

    public static void main(String[] args) {
        SearchApi apiInstance = new SearchApi();
        File file = new File("/path/to/file.txt"); // File | Image file to upload (only support jpg format yet)
        try {
            ImageSearchResponse result = apiInstance.searchImage(file);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SearchApi#searchImage");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://search.stylelens.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*SearchApi* | [**searchImage**](docs/SearchApi.md#searchImage) | **POST** /images | Query to search images


## Documentation for Models

 - [Image](docs/Image.md)
 - [ImageSearchResponse](docs/ImageSearchResponse.md)
 - [ImageSearchResponseData](docs/ImageSearchResponseData.md)
 - [ImagesArray](docs/ImagesArray.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: api_key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

devops@bluehack.net

