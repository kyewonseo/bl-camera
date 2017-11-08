# SearchApi

All URIs are relative to *http://search.stylelens.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**searchImage**](SearchApi.md#searchImage) | **POST** /images | Query to search images


<a name="searchImage"></a>
# **searchImage**
> ImageSearchResponse searchImage(file)

Query to search images



### Example
```java
// Import classes:
//import io.swagger.client.api.SearchApi;

SearchApi apiInstance = new SearchApi();
File file = new File("/path/to/file.txt"); // File | Image file to upload (only support jpg format yet)
try {
    ImageSearchResponse result = apiInstance.searchImage(file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SearchApi#searchImage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**| Image file to upload (only support jpg format yet) | [optional]

### Return type

[**ImageSearchResponse**](ImageSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

