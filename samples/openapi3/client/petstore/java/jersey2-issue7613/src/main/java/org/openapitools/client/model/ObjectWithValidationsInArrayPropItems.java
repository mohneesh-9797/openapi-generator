/*
 * OpenAPI Petstore
 * sample spec
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * ObjectWithValidationsInArrayPropItems
 */
@JsonPropertyOrder({
  ObjectWithValidationsInArrayPropItems.JSON_PROPERTY_ARRAY_PROP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ObjectWithValidationsInArrayPropItems {
  public static final String JSON_PROPERTY_ARRAY_PROP = "arrayProp";
  private List<Long> arrayProp = null;


  public ObjectWithValidationsInArrayPropItems arrayProp(List<Long> arrayProp) {
    this.arrayProp = arrayProp;
    return this;
  }

  public ObjectWithValidationsInArrayPropItems addArrayPropItem(Long arrayPropItem) {
    if (this.arrayProp == null) {
      this.arrayProp = new ArrayList<>();
    }
    this.arrayProp.add(arrayPropItem);
    return this;
  }

   /**
   * Get arrayProp
   * @return arrayProp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ARRAY_PROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getArrayProp() {
    return arrayProp;
  }


  public void setArrayProp(List<Long> arrayProp) {
    this.arrayProp = arrayProp;
  }


  /**
   * Return true if this ObjectWithValidationsInArrayPropItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectWithValidationsInArrayPropItems objectWithValidationsInArrayPropItems = (ObjectWithValidationsInArrayPropItems) o;
    return Objects.equals(this.arrayProp, objectWithValidationsInArrayPropItems.arrayProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrayProp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectWithValidationsInArrayPropItems {\n");
    sb.append("    arrayProp: ").append(toIndentedString(arrayProp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

