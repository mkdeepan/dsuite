package com.dairysuite.bootstrap.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-19T02:44:50.512+05:30")

public class Customer   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("customerName")
  private String customerName = null;

  @JsonProperty("alias")
  private String alias = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("route")
  private String route = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("contactNo")
  private Long contactNo = null;

  @JsonProperty("contactNo1")
  private Long contactNo1 = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("pincode")
  private Integer pincode = null;

  @JsonProperty("customerType")
  private String customerType = null;

  @JsonProperty("isActive")
  private Integer isActive = null;

  @JsonProperty("isDelete")
  private Integer isDelete = null;

  @JsonProperty("createdBy")
  private String createdBy = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  @JsonProperty("updatedBy")
  private String updatedBy = null;

  @JsonProperty("updatedAt")
  private String updatedAt = null;
  
  @JsonProperty
  private Users user;

  public Users getUser() {
	return user;
}

public void setUser(Users user) {
	this.user = user;
}

public Customer id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Customer customerName(String customerName) {
    this.customerName = customerName;
    return this;
  }

  /**
   * Get customerName
   * @return customerName
  **/
  @ApiModelProperty(value = "")


  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public Customer alias(String alias) {
    this.alias = alias;
    return this;
  }

  /**
   * Get alias
   * @return alias
  **/
  @ApiModelProperty(value = "")


  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public Customer address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Customer route(String route) {
    this.route = route;
    return this;
  }

  /**
   * Get route
   * @return route
  **/
  @ApiModelProperty(value = "")


  public String getRoute() {
    return route;
  }

  public void setRoute(String route) {
    this.route = route;
  }

  public Customer firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  **/
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Customer lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  **/
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Customer contactNo(Long contactNo) {
    this.contactNo = contactNo;
    return this;
  }

  /**
   * Get contactNo
   * @return contactNo
  **/
  @ApiModelProperty(value = "")


  public Long getContactNo() {
    return contactNo;
  }

  public void setContactNo(Long contactNo) {
    this.contactNo = contactNo;
  }

  public Customer contactNo1(Long contactNo1) {
    this.contactNo1 = contactNo1;
    return this;
  }

  /**
   * Get contactNo1
   * @return contactNo1
  **/
  @ApiModelProperty(value = "")


  public Long getContactNo1() {
    return contactNo1;
  }

  public void setContactNo1(Long contactNo1) {
    this.contactNo1 = contactNo1;
  }

  public Customer city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  **/
  @ApiModelProperty(value = "")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public Customer pincode(Integer pincode) {
    this.pincode = pincode;
    return this;
  }

  /**
   * Get pincode
   * @return pincode
  **/
  @ApiModelProperty(value = "")


  public Integer getPincode() {
    return pincode;
  }

  public void setPincode(Integer pincode) {
    this.pincode = pincode;
  }

  public Customer customerType(String customerType) {
    this.customerType = customerType;
    return this;
  }

  /**
   * Get customerType
   * @return customerType
  **/
  @ApiModelProperty(value = "")


  public String getCustomerType() {
    return customerType;
  }

  public void setCustomerType(String customerType) {
    this.customerType = customerType;
  }

  public Customer isActive(Integer isActive) {
    this.isActive = isActive;
    return this;
  }

  /**
   * User Status
   * @return isActive
  **/
  @ApiModelProperty(value = "User Status")


  public Integer getIsActive() {
    return isActive;
  }

  public void setIsActive(Integer isActive) {
    this.isActive = isActive;
  }

  public Customer isDelete(Integer isDelete) {
    this.isDelete = isDelete;
    return this;
  }

  /**
   * User Status
   * @return isDelete
  **/
  @ApiModelProperty(value = "User Status")


  public Integer getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(Integer isDelete) {
    this.isDelete = isDelete;
  }

  public Customer createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")


  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Customer createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Customer updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Get updatedBy
   * @return updatedBy
  **/
  @ApiModelProperty(value = "")


  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Customer updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")


  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.id, customer.id) &&
        Objects.equals(this.customerName, customer.customerName) &&
        Objects.equals(this.alias, customer.alias) &&
        Objects.equals(this.address, customer.address) &&
        Objects.equals(this.route, customer.route) &&
        Objects.equals(this.firstName, customer.firstName) &&
        Objects.equals(this.lastName, customer.lastName) &&
        Objects.equals(this.contactNo, customer.contactNo) &&
        Objects.equals(this.contactNo1, customer.contactNo1) &&
        Objects.equals(this.city, customer.city) &&
        Objects.equals(this.pincode, customer.pincode) &&
        Objects.equals(this.customerType, customer.customerType) &&
        Objects.equals(this.isActive, customer.isActive) &&
        Objects.equals(this.isDelete, customer.isDelete) &&
        Objects.equals(this.createdBy, customer.createdBy) &&
        Objects.equals(this.createdAt, customer.createdAt) &&
        Objects.equals(this.updatedBy, customer.updatedBy) &&
        Objects.equals(this.updatedAt, customer.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerName, alias, address, route, firstName, lastName, contactNo, contactNo1, city, pincode, customerType, isActive, isDelete, createdBy, createdAt, updatedBy, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    route: ").append(toIndentedString(route)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    contactNo: ").append(toIndentedString(contactNo)).append("\n");
    sb.append("    contactNo1: ").append(toIndentedString(contactNo1)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    pincode: ").append(toIndentedString(pincode)).append("\n");
    sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    isDelete: ").append(toIndentedString(isDelete)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

