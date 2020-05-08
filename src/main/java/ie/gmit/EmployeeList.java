package ie.gmit;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    List<employees> NewList = new ArrayList<>();

    public void addEmployee(employees employee){


        if(NewList.contains(employee) != false){
            throw new IllegalArgumentException("Employee data already exists");
        }
        else {
            NewList.add(employee);
        }
    }

    public void deleteEmployee(employees employee){

        boolean result = NewList.contains(employee);
        if(result == true){
            NewList.remove(employee);
        }
        else{
            throw new IllegalArgumentException("Employee data does not exist");

        }
    }

    public boolean SearchEmployee (employees employee){

        boolean result = NewList.contains(employee);
        if(result == true){
            return result;
        }
        else{
            throw new IllegalArgumentException("Employee data does not exist");

        }
    }




}