package com.springboot.dynamodb.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "employee")
public class Employee {

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String employeeId;

    @DynamoDBAttribute
    private String firstName;

    @DynamoDBAttribute
    private String lastName;

    @DynamoDBAttribute
    private String emailId;

    @DynamoDBAttribute
    private Department department;
}
